package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.EdgeOfTheOcean;

public class ShapeAreaTest {

	private EdgeOfTheOcean eoto;
		
	@Before
	public void setup() {
		eoto = new EdgeOfTheOcean();
	}
	
	@Test
	public void test1() {
		assertEquals(5, eoto.shapeArea(3));
	}
}
