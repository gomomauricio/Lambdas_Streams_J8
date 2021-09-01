package com.lamdas.operator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class TestUnaryOperator {

	public static void main(String[] args) { 
		List<Integer> ls1 = Arrays.asList(10,20,30,50,50,60,70,80,90,100);
		
		List<Integer> ls2 = operadorUnary( num -> num * num  , ls1); //le pasamos la operacion de multiplicarse por si mismo
		
		System.out.println("lista 2 " + ls2);

	}
	
	public static List<Integer> operadorUnary(UnaryOperator<Integer> unOp, List<Integer> lsIn )
	{
		List<Integer> lsActualizada = new ArrayList<>();
		
			lsIn.forEach( num -> lsActualizada.add( unOp.apply(num) ));
		
		return lsActualizada;
	}

}
