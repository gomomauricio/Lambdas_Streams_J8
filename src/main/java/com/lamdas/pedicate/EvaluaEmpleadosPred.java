package com.lamdas.pedicate;

import java.util.function.BiFunction;

public class EvaluaEmpleadosPred {
	
	public Double incrementoSalario(EmpleadoPred emp, 
			                        Double incremento, 
			                        BiFunction<Double, Double, Double> bi)
	{
		
		return bi.apply(emp.getSalario(), incremento);
	}

}
