package com.lamdas.metodo.referenciado;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMetodosRef_1 {

	public static void main(String[] args) {
		 
//		System.out.println("Personas sin ordenar:   _________________________");
//		List<PersonaMetRef1> personas = getPersonas();
//		personas.forEach(System.out::println);
//		
//		Collections.sort(personas,(p1,p2) -> p1.getEdad().compareTo( p2.getEdad()));
//		System.out.println("Personas ordenadas por edad:   _________________________");
//		personas.forEach(System.out::println);
		
		System.out.println("\nPersonas sin ordenar 2:   _________________________");
		List<PersonaMetRef1> personas = getPersonas();
		 personas.forEach(System.out::println);
		 
		 System.out.println("Personas ordenadas por edad 2:   _________________________");
		 Collections.sort(personas, PersonaMetRef1::compararPorEdad);
		 personas.forEach(System.out::println);
		 
		 System.out.println();
		 
		 ProveedorComparacionesMetRef comparador = new ProveedorComparacionesMetRef();
		 
		 Collections.sort(personas, comparador::compararPorNombre);
		 System.out.println("Personas ordenadas por nombre :   _________________________");
		 personas.forEach(System.out::println);

	}
	
	
	private static List<PersonaMetRef1> getPersonas()
	{
		List<PersonaMetRef1> personas = Arrays.asList(
				new PersonaMetRef1("Juan0",18,"juanito0@hotmail.com"),
				new PersonaMetRef1("Angel",17,"juanito1@hotmail.com"),
				new PersonaMetRef1("Omar",17,"juanito2@hotmail.com"),
				new PersonaMetRef1("Pamela",15,"juanito3@hotmail.com"),
				new PersonaMetRef1("Juan4",21,"juanito4@hotmail.com"),
				new PersonaMetRef1("Juan5",25,"juanito5@hotmail.com"),
				new PersonaMetRef1("Lourdes",16,"juanito6@hotmail.com"),
				new PersonaMetRef1("Sadee",36,"juanito7@hotmail.com"),
				new PersonaMetRef1("Jared",14,"juanito8@hotmail.com"),
				new PersonaMetRef1("Juan9",41,"juanito9@hotmail.com"),
				new PersonaMetRef1("Juan10",51,"juanito10@hotmail.com"),
				new PersonaMetRef1("Sebastian",58,"juanito11@hotmail.com"),
				new PersonaMetRef1("Javier",48,"juanito12@hotmail.com"),
				new PersonaMetRef1("Roberto",68,"juanito13@hotmail.com"),
				new PersonaMetRef1("Oyuki",18,"juanito14@hotmail.com"),
				new PersonaMetRef1("Linda",28,"juanito15@hotmail.com"),
				new PersonaMetRef1("Gustavo",17,"juanito16@hotmail.com"),
				new PersonaMetRef1("Raquel",18,"juanito17@hotmail.com")
				                        );
		
		
		return personas;
	}

}
