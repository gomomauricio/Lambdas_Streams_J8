package com.lamdas.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDesdeStrings {

	public static void main(String[] args) {
		 
			System.out.println("______________________________ ingrese un texto:\n ");
			Scanner sc = new Scanner(System.in);
			String entrada = sc.nextLine();
 			 IntStream stChars = entrada.chars();
 			 
 			 
 			 //quitamos numeros y espacios en blanco.
 			 stChars.filter( n -> !Character.isDigit(n)
 					              && !Character.isWhitespace(n))
 			 		.forEach(n -> System.out.print((char)n) );
 			
 			System.out.println("\n______________________________ dividimos una cadena ");
 			
 			 String str = "HTML, CSS, JAVASCRIPT, JAVA, C++, C#, RUBY";
 			 List<String> res1 = new ArrayList<>();
 			 Pattern.compile(", ") //dividimos la cadena cuando tenga coma y espacio
 			        .splitAsStream(str)
// 			         .forEach(System.out::println);
 			 		.forEach( s -> res1.add(s) );
 			 
 			 System.out.println(" RES1 = " + res1);
 			 res1.forEach( s -> System.out.println("'" + s + "'"));
 			 
// 			 stChars.forEach(System.out::println);
		

	}

}
