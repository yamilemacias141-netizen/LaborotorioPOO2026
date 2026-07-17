package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Modelo.Disco;
import Modelo.Nodo;
import Modelo.TipoDisco;

class NodoTest {

	@Test
	void estaCriticoTest_false() 
	{
		Disco disco = new Disco(4, TipoDisco.M2, 60);
		Nodo nodo = new Nodo(10, disco);
		assertEquals(false, nodo.estaCritico());
	}
	@Test
	void suConsumoTest_valorEsperado() 
	{
		Disco disco = new Disco(4, TipoDisco.M2, 0);
		Nodo nodo = new Nodo(1, disco);
		assertEquals(1.5, nodo.suConsumo());
	}

}





