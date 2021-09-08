package com.lamdas.streams.operaciones.intermedias;

import java.util.Arrays;
import java.util.List;

public class EmpleadoFilter {
	
	private long id;
	private String nombre;
	private double ingresos;
	private Genero genero;
	private int edad;
	
	public EmpleadoFilter() {}
	
	public EmpleadoFilter(long id, String nombre, double ingresos, int edad, Genero genero) {
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
	
	
	public static List<EmpleadoFilter> empleados()
	{
		EmpleadoFilter e1 = new EmpleadoFilter(1, "Juan Perez", 538, 26, Genero.HOMBRE);
		EmpleadoFilter e2 = new EmpleadoFilter(2, "Alicia Ramirez", 600, 38, Genero.MUJER);
		EmpleadoFilter e3 = new EmpleadoFilter(3, "Juan Puga", 900, 36, Genero.HOMBRE);
		EmpleadoFilter e4 = new EmpleadoFilter(4, "Javier Vazquez", 330, 36, Genero.HOMBRE);
		EmpleadoFilter e5 = new EmpleadoFilter(5, "Evelyn Lopez", 450, 38, Genero.MUJER);
		EmpleadoFilter e6 = new EmpleadoFilter(6, "Esmeralda Lopez", 450.75, 46, Genero.MUJER);
		EmpleadoFilter e7 = new EmpleadoFilter(7, "Oyuki Navarro", 600, 25, Genero.MUJER);
		EmpleadoFilter e8 = new EmpleadoFilter(8, "Alvaro Mejia", 450.50, 35, Genero.HOMBRE);
		
		EmpleadoFilter e9 = new EmpleadoFilter(9, "Absalon Montreal", 125.45, 20, Genero.HOMBRE);
		EmpleadoFilter e10 = new EmpleadoFilter(10, "Ruth Sabiñon", 215.12,22, Genero.MUJER);
		EmpleadoFilter e11 = new EmpleadoFilter(11, "Lorenzo Arano", 545.15,26, Genero.HOMBRE);
		EmpleadoFilter e12 = new EmpleadoFilter(12, "Horacio Cervantes", 145.54,45, Genero.HOMBRE);
		EmpleadoFilter e13 = new EmpleadoFilter(13, "Julio Batista", 558.45,24, Genero.HOMBRE);
		EmpleadoFilter e14 = new EmpleadoFilter(14, "Edmundo Miler", 876.15,24, Genero.HOMBRE);
		EmpleadoFilter e15 = new EmpleadoFilter(15, "Angel Marquez", 897.55,38, Genero.HOMBRE);
		EmpleadoFilter e16 = new EmpleadoFilter(16, "Martha Sahagun", 124.45,50, Genero.MUJER);
		EmpleadoFilter e17 = new EmpleadoFilter(17, "Vicente Fox", 515.45,60, Genero.HOMBRE);
		EmpleadoFilter e18= new EmpleadoFilter(18, "Roberto pintado", 278.54,45, Genero.HOMBRE);
		EmpleadoFilter e19 = new EmpleadoFilter(19, "Alicia Villareal", 872.54,45, Genero.MUJER);
		EmpleadoFilter e20 = new EmpleadoFilter(20, "Lola Beltran", 245.77,26, Genero.MUJER);
		
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
	
	
	
	
	
	

}
