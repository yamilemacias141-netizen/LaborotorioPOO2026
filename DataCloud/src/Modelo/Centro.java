package Modelo;
import java.util.ArrayList;
public class Centro {
	ArrayList<Nodo> nodos = new ArrayList<>();
	
	public void agregarNodo(Nodo nodo)
	{
		nodos.add(nodo);
	}
	
	public ArrayList<Nodo> nodosCriticos()
	{
		ArrayList<Nodo> losNodosCriticos = new ArrayList<>();
		for(Nodo n: nodos)
		{
			if(n.estaCritico())
			{
				losNodosCriticos.add(n);
			
			}
		}
		return losNodosCriticos;
		
	}
	
	public Nodo elNodoMasRapido()
	{
		Nodo nodoMasRapido = nodos.get(0);
		for(Nodo n:nodos)
		{
			if(n.getDisco().getTasaDeTransferencia() > nodoMasRapido.getDisco().getTasaDeTransferencia())
			{
				nodoMasRapido = n;
			}
		}
		return nodoMasRapido;
	}
	
	public double consumoTotal()
	{
		double sumatoriaNodos=0;
		for(Nodo n: nodos)
		{
			sumatoriaNodos +=n.suConsumo();
		}
		return sumatoriaNodos;
	}
}



