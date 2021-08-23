package com.lamdas.function;

import java.util.function.BiFunction;

public class CalcBiF {
	
	public String calc( BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2)
	{
		return bi.apply(i1, i2);
	}

}
