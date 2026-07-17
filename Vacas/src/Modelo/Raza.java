package Modelo;

public enum Raza
{
	DE_PROPAGANDA(1),
	PASTOREO_LIGERO(2), 
	PURA_LECHE(5);
	
    private int multiplicador;
	Raza (int multiplicador)
	{
		this.multiplicador=multiplicador;
	}
	
	public int getMultiplicador()
	{
		return multiplicador;
	}
	

	

}
