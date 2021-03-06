import static org.junit.Assert.*;
import org.junit.Test;

//import java.util.*;
import java.io.*;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {
	double inf = Double.POSITIVE_INFINITY;
	double max = Double.MAX_VALUE;
	
	//Test the main() method
	
	@Test
	public void test_main_1() {
		String input = "5\n12\n13";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args = {};
		Demo.main(args);
		
		String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
		consoleOutput += "This is a triangle." + System.getProperty("line.separator");
		
		assertEquals(consoleOutput, out.toString());
	}
	
	@Test
	public void test_main_2() {
		String input = "5\n12\n18";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args = {};
		Demo.main(args);
		
		String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
		consoleOutput += "This is not a triangle." + System.getProperty("line.separator");
		
		assertEquals(consoleOutput, out.toString());
	}
	
	@Test
	public void test_main_zero_input_1() {
		String input = "0\n12\n18";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args = {};
		Demo.main(args);
		
		String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
		consoleOutput += "This is not a triangle." + System.getProperty("line.separator");
		
		assertEquals(consoleOutput, out.toString());
	}

//	Test the isTriangle() method

	@Test
	public void test_is_triangle_1() {
		assertTrue(Demo.isTriangle(3, 4, 5));
	}
	
	@Test
	public void test_is_triangle_2() {
		assertTrue(Demo.isTriangle(3, 5, 4));
	}
	
	@Test
	public void test_is_triangle_3() {
		assertTrue(Demo.isTriangle(4, 3, 5));
	}
	
	@Test
	public void test_is_triangle_4() {
		assertTrue(Demo.isTriangle(4, 5, 3));
	}
	
	@Test
	public void test_is_triangle_5() {
		assertTrue(Demo.isTriangle(5, 3, 4));
	}
	
	@Test
	public void test_is_triangle_6() {
		assertTrue(Demo.isTriangle(5, 4, 3));
	}
	
	@Test
	public void test_is_NOT_triangle_1() {
		assertFalse(Demo.isTriangle(3, 4, 8));
	}
	
	@Test
	public void test_is_NOT_triangle_2() {
		assertFalse(Demo.isTriangle(3, 8, 4));
	}
	
	@Test
	public void test_is_NOT_triangle_3() {
		assertFalse(Demo.isTriangle(4, 3, 8));
	}
	
	@Test
	public void test_is_NOT_triangle_4() {
		assertFalse(Demo.isTriangle(4, 8, 3));
	}
	
	@Test
	public void test_is_NOT_triangle_5() {
		assertFalse(Demo.isTriangle(8, 3, 4));
	}
	
	@Test
	public void test_is_NOT_triangle_6() {
		assertFalse(Demo.isTriangle(8, 4, 3));
	}
	
	@Test
	public void test_is_NOT_triangle_double_1() {
		assertFalse(Demo.isTriangle(0.8, 0.4, 0.3));
	}
	
	@Test
	public void test_is_NOT_triangle_double_2() {
		assertFalse(Demo.isTriangle(0.000000008, 0.004, 0.33333333333333333333333));
	}
	
	@Test
	public void test_is_NOT_triangle_01() {
		assertFalse(Demo.isTriangle(0, 4, 3));
	}
	
	@Test
	public void test_is_NOT_triangle_02() {
		assertFalse(Demo.isTriangle(5, 0, 3));
	}
	
	@Test
	public void test_is_NOT_triangle_03() {
		assertFalse(Demo.isTriangle(5, 4, 0));
	}
	
	@Test
	public void test_is_NOT_triangle_negative_1() {
		assertFalse(Demo.isTriangle(-5, 4, 3));
	}
	
}
