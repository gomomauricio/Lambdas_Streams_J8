package com.lamdas.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CrearStreams_1 {

	public static void main(String[] args) 
	{
		System.out.println("Inicia Crear Streams 1  . . . ");
		
		Stream<String> st1 = Stream.of("Curso e programación");
			st1.forEach(System.out::println);
		
		Stream<String> st2 = Stream.of("curso_1","curso_2","curso_3","curso_4");
				st2.forEach(System.out::println);
				
		String[] arreglo = { "Java","c++","c#","ruby"};
		Stream<String> st3 = Stream.of(arreglo);
				st3.forEach(System.out::println);
				
		Stream<EstudianteStreams> stEstuiantes = Stream.<EstudianteStreams>builder()
														 .add(new EstudianteStreams("e01", 17, 1.70, 9.5))
														 .add(new EstudianteStreams("e02", 16, 1.63, 8.1))
														 .build();
//		stEstuiantes.forEach(System.out::println);
		stEstuiantes.forEach( e -> System.out.println("DNI= " + e.getIdentificacion() ));

		IntStream unoVeinte = IntStream.rangeClosed(1, 20);
		unoVeinte.forEach( System.out::println);
		
		
		
	}
	
	
	

}
