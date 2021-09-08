package com.lamdas.streams.operaciones.intermedias;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestSorted {

	  //Ordenamientos
	public static void main(String[] args) 
	{
		/***    //EJEMPLOS
		   System.out.println("	Nombres Ordenados ");
			Arrays.asList("Alfredo","Maria","Daniel","Brenda")
						.stream()
						.sorted()
						.forEach(System.out::println);

			System.out.println("	Numeros Ordenados ");
			Arrays.asList(1,2,7,8,9,1,5,2,1,5,3,5)
						.stream()
						.sorted()
						.forEach(System.out::println);
			*/
			
			System.out.println("__ ");
			
			List<EmpleadoSorted> empleados = EmpleadoSorted.empleados();
			
			empleados.stream()
						.sorted() //ordenados por nombre por la funcion compareTo
						.forEach( e -> System.out.println( e.getNombre() ));
			System.out.println("	Empleados ordenados por edad: ");
			empleados.stream()
			          	.sorted( new Comparator<EmpleadoSorted>() 
			          	               {
												@Override
												public int compare(EmpleadoSorted e1, EmpleadoSorted e2) {

													return e1.getEdad() - e2.getEdad();
												}
			          		
			          	               }
			          	       ) 
			          	.forEach( e -> System.out.println( e.getNombre() + " - " + e.getEdad() ));;
			          	
			        	System.out.println("	Empleados ordenados por salario: ");          	
			        	empleados.stream()
			        				.filter( emp -> emp.getEdad() > 25)
			        				.sorted( (e1,e2) -> (int)(e1.getIngresos() - e2.getIngresos()) )
			        				.forEach( System.out::println); 

	}

}
