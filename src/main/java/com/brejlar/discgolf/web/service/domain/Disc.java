package com.brejlar.discgolf.web.service.domain;

import com.brejlar.discgolf.web.service.envm.Archetype;

public class Disc {
	
	private Archetype archetype;
	
	public Disc(Archetype archetype) {
		this.archetype = archetype;
	}

	public Archetype getArchetype() {
		return archetype;
	}

	public void setArchetype(Archetype archetype) {
		this.archetype = archetype;
	}
	
}
