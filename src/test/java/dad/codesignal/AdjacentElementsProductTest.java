package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.EdgeOfTheOcean;


public class AdjacentElementsProductTest {
	
	private EdgeOfTheOcean eoto;
	
	@Before
	public void setup() {
		eoto = new EdgeOfTheOcean();
	}
	
	@Test
	public void test1() {
		int[] numberArray1 = {3, 4, 7, 2, -5};
		assertEquals(5, eoto.adjacentElementsProduct(numberArray1));
	}
	
}
