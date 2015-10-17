package com.brejlar.discgolf.web.service.envm;

public enum Archetype {

	DRIVER("driver"),
	MIDRANGE("midrange"),
	PUTTER("putter");
	
	String value;
	
	Archetype(String value) {
		this.value = value;
	}
}
