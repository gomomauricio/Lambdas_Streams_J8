package com.lamdas.streams;

public class EstudianteStreams 
{
	private String identificacion;
	private Integer edad;
	private double altura;
	private double promedio;
	
	public EstudianteStreams() {}
	
	public EstudianteStreams(String identificacion, Integer edad, double altura, double promedio) {
		super();
		this.identificacion = identificacion;
		this.edad = edad;
		this.altura = altura;
		this.promedio = promedio;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("id=");
		builder.append(identificacion);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", promedio=");
		builder.append(promedio); 
		return builder.toString();
	}
	
	
	 
	
	
	

}
