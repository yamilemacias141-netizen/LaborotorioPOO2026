package Modelo;
public class Disco
{
	private int totalSectoresCorruptos;
	private TipoDisco tipoDisco;
	private int tasaDeTransferencia;
	private int transferencia;
	public Disco(int totalSectoresCorruptos, TipoDisco tipoDisco, int tasaDeTransferencia)
	{
		this.totalSectoresCorruptos = totalSectoresCorruptos;
		this.tipoDisco = tipoDisco;
		this.tasaDeTransferencia = tasaDeTransferencia;
		
	}
	
	
	
	public boolean estaEnRiesgo()
	{
		if(totalSectoresCorruptos > 5 && tasaDeTransferencia < 50)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public int totalTranferencia() 
	{
		return tasaDeTransferencia * tipoDisco.getMultiplicador();
		
	}
	
	
	public int getTasaDeTransferencia()
	{
		return tasaDeTransferencia;
	}
	
	public TipoDisco getTipoDisco()
	{
		return tipoDisco;
	}
	public int getTotalSectoresCorruptos()
	{
		return totalSectoresCorruptos;
	}
}








