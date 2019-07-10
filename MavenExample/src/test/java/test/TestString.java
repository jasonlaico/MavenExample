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
	int actual= so.Length("bee");
		int expected=3;
		assertEquals(expected, actual);
	}
	@Test

	public void testContains() {
		StringOperation so = new StringOperation();
		boolean actual= so.Contains ("bee","e");
		boolean expected=true;
		assertEquals(expected, actual);
	}
}
