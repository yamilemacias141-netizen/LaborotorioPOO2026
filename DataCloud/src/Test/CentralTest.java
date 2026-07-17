package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Modelo.Disco;
import Modelo.Nodo;
import Modelo.TipoDisco;
import Modelo.Centro;
import java.util.ArrayList;

class CentroTest {

	@Test
	void NodosCriticosTest_valorEsperado() 
	{
		Disco disco1 = new Disco(4, TipoDisco.M2, 60);
		Disco disco2 = new Disco(7, TipoDisco.SATA_HDD, 4);
		Nodo nodo1 = new Nodo(10, disco1);
		Nodo nodo2 = new Nodo(13, disco2);
		Centro centro = new Centro();
		centro.agregarNodo(nodo1);
		centro.agregarNodo(nodo2);
		ArrayList<Nodo> valorObtenido = centro.nodosCriticos();
		assertEquals(nodo2, valorObtenido.get(0));
	}
	
	@Test
	void elNodoMasRapidoTest_valorEsperado() 
	{
		Disco disco1 = new Disco(4, TipoDisco.M2, 60);
		Disco disco2 = new Disco(6, TipoDisco.SATA_HDD, 40);
		Nodo nodo1 = new Nodo(10, disco1);
		Nodo nodo2 = new Nodo(10, disco2);
		Centro centro = new Centro();
		centro.agregarNodo(nodo1);
		centro.agregarNodo(nodo2);
		assertEquals(nodo1, centro.elNodoMasRapido());
	}
	
	@Test
	void consumoTotalTest_valorEsperado() 
	{
		Disco disco1 = new Disco(4, TipoDisco.M2, 1);
		Disco disco2 = new Disco(6, TipoDisco.SATA_HDD, 1);
		Nodo nodo1 = new Nodo(1, disco1);
		Nodo nodo2 = new Nodo(1, disco2);
		Centro centro = new Centro();
		centro.agregarNodo(nodo1);
		centro.agregarNodo(nodo2);
		assertEquals(5.0, centro.consumoTotal());
	}
	

}
