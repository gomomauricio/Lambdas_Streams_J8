package com.lamdas.pedicate;

import java.util.function.Predicate;

public class TestPredicate {
	
	//Predicate recibe un valor
	//su funcion est test 

	public static void main(String[] args) {
		 
		Predicate<Integer> p1 = (valor) -> valor > 0;
		
		System.out.println("p1 " + p1.test(123));

	}

}
