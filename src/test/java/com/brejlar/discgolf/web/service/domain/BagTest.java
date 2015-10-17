package com.brejlar.discgolf.web.service.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.brejlar.discgolf.web.service.envm.Archetype;

public class BagTest {

	@Test
	public void test() {
		Bag bag = new Bag();
		
		Disc disc0 = new Disc(Archetype.DRIVER);
		Disc disc1 = new Disc(Archetype.MIDRANGE);
		
		bag.addDisc(disc0);
		bag.addDisc(disc1);
		
		assertTrue(bag.getDiscs().contains(disc0));
		assertTrue(bag.getDiscs().contains(disc1));
	}
	
	@Test
	public void testToJson() {
		Bag bag = new Bag();
		
		Disc disc0 = new Disc(Archetype.DRIVER);
		Disc disc1 = new Disc(Archetype.MIDRANGE);
		
		bag.addDisc(disc0);
		bag.addDisc(disc1);
		System.out.println(bag.toJson());
	}
	
}
