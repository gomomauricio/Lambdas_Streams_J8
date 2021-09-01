package com.lamdas.pedicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import com.lamdas.pedicate.EmpleadoPred;

public class TestPredicate {
	
	//Predicate recibe un valor
	//su funcion est test 

	public static void main(String[] args) {
		//Ejemplo 
		/*
		 		Predicate<Integer> p1 = (valor) -> valor > 0;
				System.out.println("p1 " + p1.test(123));
		 */
		
		System.out.println("Iniciando test Pred 1");
		
		EvualadorPred evalua = new EvualadorPred();
		
		System.out.println("Empleados con salarios > 10");
		List<EmpleadoPred> lsEmpSalariosAltos = evalua.Evaluar(getLsEmpleados(), empleado -> empleado.getSalario() > 10 );
		System.out.println("      " + lsEmpSalariosAltos);
		
		System.out.println("Empleados que inician con E > 10");
		List<EmpleadoPred> lsEmpConE = evalua.Evaluar(getLsEmpleados(), empleado -> empleado.getNombre().startsWith("E") );
		System.out.println("      " + lsEmpConE);
		
		System.out.println("Empleados Mayores de 25");
		List<EmpleadoPred> lsEmpMas25 = evalua.Evaluar(getLsEmpleados(), empleado -> empleado.getEdad() < 25 );
		System.out.println("      " + lsEmpMas25);
		
		System.out.println("Empleados menores de 25");
		List<EmpleadoPred> lsEmpMenos25 = evalua.Evaluar(getLsEmpleados(), empleado -> empleado.getEdad() < 25 );
		System.out.println("      " + lsEmpMenos25);
		
		
		System.out.println("Nuevo Salario menores de 25");
		//A los empleados jovenes se les incrementa salario
		EvaluaEmpleadosPred evaJov = new EvaluaEmpleadosPred();
		
		lsEmpMenos25.forEach( e -> e.setSalario
				                    ( 
				                    		evaJov.incrementoSalario( e, 
				                    				                  10.0, 
				                    				                  (salario, incremento) -> salario + ( salario * (incremento / 100) )
				                    				                ) 
				                    ) 
							);
		
		System.out.println("      " + lsEmpMenos25);
	
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
