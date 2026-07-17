package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Modelo.Mundo;
import Modelo.Personaje;

import java.util.ArrayList;
class MundoTest {

	@Test
	void cuantosPersonajesLindos() 
	{
		Mundo mundo = new Mundo();
		Personaje barbie = new Personaje();
		Personaje ken = new Personaje ();
		
		barbie.setUbicacion(-5);
		barbie.setLocura(90);
		
		ken.setLocura(1);
		ken.setSecreto(500);
		
		mundo.agregarPersonajes(ken);
		mundo.agregarPersonajes(barbie);
		assertEquals(1 , mundo.cuantosPersonajesLindos());
		
		
	}
	
	@Test
	void personajesNormales()
	{
		Mundo mundo = new Mundo();
		Personaje barbie = new Personaje();
		Personaje ken = new Personaje ();
		
		barbie.setUbicacion(-5);
		barbie.setLocura(90);
		
		ken.setLocura(1);
		ken.setSecreto(500);
		
		mundo.agregarPersonajes(ken);
		mundo.agregarPersonajes(barbie);
		
		ArrayList<Personaje> valorEsperado = new ArrayList<>();
		valorEsperado.add(ken);
		
		assertEquals(valorEsperado , mundo.personajesNormales());
		
		
		
	}
	
	

}
