package com.lamdas.streams.operaciones.intermedias;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class TestMap_1 {

	   //Map aplica una aplicacion tipo Function
	public static void main(String[] args) {
		
		IntStream.rangeClosed(1, 5)
				 .map( new IntUnaryOperator() 
				     {
							@Override
							public int applyAsInt(int numero)
							{
								return numero * numero;
							}
				     })
				 .forEach(System.out::println);
		System.out.println(" ---------------------------------------------- ");
		
		IntStream.rangeClosed(1, 5)
					.map( n -> n * 2)
					.forEach(System.out::println);
		System.out.println(" ---------------------------------------------- ");
		
		List<EmpleadoFilter> empleados = EmpleadoFilter.empleados();
		System.out.println("	Promedio de ingresos de personal femenino mayor a 25 años");
			Double suma = empleados.stream()
						.filter( emp -> emp.isMujer() ) //devuelve si es mujer
						.filter( emp -> emp.getEdad() > 25 ) //devuelve mayor a 25 años
						.mapToDouble( emp -> emp.getIngresos() ) //este stream es de solo ingresos de las mujeres
						.sum(); //sumamos todos los ingresos
		   
			double promedio = suma / empleados.stream()
					                             .filter( emp -> emp.isMujer() )
					                             .filter( emp -> emp.getEdad() > 25 )
					                             .count();
			
			System.out.println("El promedio es: " + promedio);
		
		

	}

}
