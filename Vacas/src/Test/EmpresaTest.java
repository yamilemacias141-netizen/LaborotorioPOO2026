package Test;
import Modelo.Empresa;
import Modelo.Tambo;
import Modelo.Vaca;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelo.Raza;

class EmpresaTest {

	@Test
	void produccionRecaudadaTest_valorEsperado() 
	{
		Empresa empresa = new Empresa();
		Vaca v1 = new Vaca(25 , Raza.DE_PROPAGANDA);
		Vaca v2 = new Vaca(20 , Raza.PASTOREO_LIGERO);
		
		Tambo t1 = new Tambo();
		Tambo t2 = new Tambo();
		
		t1.agregarVaca(v1);
		t2.agregarVaca(v2);
		
		empresa.agregarTambo(t1);
		empresa.agregarTambo(t2);
		int resultadoT1 = 25 * 1;
		int resultadoT2 = 20 * 2;
		
		int valorEsperado = resultadoT1 + resultadoT2;
		assertEquals(valorEsperado , empresa.produccionRecaudada());
		
	}

}
