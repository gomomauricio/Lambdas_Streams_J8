package com.lamdas.function;

import java.util.Arrays;
import java.util.List;

public class EjemBiFunction_3 {

	public static void main(String[] args)
	{
		 List<EmpleadoFunc> lsEmpleados = Arrays.asList(
				  new EmpleadoFunc("Javier0",250.33),
				  new EmpleadoFunc("Javier1",251.33),
				  new EmpleadoFunc("Javier2",252.33),
				  new EmpleadoFunc("Javier3",253.33),
				  new EmpleadoFunc("Javier4",254.33),
				  new EmpleadoFunc("Javier5",255.33),
				  new EmpleadoFunc("Javier6",256.33),
				  new EmpleadoFunc("Javier7",257.33),
				  new EmpleadoFunc("Javier8",258.33),
				  new EmpleadoFunc("Javier9",259.33)
				 );
		 
		 CalcBiF_2 calc = new CalcBiF_2();
		
		 List<Double> lsSalarios =
		 calc.calc( (salario,incremento) -> salario + ( salario * (incremento/100) ) , 
				 lsEmpleados, 16.0);
		 
		System.out.println("Salarios: " + lsSalarios );
	}

}
