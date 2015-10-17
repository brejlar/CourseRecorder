package com.brejlar.discgolf.web.service.domain;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Bag {

	List<Disc> discs;
	
	public List<Disc> getDiscs() {
		if(discs == null) {
			discs = new ArrayList<Disc>();
		}
		
		return discs;
	}
	
	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}
	
	public void addDisc(Disc disc) {
		getDiscs().add(disc);
	}
	
}
