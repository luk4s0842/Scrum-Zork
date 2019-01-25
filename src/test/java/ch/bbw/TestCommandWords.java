package ch.bbw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ch.bbw.zork.Command;
import ch.bbw.zork.CommandWords;

public class TestCommandWords {
private CommandWords commandWords;
	
	@Before
	public void before() {
		commandWords = new CommandWords();
	}
	
	@Test
	public void testIsCommand() {

		String showCmds = commandWords.showAll();
		String [] cmds = showCmds.split("  ");
		for (String cmd : cmds) {
			assertTrue(commandWords.isCommand(cmd));
		}
		
	}
	
	@Test
	public void testIsNotCommand() {
		assertFalse(commandWords.isCommand("Test"));
	}
	
	@Test
	public void testShowAll(){
		assertEquals(commandWords.showAll(),"go  quit  help  back  get  put  backpack  map  ask  ");
	}
	
}
