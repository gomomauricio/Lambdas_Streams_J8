package com.lamdas.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class CalcBiF_2 {
	
	public List<Double> calc( BiFunction<Double, Double, Double> bi, List<EmpleadoFunc> lsEmp, Double incremento)
	{
		List<Double> lsSalarios = new ArrayList<Double>();
		
		lsEmp.forEach( e -> lsSalarios.add( bi.apply( e.getSalario() , incremento) ));
		
		return lsSalarios;
	}

}
