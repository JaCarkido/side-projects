package com.techelevator.wrestlermodel;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcWrestlerDao implements WrestlerDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcWrestlerDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public Wrestler getOneWrestler(String wrestlerId) {
		Wrestler aWrestler = new Wrestler();
		Long id = Long.parseLong(wrestlerId);
		String sqlSelectOneWrestler = "SELECT first_name, last_name FROM wrestler WHERE wrestler_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectOneWrestler, id);
		while(results.next()){
			aWrestler.setFirstName(results.getString("first_name"));
			aWrestler.setLastName(results.getString("last_name"));
		}
		return aWrestler;
		
	}

	
	@Override
	public List<Wrestler> getAllWrestlers() {
		List<Wrestler> allWrestlers = new ArrayList<>();
		String sqlSelectAllWrestlers = "SELECT * FROM wrestler ORDER BY weight_class"; 
									   
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllWrestlers);
		while(results.next()) {
			Wrestler someWrestler = new Wrestler();
			someWrestler.setId(results.getLong("wrestler_id"));
			someWrestler.setFirstName(results.getString("first_name"));
			someWrestler.setLastName(results.getString("last_name"));
			someWrestler.setGrade(results.getString("grade"));
			someWrestler.setWeightClass(results.getInt("weight_class"));
//			someWrestler.setDateSubmitted(results.getTimestamp("submit_date").toLocalDateTime());
			allWrestlers.add(someWrestler);
		}
		return allWrestlers;
	}

	@Override
	public void save(Wrestler wrestler) {
		Long id = getNextId();
		String sqlInsertReview = "INSERT INTO wrestler(wrestler_id, first_name, last_name, grade, weight_class, submit_date) VALUES (?,?,?,?,?,?)";
		jdbcTemplate.update(sqlInsertReview, id, wrestler.getFirstName(), wrestler.getLastName(), wrestler.getGrade(), wrestler.getWeightClass(), wrestler.getDateSubmitted());
		wrestler.setId(id);
	}

	private Long getNextId() {
		String sqlSelectNextId = "SELECT NEXTVAL('id')";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectNextId);
		Long id = null;
		if(results.next()) {
			id = results.getLong(1);
		} else {
			throw new RuntimeException("Something strange happened, unable to select next forum post id from sequence");
		}
		return id;
	}


}
