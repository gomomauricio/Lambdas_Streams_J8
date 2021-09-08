package com.lamdas.streams.operaciones.reduccion;

import java.util.stream.IntStream;

public class TestReduce_Summary {

	public static void main(String[] args)
	{
		System.out.println("Iniciando - - - " + TestReduce_Summary.class.getSimpleName());
		 
		System.out.println("Sumary" + IntStream.range(1, 20)
									 .summaryStatistics()
				);
		
		System.out.println("Suma: " + IntStream.range(1, 20)
				 .summaryStatistics()
				 .getSum()
);
		
		System.out.println("Promedio: " + IntStream.range(1, 20)
		 .summaryStatistics()
		 .getAverage()
);
		
	}
	
	
	 
 
	
	
}
