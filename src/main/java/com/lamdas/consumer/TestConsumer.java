package com.lamdas.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {
		//  
		/*//Ejemplo
		Consumer<String> cons = x -> System.out.println(x.toUpperCase());
		cons.accept("Mauricio . . ");
		*/
		
		OperacionEstudiantesCons oper = new OperacionEstudiantesCons();
		
		Consumer<EstudianteCons> cons1 = e -> System.out.println( "Nombre: " + e.getNombre() + 
				                                                  " Calificacion: " + e.getCalificacion() );
		
		Consumer<EstudianteCons> cons2 = e -> e.setCalificacion( e.getCalificacion() * 1.15);
		
		List<EstudianteCons> ess = getEstudiantes();
		
		System.out.println("Estudiantes sin calificacion actualizada");
		oper.aceptaTodos(ess, cons1);
		
		System.out.println("Actualizamos calificacion . . . ");
		oper.aceptaTodos(ess, cons2);
		
		System.out.println("Estudiantes con calificacion actualizada");
		oper.aceptaTodos(ess, cons1);
		
		Consumer<EstudianteCons> cons3 = cons2.andThen(cons1);
		
		System.out.println("Lo mismo pero con Consumer anidado");
		oper.aceptaTodos(getEstudiantes(), cons3);
		
	}
	
	public static List<EstudianteCons> getEstudiantes()
	{
		List<EstudianteCons> ests = Arrays.asList(
												new EstudianteCons("Mario", 6.0),
												new EstudianteCons("Juan", 6.5),
												new EstudianteCons("Mark", 5.2),
												new EstudianteCons("Felix", 3.1),
												new EstudianteCons("Patrick", 10.0),
												new EstudianteCons("James", 10.0),
												new EstudianteCons("Peter", 9.1),
												new EstudianteCons("Mathew", 5.0),
												new EstudianteCons("Paul", 4.3),
												new EstudianteCons("James", 8.9),
												new EstudianteCons("Judas", 6.3),
												new EstudianteCons("Tomas", 2.2),
												new EstudianteCons("Felipe", 7.6),
												new EstudianteCons("Tom", 9.7),
												new EstudianteCons("Maria", 1.0),
												new EstudianteCons("Magdalena", 6.9),
												new EstudianteCons("Javier", 9.0),
												new EstudianteCons("Amada", 9.5),
												new EstudianteCons("Amanda", 10.6),
												new EstudianteCons("Olivia", 6.5),
												new EstudianteCons("Cinthia", 5.0),
												new EstudianteCons("Felicias", 7.3),
												new EstudianteCons("Sergio", 7.0),
												new EstudianteCons("Arturo", 8.6)
										);
		
		return ests;
	}

}
