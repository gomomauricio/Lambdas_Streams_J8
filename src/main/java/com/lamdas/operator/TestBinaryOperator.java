package com.lamdas.operator;

import java.util.function.BinaryOperator;

public class TestBinaryOperator {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> biOp = (n1,n2) -> n1 * n2;
		Integer r1 = biOp.apply(10,20);
		System.out.println("Resultado: " + r1);
		
		BinaryOperator<Integer> bOpMin =
		BinaryOperator.minBy( (Integer t1,Integer t2) -> t1.compareTo(t2) );
		
		r1 = bOpMin.apply(10, 20);
		System.out.println("El numero menor de 10 y 20 es: " + r1);
		
		BinaryOperator<Integer> bOpMax =
				BinaryOperator.maxBy( (Integer t1,Integer t2) -> t1.compareTo(t2) );
				
				r1 = bOpMax.apply(10, 20);
				System.out.println("El numero Mayor de 10 y 20 es: " + r1);
		

	}

}
