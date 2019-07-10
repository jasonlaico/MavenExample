package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.first.StringOperation;

public class TestString {

	@Test
	public void testConcat() {
		StringOperation so = new StringOperation();
		String actual= so.concat("5","5");
		String expected="55";
		assertEquals(expected, actual);
	}
	@Test

	public void testLength() {
		StringOperation so = new StringOperation();
		String actual= so.Length ("bee");
		String expected=4;
		assertEquals(expected, actual);
	}
	@Test

	public void testContains() {
		StringOperation so = new StringOperation();
		String actual= so.Contains ("bee","e");
		String expected=true;
		assertEquals(expected, actual);
	}
