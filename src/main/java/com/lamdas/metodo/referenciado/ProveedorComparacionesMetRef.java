package com.lamdas.metodo.referenciado;

public class ProveedorComparacionesMetRef {
	
	public int compararPorNombre(PersonaMetRef1 p1 , PersonaMetRef1 p2)
	{
		return p1.getNombre().compareTo(p2.getNombre());
	}
	
	
	public int compararPorEdad(PersonaMetRef1 p1 , PersonaMetRef1 p2)
	{
		return p1.getEdad().compareTo(p2.getEdad());
	}

}
