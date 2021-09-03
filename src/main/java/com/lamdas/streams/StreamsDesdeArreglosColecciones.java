package com.lamdas.streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDesdeArreglosColecciones {

	public static void main(String[] args) {
		
		 
System.out.println("______________________________ Enteros");
 			IntStream nSt1 = Arrays.stream( new int[] {1,2,3,4});
 			nSt1.forEach(System.out::println);
 			
 			System.out.println("______________________________ Nombres");
 			Stream<String> nombres = Arrays.stream( new String[] {"Juan","Pedro","Jose"});
 				nombres.forEach(System.out::println);

		

	}

}
