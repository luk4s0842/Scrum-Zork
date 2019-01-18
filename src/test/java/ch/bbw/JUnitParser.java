package ch.bbw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;

import ch.bbw.zork.Command;
import ch.bbw.zork.Parser;

public class JUnitParser {
	private Parser parser1;
	private Parser parser2;
	private Parser parser3;
	
	@Before
	public void before() {
		String cmd1 = "go west";
		String cmd2 = "quit";
		String cmd3	= "  ";
		InputStream inputStream1;
		InputStream inputStream2;
		InputStream inputStream3;
		try {
			inputStream1 = new ByteArrayInputStream(cmd1.getBytes("UTF-8"));
			parser1 = new Parser(inputStream1);
			inputStream2 = new ByteArrayInputStream(cmd2.getBytes("UTF-8"));
			parser2 = new Parser(inputStream2);
			inputStream3 = new ByteArrayInputStream(cmd3.getBytes("UTF-8"));
			parser3 = new Parser(inputStream3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	
	}
	

	@Test
	public void testCommandConstructor1() {
		Command cmd1 = parser1.getCommand();
		assertEquals(cmd1.getCommandWord(), "go");
		assertEquals(cmd1.getSecondWord(), "west");

	}
	
	@Test
	public void testCommandConstructor2() {
		Command cmd2 = parser2.getCommand();
		assertEquals(cmd2.getCommandWord(), "quit");
		assertEquals(cmd2.getSecondWord(), null);
	}
	
	@Test
	public void testConstructor3() {
		Command cmd3 = parser3.getCommand();
		assertEquals(cmd3.getCommandWord(), null);
		assertEquals(cmd3.getSecondWord(), null);
		
	}
	
	@Test
	public void testCommandUnknown() {
		Command cmd1 = parser1.getCommand();
		Command cmd2 = parser2.getCommand();
		assertFalse(cmd1.isUnknown());
		assertFalse(cmd2.isUnknown());
	}
	
	@Test
	public void testCommandSecondWord() {
		Command cmd1 = parser1.getCommand();
		Command cmd2 = parser2.getCommand();
		assertTrue(cmd1.hasSecondWord());
		assertFalse(cmd2.hasSecondWord());
	}
	
	@Test 
	public void testCommandMethods() {
		Command cmd3 = parser3.getCommand();
		assertTrue(cmd3.isUnknown());
		assertFalse(cmd3.hasSecondWord());
	}
	
}
