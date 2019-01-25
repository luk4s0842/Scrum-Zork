package ch.bbw;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import ch.bbw.zork.Room;

public class TestRoom {
private Room mainRoom;
	
	@Before
	public void before() {
		mainRoom = new Room("Main room");
		
	}

	@Test
	public void testExits() {
		Room room1 = Mockito.mock(Room.class);
		mainRoom.setExits(room1, room1, room1, room1);
		assertEquals(mainRoom.nextRoom("north"), room1);
		assertEquals(mainRoom.nextRoom("east"), room1);
		assertEquals(mainRoom.nextRoom("west"), room1);
		assertEquals(mainRoom.nextRoom("south"), room1);
	}

}
