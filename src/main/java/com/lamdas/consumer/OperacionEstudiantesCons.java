package com.lamdas.consumer;

import java.util.List;
import java.util.function.Consumer;

public class OperacionEstudiantesCons {
	
	
	public void aceptaTodos(List<EstudianteCons> estudiantes, Consumer<EstudianteCons> cons)
	{
		estudiantes.forEach( estudiante -> cons.accept(estudiante) );
	}

}
