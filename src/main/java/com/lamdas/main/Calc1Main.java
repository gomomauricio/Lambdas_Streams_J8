package com.lamdas.main;

import com.lamdas.uso.CalcInt;
import com.lamdas.uso.CalcLong;
import com.lamdas.uso.Calcular;

public class Calc1Main {

	public static void main(String[] args) {

		System.out.println("Calculando . . . ");
		
		engine( (long x, long y ) -> x + y );
		engine( (CalcInt)( x, y ) -> x + y );
		
		System.out.println("Create " + create().calcular(6, 6));
		
//		engine( ( x, y ) -> x + y );
//		engine( ( x, y ) -> x - y );
//		engine( ( x, y ) -> x * y );
//		engine( ( x, y ) -> x / y );
//		engine( ( x, y ) -> x % y );
	}
	
	
	private static void engine(CalcInt cal)
	{
		int x = 2, y = 4;
		
		int resultado = cal.calcular(x, y);
		System.out.println("R= " + resultado);
	}
	
	private static void engine(CalcLong cal)
	{
		long x = 3, y = 5;
		
		long resultado = cal.calcular(x, y);
		System.out.println("R= " + resultado);
		
	}
	
	
	private static CalcLong create()
	{
		return ( x, y ) -> x / y; 
	}
	
	
//	private static void engine(Calcular cal)
//	{
//		int x = 2, y = 4;
//		
//		int resultado = cal.calcular(x, y);
//		System.out.println("R= " + resultado);
//	}

}
