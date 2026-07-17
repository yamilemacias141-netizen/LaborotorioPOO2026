package Modelo;

public class Fauna 
{
	private int cantidadEspecies;
	private int valorPromedio;
	
	public Fauna(int cantidadEspecies , int valorPromedio)
	{
		this.cantidadEspecies=cantidadEspecies;
		this.valorPromedio=valorPromedio;
		
	}
	public Fauna()
	{
		
	}
	
	public boolean estaEnPeligro()
	{
		if(cantidadEspecies < 2 && valorPromedio > 3000000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void setCantidadEspecies(int cantidadEspecies)
	{
		this.cantidadEspecies=cantidadEspecies;
	}
	public void setValorPromedio(int valorPromedio)
	{
		this.valorPromedio=valorPromedio;
	}
	
	public int getValorPromedio()
	{
		return valorPromedio;
	}
	
	
	public int getCantidadEspecies()
	{
		return cantidadEspecies;
	}

}
