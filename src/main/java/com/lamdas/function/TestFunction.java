package com.lamdas.function;

import java.util.function.Function;

public class TestFunction 
{
	
	public static void main(String[] args) 
	{
		System.out.println(" inicio _ _ _");
		//Function<T,R>  -- Recibe un parametro y regresa otro
		// metodo apply
		Function<Integer,String> convert = x -> Integer.toString(x);
		
		System.out.println(convert.apply(3).length());
		System.out.println(convert.apply(30).length());
		
	}

}
