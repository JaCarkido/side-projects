package com.techelevator.matchmodel;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcMatchDao implements MatchDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcMatchDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Match> getAllMatches(String wrestlerId) {
		Long id = Long.parseLong(wrestlerId);
		List<Match> matchList = new ArrayList<>();
		String sqlSelectAllMatches = "SELECT opponent, outcome, home_score, opponent_score, opponent_school, m.weight_class AS weight_class, event, match_date, match_id " + 
				"FROM matches m " + 
				"  INNER JOIN wrestler w " + 
				"  ON m.wrestler_id = w.wrestler_id " + 
				"WHERE w.wrestler_id = ? "; 
									   
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllMatches, id);
		while(results.next()) {
			Match newMatch = mapRowToMatch(results);
			matchList.add(newMatch);
		}
		return matchList;
	}

	@Override
	public Match getOneMatch(String matchId) {
		Long id = Long.parseLong(matchId);
		String sqlSelectOneMatch = "SELECT * FROM matches WHERE match_id = ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlSelectOneMatch, id);
		result.next();
		Match aMatch = mapRowToMatch(result);
		
		return aMatch;
	}


	@Override
	public Match mapRowToMatch(SqlRowSet results) {
		
		Match mappedMatch = new Match();
		mappedMatch.setId(results.getLong("match_id"));
		mappedMatch.setOpponentName(results.getString("opponent"));
		mappedMatch.setOpponentSchool(results.getString("opponent_school"));
		mappedMatch.setOpponentScore(results.getInt("opponent_score"));
		mappedMatch.setOutcome(results.getString("outcome"));
		mappedMatch.setWeightClass(results.getInt("weight_class"));
		mappedMatch.setHomeScore(results.getInt("home_score"));
		mappedMatch.setEvent(results.getString("event"));
		mappedMatch.setDateSubmitted(results.getTimestamp("match_date").toLocalDateTime());
		
		return mappedMatch;
	}
	
	
//i may need a save that takes a wrestler and a match
//probably just need a save that takes a Match match parameter using wrestler id to save the data
	
	@Override
	public void save(Match match) {
		Long id = getNextId(); //this will be used when submitting new matches to the database
		match.setId(id);
		// This SQL statement needs updated 
		String sqlInsertReview = "INSERT INTO match(match_id, opponent, opponent_school, opponent_score, outcome,"
				+ " weight_class, , home_score, score_sequence, event) VALUES (?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sqlInsertReview, id, match.getOpponentName(), match.getOpponentSchool(), match.getOpponentScore(),
				match.getOutcome(), match.getWeightClass(), match.getHomeScore(), match.getScoreSequence(), match.getEvent());
		
	}

	
//  NOTE TO SELF: i can make a form to edit data on the table ---> have it set the example in the form as the data for each field using session request	
	
	
	
	private Long getNextId() {
		String sqlSelectNextId = "SELECT NEXTVAL('match_id')";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectNextId);
		Long id = null;
		if(results.next()) {
			id = results.getLong(1);
		} else {
			throw new RuntimeException("Something strange happened, unable to select next forum post match_id from sequence");
		}
		return id;
	}
	


}
