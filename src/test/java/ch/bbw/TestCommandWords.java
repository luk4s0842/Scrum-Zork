package ch.bbw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import ch.bbw.zork.Command;

public class TestCommandWords {
private Command cmd1;
	
	@Before
	public void before() {
		cmd1 = new Command("ds", null);
	}
	
	@Test
	public void testConstructor() {
		assertEquals(cmd1.getCommandWord(), "ds");
	}
	
	@Test
	public void testIsCommand() {
		assertFalse(cmd1.isUnknown());
		
	}
	
	@Test
	public void testShowAll() {
		assertEquals(cmd1.getCommandWord(), "ds");
		
	}

}
