package com.lamdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStreams_1 {
	/*OPERACIONES INTERMEDIAS
	 * 
	 * FILTER -> Produce un stream que contiene solo elementos que satisfacen una condicion.
	 * 
	 * DISTINCT -> Produce un stream que contiene solo elementos unicos.
	 * 
	 * LIMIT -> Produce un stream con el numero especificado de elementos.
	 * 
	 * MAP -> Produce un stream en el que cada elemento del stream original esta asociado a un nuevo valor.
	 * 
	 * SORTED -> Produce un stream en el que los elementos estan ordenados.
	 * 
	 */

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		//iteracion externa
		System.out.println("Iteracion EXTERNA");
		int suma = 0;
		
		for (Integer in : numeros) {
			 if( in % 2 == 1)
			 {
				 int cuadrado = in * in;
				 suma += cuadrado;
			 }
		}
		
		System.out.println(" La suma de los cuadrados es: " + suma);
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Iteracion INTERNA");
		
		suma = 0;
		suma = numeros.stream().filter( n -> n % 2 == 1)
						.map( n -> n * n )
						.reduce( 0, Integer::sum);
		System.out.println(" La suma de los cuadrados es: " + suma);
		
		
		System.out.println(" ----- ------- ------- -------");
	    Stream<Integer> nSt = numeros.stream();
	    
	     
		

	}

}
