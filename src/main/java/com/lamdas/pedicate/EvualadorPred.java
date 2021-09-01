package com.lamdas.pedicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EvualadorPred {
	
	
	public List<EmpleadoPred> Evaluar(List<EmpleadoPred> lsEmps, Predicate<EmpleadoPred> eval)
	{
		List<EmpleadoPred> lsNueva = new ArrayList<>();
		 
			for (EmpleadoPred emp : lsEmps) 
					if( eval.test(emp)) lsNueva.add(emp);
		
		return lsNueva;
	}

	
	public List<EmpleadoPred> EvaluarNegate(List<EmpleadoPred> lsEmps, Predicate<EmpleadoPred> eval)
	{
		List<EmpleadoPred> lsNueva = new ArrayList<>();
		 
			for (EmpleadoPred emp : lsEmps) 
					if( eval.negate().test(emp)) lsNueva.add(emp);
		
		return lsNueva;
	}
	
	
	public List<EmpleadoPred> EvaluarBiPred(List<EmpleadoPred> lsEmps, 
			                                BiPredicate<Integer,String> eval)
	{
		List<EmpleadoPred> lsNueva = new ArrayList<>();
		 
			for (EmpleadoPred emp : lsEmps) 
					if( eval.test(emp.getEdad(), emp.getDepartamento())) lsNueva.add(emp);
		
		return lsNueva;
	}
	
}
