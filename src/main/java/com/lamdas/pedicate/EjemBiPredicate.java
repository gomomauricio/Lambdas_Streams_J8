package com.lamdas.pedicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class EjemBiPredicate {
	
	/** 
	 *  Se requiere obtener un reporte con todos los empleados que cumplan con alguno de estos 2 criterios:
	 *  1) 25 años en adelante y que sean del departamento de ventas
	 *  2) 25 años en adelante y que esten en mostrador
	 *   
	 * @param args
	 */ 
	public static void main(String[] args) {
		// BiPredicate evalua dos parametros
		/*  //Ejemplo
					BiPredicate<Integer, Integer> bp = ( x, y ) -> x < y;
					System.out.println("2 < 3 = " + bp.test( 2, 3));
		*/
		
		
		System.out.println("Iniciando EjemBiPredicate . . . ");
		EvualadorPred eva = new EvualadorPred();
		
		BiPredicate<Integer, String> primerCriterio = ( edad , departamento ) 
				                                          -> 
		                                                     ( edad >= 25 ) && ( departamento.equals("Ventas"));
	
	  BiPredicate<Integer, String> segundoCriterio = ( edad , departamento ) 
		   				                                          -> 
		   		                                                     ( edad >= 25 ) && ( departamento.equals("Mostrador"));
		   	
	  BiPredicate<Integer, String> criterio = primerCriterio.or(segundoCriterio);
				                                                      
		System.out.println("Empleados de mostrador o ventas mayores de 25 años");
		
		List<EmpleadoPred> lsCriteria = 
				      eva.EvaluarBiPred( getLsEmpleados(), criterio);
		
		System.out.println("     " + lsCriteria);

	}
	
	

	private static List<EmpleadoPred> getLsEmpleados()
	{
		List<EmpleadoPred> lsEmp = Arrays.asList(
				new EmpleadoPred("Rodrigo", 25, 15.00, "Cobranzas"),
				new EmpleadoPred("Alicia", 25, 15.00, "Ventas"),
				new EmpleadoPred("Manolo", 30, 15.00, "Ventas"),
				new EmpleadoPred("Cinthia", 20, 25.00, "Mostrador"),
				new EmpleadoPred("Esteban", 19, 7.00, "Ventas"),
				new EmpleadoPred("Lina", 32, 6.00, "Mostrador"),
				new EmpleadoPred("Nayeli", 25, 25.00, "Ventas"),
				new EmpleadoPred("Damaris", 44, 10.00, "Telemarking"),
				new EmpleadoPred("Estela", 45, 19.00, "Telemarking")
				);
		
		return lsEmp;
	}

}
