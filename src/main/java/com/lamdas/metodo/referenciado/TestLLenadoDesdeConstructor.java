package com.lamdas.metodo.referenciado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import javax.naming.spi.DirStateFactory.Result;

public class TestLLenadoDesdeConstructor {

	public static void main(String[] args) {
		
		List<String> numeros = Arrays.asList("10","10","15","15","25","30","40","6","30");
		
//				getResults(numeros, s -> Integer.parseInt(s) ).forEach( n -> System.out.println( n * 10));;
				getResults(numeros, Integer::new ).forEach( n -> System.out.println( n * 10));

	}
	
	
	public static List<Integer> getResults(List<String> datos,
			                                Function<String, Integer> func )
	{
		List<Integer> res = new ArrayList<Integer>();
		
		datos.forEach( s -> res.add( func.apply(s)) ); //recorremos la lista y le aplicamos function 
		
		return res;
		
	}

	
	
}
