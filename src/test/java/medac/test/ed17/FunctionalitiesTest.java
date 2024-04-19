package medac.test.ed17;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import medac.ed17.Functionalities;

public class FunctionalitiesTest {
	Functionalities func = new Functionalities();

	@Test
	void testGetSuma() {
		assertEquals(6, func.getSuma(3, 3));
	}
	
}
