package com.lamdas.streams.operaciones.reduccion;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.lamdas.streams.operaciones.intermedias.EmpleadoSorted;

public class TestOperBasicas {
	
	//Suma, resta, multiplicacion
	// operaciones de REDUCCION
	public static void main(String[] args) 
	{
		int[] numeros = {4,6,10,12,15,55,7,8,9,10,2,5,8,9,10,45,6,9,33,66,85,97,81,24,99};
		List<EmpleadoSorted> empleados = EmpleadoSorted.empleados();
		
		int suma = 0;
			
			for (int num : numeros) 
			{
				suma += num; 
			}
			
		System.out.println("La suma es: " + suma);	
		System.out.println("	Con Streams");
		System.out.println("La suma es: " + IntStream.of(numeros).sum() );		
		
		System.out.println("El promedio: " + IntStream.of(numeros).average().getAsDouble());
		System.out.println("El valor MAXIMO: " + IntStream.of(numeros).max().getAsInt());
		System.out.println("El valor minimo: " + IntStream.of(numeros).min().getAsInt());
		System.out.println("Cantidad de Elementos: " + IntStream.of(numeros).count());
			
		System.out.println("	Con el objeto Empleados:");
		System.out.println("Suma de salarios: " + empleados.stream()
																.mapToDouble( EmpleadoSorted::getIngresos)
																.sum()
																
				);
		//Empleado con el salario maximo
		EmpleadoSorted eMax = empleados.stream()
											.max( (e1, e2) -> (int)(e1.getIngresos() - e2.getIngresos()) )
											.get();
		System.out.println("Empleado con maximo salario: " + eMax);
	}

}
