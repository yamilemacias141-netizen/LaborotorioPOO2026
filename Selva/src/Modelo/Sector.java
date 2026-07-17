package Modelo;

public class Sector 
{
	private int superficie;
	private Fauna fauna;
	
	public Sector(int superficie , Fauna fauna)
	{
		this.superficie=superficie;
		this.fauna=fauna;
	}
	public Sector()
	{
		
	}
	
	public boolean esVulnerable()
	{
		if(fauna.estaEnPeligro())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int valorSector()
	{
		int valor = (superficie * 300) + fauna.getValorPromedio();
		return valor;
	}
	
	
	public Fauna getFauna()
	{
		return fauna;
	}
	
	public void setFauna(Fauna fauna)
	{
		this.fauna=fauna;
	}

}
