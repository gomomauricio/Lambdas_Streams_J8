package com.lamdas.streams.operaciones.intermedias;

import java.util.List;
import java.util.function.Predicate;

public class TestFilter_1 {

	public static void main(String[] args) {

		System.out.println("Iniciando test Filter . . . ");
		
		List<EmpleadoFilter> empleados = EmpleadoFilter.empleados();
		
		System.out.println("	Empleado Hombres:");
		empleados.stream().filter( new Predicate<EmpleadoFilter>() {
															@Override
															public boolean test(EmpleadoFilter emp) {
																return emp.isHombre();
															}
			
									})
						.forEach( e -> System.out.println(e.getNombre()) );
		
		System.out.println("	Empleados Mujeres:");
		empleados.stream()
					.filter( EmpleadoFilter::isMujer )
					.forEach(System.out::println);
		

		System.out.println("	Empleados mayores de 25 años:");
		empleados.stream()
					.filter( emp -> emp.getEdad() > 25  )
					.forEach(System.out::println);
		
		System.out.println("	Personal masculino cuya letra inicie con A:");
		empleados.stream()
					.filter( EmpleadoFilter::isHombre)
					.filter( emp -> emp.getNombre().startsWith("A"))
					.forEach(System.out::println);
	
		System.out.println("	Personal masculino con ingresos mayores a 500:");
		empleados.stream()
					.filter( emp -> emp.isHombre() && emp.getIngresos() > 500)
					.forEach(System.out::println);
		
		
		System.out.println("	Personal femenino mayor 25 años, con ingresos mayores a 300:");
		
		Predicate<EmpleadoFilter> eFemenino = emp -> emp.isMujer();
		Predicate<EmpleadoFilter> eMayor25 = emp -> emp.getEdad() > 25;
		Predicate<EmpleadoFilter> eMayor300 = emp -> emp.getIngresos() > 300;
		Predicate<EmpleadoFilter> eFemMay25_300 = eFemenino.and(eMayor25).and(eMayor300);
		
		
		empleados.stream()
					.filter( eFemMay25_300)
					.forEach(System.out::println);
		
		System.out.println("	Cantidad total: " + empleados.stream().filter(eFemMay25_300).count() );
		
		
	}

}
