package Modelo;

public class Vaca 
{
	
	private int  capacidadIntrinseca;
	private Raza raza;
	
	public Vaca(int capacidadIntrinseca , Raza raza)
	{
		this.capacidadIntrinseca=capacidadIntrinseca;
		this.raza=raza;
		
		
	}
	public String mugir ()
	{
		return"muu";
	}
	
	
	public int cantidadLeche ()
	{
		int cantidad = capacidadIntrinseca * raza.getMultiplicador();
		return cantidad;
	}
	


	

}
