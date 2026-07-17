package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Modelo.Fauna;
class FaunaTest {

	@Test
	void estaEnPeligroTest_true() 
	{
		Fauna fauna = new Fauna(1 , 3500000);
		
		assertEquals(true , fauna.estaEnPeligro());
	}

}
