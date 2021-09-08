package com.lamdas.streams.operaciones.reduccion.mutables;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.lamdas.streams.operaciones.intermedias.EmpleadoFilter;

public class TestCollect_1 {

		//
	public static void main(String[] args) {

		List<String> nombres = EmpleadoFilter.empleados()
												.stream()	
													.map(EmpleadoFilter::getNombre)
													.collect(ArrayList::new, ArrayList::add,ArrayList::addAll);
		
		System.out.println(nombres);
		System.out.println("___________ SET");
		
		Set<String> nombres2 = EmpleadoFilter.empleados()
									.stream()	
										.map(EmpleadoFilter::getNombre)
											.collect( Collectors.toSet()  );
		System.out.println(nombres2);
		
		System.out.println("___________ TREESET");
		
		SortedSet<String> nombres3 = EmpleadoFilter.empleados()
						.stream()	
							.map(EmpleadoFilter::getNombre)
								.collect( Collectors.toCollection( TreeSet::new ));
		System.out.println(nombres3);

		
	}

}
