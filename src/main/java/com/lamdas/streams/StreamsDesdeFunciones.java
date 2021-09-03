package com.lamdas.streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamsDesdeFunciones {

	public static void main(String[] args) {
		
		System.out.println("______________________________Primeros 10");
		Stream<Long> primerosDiez = Stream.iterate(1L, n -> n + 1)
										  .limit(10);
		primerosDiez.forEach(System.out::println);
		
		System.out.println("______________________________ primeros 20 par");
		
		
		Stream.iterate(1L, n -> n + 1 )
		      .filter( n -> n % 2 == 0)
		      .limit(20)
		      .forEach(System.out::println);
		
		System.out.println("______________________________ despues de 100");
		
		Stream.iterate(1L, n -> n + 1 )
		      .filter( n -> n % 2 == 0)
		      .skip(100)
		      .limit(5)
		      .forEach(System.out::println);
		
System.out.println("______________________________ Aleatorios");
		
		Stream.generate(Math::random)
		      .limit(5)
		      .forEach(System.out::println);
		
System.out.println("______________________________ Aleatorios Enteros");

        new Random().ints() 
		      .limit(5)
		      .forEach(System.out::println);

		

	}

}
