package Modelo;
import java.util.ArrayList;
public class Tambo 
{
	private Vaca [] vacas;
	private int cantidadVacas=0;

	private int superficie;
	private int capacidad;
	
	public Tambo(int superficie)
	{
		this.superficie=superficie;
		this.capacidad= superficie/2;
		vacas= new Vaca [capacidad];
	}
	public Tambo()
	{
		
	}
	

	public void agregarVaca(Vaca v)
	{
		if (cantidadVacas < capacidad )
		{
			vacas = new Vaca [cantidadVacas];
			cantidadVacas++;
		}
		
	}
	
	
	
	public int  cantidadLecheTambo()
	{
		int cantidad = 0;
		for (int i = 0 ; i< cantidadVacas ; i++)
		{
			cantidad+= vacas[i].cantidadLeche();
		}
		return cantidad;
	}
	
	public Vaca vacaMasProductora()
	{
		Vaca vaca = null;
		for(int i= 0; i< cantidadVacas ; i++)
		{
			if (vacas[i].cantidadLeche() > vaca.cantidadLeche());
			{
				vaca = vacas[i];
			}
		}
		return vaca;
	}
	
	public int getSuperficie ()
	{
		return superficie;
	}
	public int getCapacidad()
	{
		return capacidad;
	}
}