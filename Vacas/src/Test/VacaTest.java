package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelo.Raza;
import Modelo.Vaca;
class VacaTest {

	
	
	@Test
	void cantidadLecheTest_valorEsperado()
	{
		Vaca vaca = new Vaca(29 , Raza.DE_PROPAGANDA);
		
		int valorEsperado = 29*1;
		assertEquals(valorEsperado , vaca.cantidadLeche());
	}

}
