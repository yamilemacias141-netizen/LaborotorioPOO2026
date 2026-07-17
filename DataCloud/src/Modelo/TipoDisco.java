package Modelo;
public enum TipoDisco
{
	SATA_HDD(1),
	SATA_SSD(2),
	M2(5);
	
	private int multiplicador;
	
	TipoDisco (int multiplicador)
	{
		this.multiplicador=multiplicador;
	}
	
	public int getMultiplicador()
	{
		return multiplicador;
	}

	
	
}
