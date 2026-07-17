package Modelo;
public class Nodo
{
	private int consumoElectrico;
	private Disco disco;
	
	public Nodo(int consumoElectrico, Disco disco)
	{
		this.consumoElectrico=consumoElectrico;
		this.disco = disco;
	}
	
	public boolean estaCritico()
	{
		if(disco.estaEnRiesgo() == true)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public double suConsumo()
	{
		double consumoDelNodo= consumoElectrico*1.5 + disco.getTasaDeTransferencia();
		return consumoDelNodo;
	}
	
	public Disco getDisco()
	{
		return disco;
	}
	public int getConsumoElectrico()
	{
		return consumoElectrico;
	}
	
}