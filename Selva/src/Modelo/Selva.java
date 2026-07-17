package Modelo;
import java.util.ArrayList;
public class Selva 
{
	private ArrayList<Sector> sectores = new ArrayList<>();
	
	public Selva()
	{
		
	}
	
	public void agregarSector(Sector s)
	{
		sectores.add(s);
	}
	
	public ArrayList<Sector> sectoresVulnerables()
	{
		ArrayList<Sector> vulnerables = new ArrayList<>();
		
		for(Sector s: sectores)
		{
			if(s.esVulnerable())
			{
				vulnerables.add(s);
			}
		}
		return vulnerables;
	}
	
	public Sector sectorConMasEspecies()
	{
		Sector masEspecies = sectores.get(0);
		
		for(Sector s:sectores)
		{
			if(s.getFauna().getCantidadEspecies() > masEspecies.getFauna().getCantidadEspecies())
			{
				masEspecies = s;
			}
			
		}
		return masEspecies;
		
		
	}
	
	public int sumatoriaTotal()
	{
		int sumatoriaTotal=0;
		for(Sector s: sectores)
		{
			sumatoriaTotal+=s.valorSector();
		}
		return sumatoriaTotal;
	}

}
