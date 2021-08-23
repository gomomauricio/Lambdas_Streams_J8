package com.lamdas.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DatosComensales
{
	public static void main(String[] args) {
		System.out.println(" inicio _ _ _ " + DatosComensales.class.getName());
		
		List<Comensal> lsComensales = Arrays.asList(
				new Comensal("Javier", 256.2, 5),
				new Comensal("Andres", 256.2, 5),
				new Comensal("Carlos", 256.2, 5),
				new Comensal("Vale", 256.2, 5),
				new Comensal("Andrea", 256.2, 5),
				new Comensal("Jacinta", 256.2, 5) 
				);
		
		List<Object> nombresCs =
		getDatosComensales(lsComensales, x -> x.getNombre());
		
		
		System.out.println("nombres= " + nombresCs );
	}
	
	
	public static List<Object> getDatosComensales( List<Comensal> lsCom, Function<Comensal, Object> func)
	{
		//Guardara datos personalizados de los comensale
		List<Object> lsDatos = new ArrayList<>();
		
		 lsCom.forEach(  c -> lsDatos.add( func.apply(c) ));

		 return lsDatos;
	}
	
}
