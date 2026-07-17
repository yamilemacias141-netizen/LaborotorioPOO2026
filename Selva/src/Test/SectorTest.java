package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Modelo.Fauna;
import Modelo.Sector;
class SectorTest {

	@Test
	void esVulnerableTest_true() 
	{
		Fauna fauna = new Fauna(1 , 3500000);
		Sector sector = new Sector(45 , fauna);
		
		
		assertEquals(true , sector.esVulnerable());
	}
	
	@Test
	void valorSectorTest_valorEsperado()
	{
		
		Fauna fauna = new Fauna(1 , 3500000);
		Sector sector = new Sector (30 , fauna);
		
		
		int valorEsperado = (30*300) + 3500000;
		
		assertEquals(valorEsperado , sector.valorSector());
		
	}

}
