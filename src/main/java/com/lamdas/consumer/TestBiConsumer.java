package com.lamdas.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class TestBiConsumer {

	public static void main(String[] args) {
		// acepta dos parametros no regresa valor
		BiConsumer<Double, Double> bicon = (n1,n2) -> {
															Double mult = n1 * n2;
															System.out.println("La multiplicacion es: " + mult);
													  };
		bicon.accept(15.2, 2.1);
		
		
		/* Ejemplo de mapeo ***/
		System.out.println("Ejemplo de MAPEO");
		Map<String, String> map = new HashMap<>();
		
		String[][] arreglo = {{"Chris","USA"}, {"Raju","India"}, {"Lynda","Canada"}};
		
		for(int i = 0; i < arreglo.length; i++) 
		{
			map.put( arreglo[i][0], arreglo[i][1]);
		}
		
		System.out.println("Forma tradicional de imprimir de mapa: " + map); 
		 
	     map.forEach( (n,p) -> System.out.println("Nombre: " + n + " Pais: " + p  ) );

	}

}
