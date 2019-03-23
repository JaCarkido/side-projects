package com.techelevator.wrestlermodel;

import java.util.List;

public interface WrestlerDao {

	public List<Wrestler> getAllWrestlers();
	public void save(Wrestler post);
	public Wrestler getOneWrestler(String wrestlerId);
}
