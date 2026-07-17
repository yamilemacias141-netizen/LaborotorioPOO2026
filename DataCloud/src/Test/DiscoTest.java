package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Modelo.Disco;
import Modelo.TipoDisco;
import Modelo.TipoDisco;

class DiscoTest {

	@Test
	void estaEnRiesgoTest_true() 
	{
		Disco disco = new Disco(6, TipoDisco.SATA_HDD, 40);
		assertEquals(true, disco.estaEnRiesgo());
	}

}

