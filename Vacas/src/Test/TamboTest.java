package Test;
import Modelo.Raza;
import Modelo.Tambo;
import Modelo.Vaca;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TamboTest {

	@Test
	void capacidadTest_valorEsperado() 
	{
		Tambo tambo = new Tambo(20);
		int valorEsperado = 20 /2;
		
		assertEquals(valorEsperado , tambo.getCapacidad());
		
	}
	
	@Test
	void cantidadLecheTamboTest_valorEsperado()
	{
		Tambo tambo = new Tambo();
		Vaca v1 = new Vaca(25 , Raza.DE_PROPAGANDA);
		Vaca v2 = new Vaca(20 , Raza.PASTOREO_LIGERO);
		
		tambo.agregarVaca(v1);
		tambo.agregarVaca(v2);
		
		int resultadoT1 = 25 * 1;
		int resultadoT2 = 20 * 2;
		int valorEsperado = resultadoT1 + resultadoT2;
		assertEquals(valorEsperado , tambo.cantidadLecheTambo());
	}
	
	@Test
	void vacaMasProductoraTest_valorEsperado()
	{
		Tambo tambo = new Tambo();
		Vaca v1 = new Vaca(25 , Raza.DE_PROPAGANDA);
		Vaca v2 = new Vaca(20 , Raza.PASTOREO_LIGERO);
		
		tambo.agregarVaca(v1);
		tambo.agregarVaca(v2);
		Vaca valorEsperado = v2;
		assertEquals(valorEsperado , tambo.vacaMasProductora());
		
	}

}
