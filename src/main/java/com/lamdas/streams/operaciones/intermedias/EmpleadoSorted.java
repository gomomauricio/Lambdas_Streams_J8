package com.lamdas.streams.operaciones.intermedias;

import java.util.Arrays;
import java.util.List;

public class EmpleadoSorted implements Comparable {
	
	private long id;
	private String nombre;
	private double ingresos;
	private Genero genero;
	private int edad;
	
	public EmpleadoSorted() {}
	
	public EmpleadoSorted(long id, String nombre, double ingresos, int edad, Genero genero) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ingresos = ingresos;
		this.genero = genero;
		this.edad = edad;
	}



	public static enum Genero
	{
		HOMBRE,MUJER
	}
	
	public boolean isHombre()
	{
		return this.genero == Genero.HOMBRE;
	}

	public boolean isMujer()
	{
		return this.genero == Genero.MUJER;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getIngresos() {
		return ingresos;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public static List<EmpleadoSorted> empleados()
	{
		EmpleadoSorted e1 = new EmpleadoSorted(1, "Juan Perez", 538, 26, Genero.HOMBRE);
		EmpleadoSorted e2 = new EmpleadoSorted(2, "Alicia Ramirez", 600, 38, Genero.MUJER);
		EmpleadoSorted e3 = new EmpleadoSorted(3, "Juan Puga", 900, 36, Genero.HOMBRE);
		EmpleadoSorted e4 = new EmpleadoSorted(4, "Javier Vazquez", 330, 36, Genero.HOMBRE);
		EmpleadoSorted e5 = new EmpleadoSorted(5, "Evelyn Lopez", 450, 38, Genero.MUJER);
		EmpleadoSorted e6 = new EmpleadoSorted(6, "Esmeralda Lopez", 450.75, 46, Genero.MUJER);
		EmpleadoSorted e7 = new EmpleadoSorted(7, "Oyuki Navarro", 600, 25, Genero.MUJER);
		EmpleadoSorted e8 = new EmpleadoSorted(8, "Alvaro Mejia", 450.50, 35, Genero.HOMBRE);
		
		EmpleadoSorted e9 = new EmpleadoSorted(9, "Absalon Montreal", 125.45, 20, Genero.HOMBRE);
		EmpleadoSorted e10 = new EmpleadoSorted(10, "Ruth Sabiñon", 215.12,22, Genero.MUJER);
		EmpleadoSorted e11 = new EmpleadoSorted(11, "Lorenzo Arano", 545.15,26, Genero.HOMBRE);
		EmpleadoSorted e12 = new EmpleadoSorted(12, "Horacio Cervantes", 145.54,45, Genero.HOMBRE);
		EmpleadoSorted e13 = new EmpleadoSorted(13, "Julio Batista", 558.45,24, Genero.HOMBRE);
		EmpleadoSorted e14 = new EmpleadoSorted(14, "Edmundo Miler", 876.15,24, Genero.HOMBRE);
		EmpleadoSorted e15 = new EmpleadoSorted(15, "Angel Marquez", 897.55,38, Genero.HOMBRE);
		EmpleadoSorted e16 = new EmpleadoSorted(16, "Martha Sahagun", 124.45,50, Genero.MUJER);
		EmpleadoSorted e17 = new EmpleadoSorted(17, "Vicente Fox", 515.45,60, Genero.HOMBRE);
		EmpleadoSorted e18= new EmpleadoSorted(18, "Roberto pintado", 278.54,45, Genero.HOMBRE);
		EmpleadoSorted e19 = new EmpleadoSorted(19, "Alicia Villareal", 872.54,45, Genero.MUJER);
		EmpleadoSorted e20 = new EmpleadoSorted(20, "Lola Beltran", 245.77,26, Genero.MUJER);
		
		return Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,
				             e11,e12,e13,e14,e15,e16,e17,e18,e19,e20);
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("#");
		builder.append(id);
		builder.append(", ");
		builder.append(nombre);
		builder.append(", $");
		builder.append(ingresos);
		builder.append(", ");
		builder.append(genero);
		builder.append(", ");
		builder.append(edad);
		builder.append(" años");
		return builder.toString();
	}

	@Override
	public int compareTo(Object o) {
		return this.getNombre().compareTo( ((EmpleadoSorted)o).getNombre() );
	}
	
	
	
	
	
	

}
