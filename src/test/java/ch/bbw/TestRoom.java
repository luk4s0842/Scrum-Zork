package ch.bbw;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import ch.bbw.zork.Item;
import ch.bbw.zork.Room;

public class TestRoom {
private Room testRoom1;
private Room testRoom2;
private Room room1 = Mockito.mock(Room.class);
private Item item = new Item();
	
	@Before
	public void before() {
		testRoom1 = new Room("Test room 1");
		testRoom1.setDescription("test room!");
		testRoom1.setExits(room1, room1, room1, room1);
		item.setName("item");
		testRoom1.addItem(item);
		
		testRoom2 = new Room("Test room 2");
		testRoom2.setExits(null, null, null, null);
		
	}

	@Test
	public void testExits1() {
		assertEquals(testRoom1.nextRoom("north"), room1);
		assertEquals(testRoom1.nextRoom("east"), room1);
		assertEquals(testRoom1.nextRoom("south"), room1);
		assertEquals(testRoom1.nextRoom("west"), room1);
	}
	
	@Test
	public void testExits2() {
		assertEquals(testRoom2.nextRoom("north"), null);
		assertEquals(testRoom2.nextRoom("east"), null);
		assertEquals(testRoom2.nextRoom("south"), null);
		assertEquals(testRoom2.nextRoom("west"), null);
	}

	@Test
	public void testShortDescription() {
		assertEquals(testRoom1.shortDescription(), "test room!");

	}
	
//	@Test
//	public void testLongDescription() {
//		assertEquals(testRoom1.longDescription(), 
//				"You are in the test room!.\r\n" + 
//				"Items in this room: item" +
//				"Exits: north east south west");
//
//	}
	
	

}
