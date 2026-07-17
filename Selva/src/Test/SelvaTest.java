package Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import Modelo.Fauna;
import Modelo.Sector;
import Modelo.Selva;
class SelvaTest {

	@Test
	void sectoresVulnerablesTest_valorEsperado() 
	{
		Selva selva = new Selva();
		Fauna fauna = new Fauna(1 , 3500000);
		Sector sector = new Sector(50 , fauna);
		
		selva.agregarSector(sector);
		
		ArrayList<Sector> valorEsperado = new ArrayList<>();
		valorEsperado.add(sector);
		
		assertEquals(valorEsperado , selva.sectoresVulnerables());
	}
	
	@Test
	void sectorConMasEspecieTest_valorEsperado()
	{
		Selva selva = new Selva();
		
		Fauna f1 = new Fauna();
		f1.setCantidadEspecies(3);
		Fauna f2 = new Fauna();
		f2.setCantidadEspecies(5);
		
		Sector s1 = new Sector(50 , f1);
		Sector s2 = new Sector(34 , f2);
		
		selva.agregarSector(s1);
		selva.agregarSector(s2);
		Sector valorEsperado = s2;
		assertEquals(valorEsperado , selva.sectorConMasEspecies());
	}
	
	@Test
	void sumatoriaTotalTest_valorEsperado()
	{
		Selva selva = new Selva();
		
		Fauna f1 = new Fauna();
		f1.setValorPromedio(2000100);
		Fauna f2 = new Fauna();
		f2.setValorPromedio(3000000);
		
		Sector s1 = new Sector(50 , f1);
		Sector s2 = new Sector(65 , f2);
		
		
		selva.agregarSector(s1);
		selva.agregarSector(s2);
		
	
		int valorS1 = (50*300)+2000100;
		int valorS2 = (65*300)+3000000;
		
		int valorEsperado = valorS1 + valorS2;
		
		assertEquals(valorEsperado , selva.sumatoriaTotal());
		
	}

}
