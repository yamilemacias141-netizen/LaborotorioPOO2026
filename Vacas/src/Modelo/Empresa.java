package Modelo;
import java.util.ArrayList;
public class Empresa 
{
	
	ArrayList<Tambo> tambos = new ArrayList<>();
	public Empresa()
	{
		
	}
	
	
	public void agregarTambo(Tambo t)
	{
		tambos.add(t);
	}
	
	public void tamboConAreaMaxima()
	{
		Tambo tamboArea = tambos.get(0);
		for ( Tambo t:tambos)
		{
			if(t.getSuperficie() > tamboArea.getSuperficie())
			{
				tamboArea = t;
			}
		}
		System.out.println(tamboArea.getSuperficie());
	}
	
	public int produccionRecaudada()
	{
		int recaudacion = 0;
		for(Tambo t: tambos)
		{
			recaudacion += t.cantidadLecheTambo();
		}
		return recaudacion;
	}
	
	public void vacaMasProductora()
	{
		
		Vaca masProductora = tambos.get(0).vacaMasProductora();
		
		for(Tambo t: tambos)
		{
			Vaca productora = t.vacaMasProductora();
			if(productora.cantidadLeche() > masProductora.cantidadLeche())
			{
				masProductora = productora;
			}
		}
		
		System.out.println(masProductora.mugir());
		
	}

}
