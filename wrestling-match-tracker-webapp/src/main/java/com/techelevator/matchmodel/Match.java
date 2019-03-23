package com.techelevator.matchmodel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Match {
	private Long id;
	private int homeScore;
	private int opponentScore;
	private String outcome;
	private String scoreSequence;
	private String opponentSchool;
	private String opponentName;
	private String event;
	private int weightClass;
	private LocalDateTime matchDate;
	
	/**
	 * @return the matchDate
	 */
	public LocalDateTime getMatchDate() {
		return matchDate;
	}
	/**
	 * @param matchDate the matchDate to set
	 */
	public void setMatchDate(LocalDateTime matchDate) {
		this.matchDate = matchDate;
	}
	/**
	 * @return the weightClass
	 */
	public int getWeightClass() {
		return weightClass;
	}
	/**
	 * @param weightClass the weightClass to set
	 */
	public void setWeightClass(int weightClass) {
		this.weightClass = weightClass;
	}
	private LocalDateTime dateSubmitted;
	private String formattedDate;
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the homeScore
	 */
	public int getHomeScore() {
		return homeScore;
	}
	/**
	 * @param l the homeScore to set
	 */
	public void setHomeScore(int score) {
		this.homeScore = score;
	}
	/**
	 * @return the opponentScore
	 */
	public int getOpponentScore() {
		return opponentScore;
	}
	/**
	 * @param opponentScore the opponentScore to set
	 */
	public void setOpponentScore(int opponentScore) {
		this.opponentScore = opponentScore;
	}
	/**
	 * @return the outcome
	 */
	public String getOutcome() {
		return outcome;
	}
	/**
	 * @param outcome the outcome to set
	 */
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}
	/**
	 * @return the scoreSequence
	 */
	public String getScoreSequence() {
		return scoreSequence;
	}
	/**
	 * @param scoreSequence the scoreSequence to set
	 */
	public void setScoreSequence(String scoreSequence) {
		this.scoreSequence = scoreSequence;
	}
	/**
	 * @return the opponentSchool
	 */
	public String getOpponentSchool() {
		return opponentSchool;
	}
	/**
	 * @param opponentSchool the opponentSchool to set
	 */
	public void setOpponentSchool(String opponentSchool) {
		this.opponentSchool = opponentSchool;
	}
	/**
	 * @return the opponent
	 */
	public String getOpponentName() {
		return opponentName;
	}
	/**
	 * @param opponent the opponent to set
	 */
	public void setOpponentName(String opponentName) {
		this.opponentName = opponentName;
	}
	/**
	 * @return the event
	 */
	public String getEvent() {
		return event;
	}
	/**
	 * @param event the event to set
	 */
	public void setEvent(String event) {
		this.event = event;
	}
	/**
	 * @param formattedDate the formattedDate to set
	 */
	public void setFormattedDate(String formattedDate) {
		this.formattedDate = formattedDate;
	}
	public LocalDateTime getDateSubmitted() {
		return dateSubmitted;
		
	}
	public String getFormattedDate() {
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("MM-dd-yyyy");
		formattedDate = getDateSubmitted().format(formatter);
		//formattedDate = formattedDate.replaceAll("-", "/");
		return formattedDate;
	}
	public void setDateSubmitted(LocalDateTime dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}
}
