package com.lamdas.metodo.referenciado;

public class PersonaMetRef1 {

	 private String nombre;
	 private Integer edad;
	 private String emai;
	 
	 public PersonaMetRef1() {}
	 
	 public PersonaMetRef1(String nombre, Integer edad, String emai) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.emai = emai;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getEmai() {
		return emai;
	}

	public void setEmai(String emai) {
		this.emai = emai;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("nombre= ");
		builder.append(nombre);
		builder.append(", edad= ");
		builder.append(edad);
		builder.append(", emai= ");
		builder.append(emai);
 		return builder.toString();
	}
	 
	 
	public static int compararPorEdad(PersonaMetRef1 a, PersonaMetRef1 b)
	{
		return a.getEdad().compareTo(b.getEdad());
	}
	
	 
	 

}
