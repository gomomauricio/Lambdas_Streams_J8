package com.lamdas.function;

import java.util.Arrays;
import java.util.List;

public class EjemBiFunction_3 {

	public static void main(String[] args)
	{
		 List<Empleado> lsEmpleados = Arrays.asList(
				  new Empleado("Javier0",250.33),
				  new Empleado("Javier1",251.33),
				  new Empleado("Javier2",252.33),
				  new Empleado("Javier3",253.33),
				  new Empleado("Javier4",254.33),
				  new Empleado("Javier5",255.33),
				  new Empleado("Javier6",256.33),
				  new Empleado("Javier7",257.33),
				  new Empleado("Javier8",258.33),
				  new Empleado("Javier9",259.33)
				 );
		 
		 CalcBiF_2 calc = new CalcBiF_2();
		
		 List<Double> lsSalarios =
		 calc.calc( (salario,incremento) -> salario + ( salario * (incremento/100) ) , 
				 lsEmpleados, 16.0);
		 
		System.out.println("Salarios: " + lsSalarios );
	}

}
