package com.lamdas.streams.operaciones.reduccion.mutables;

import java.util.Map;
import java.util.stream.Collectors;

import com.lamdas.streams.operaciones.intermedias.EmpleadoFilter;

public class TestCollect_MAP {

	public static void main(String[] args) {
		
		Map<Long, String> idANombre = EmpleadoFilter.empleados()
											.stream()
												.collect( Collectors.toMap(EmpleadoFilter::getId, EmpleadoFilter::getNombre));

		System.out.println(idANombre);
		System.out.println("	Por Genero:");
		
		Map<EmpleadoFilter.Genero, String> genAnombre = EmpleadoFilter.empleados()
				.stream()
					.collect( Collectors.toMap(EmpleadoFilter::getGenero, EmpleadoFilter::getNombre,
							                    (n1,n2) -> String.join(", ",n1, n2) )); //este ultimo agrupa correspondiendo su genero
		System.out.println(genAnombre);
		
	}

}
