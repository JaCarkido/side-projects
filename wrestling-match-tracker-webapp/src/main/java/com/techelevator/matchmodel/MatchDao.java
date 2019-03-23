package com.techelevator.matchmodel;

import java.util.List;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public interface MatchDao {

	public void save(Match match);
	List<Match> getAllMatches(String wrestlerId);
	Match mapRowToMatch(SqlRowSet results);
	public Match getOneMatch(String matchId);
}
