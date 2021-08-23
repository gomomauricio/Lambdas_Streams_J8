package com.lamdas.function;

public class EjemBiFunction_2 {

	public static void main(String[] args)
	{
		CalcBiF calc = new CalcBiF();
		
		String res = calc.calc( ( x, y ) -> ": " + ( x * y )  , 60, 10);

		System.out.println( res);
	}

}
