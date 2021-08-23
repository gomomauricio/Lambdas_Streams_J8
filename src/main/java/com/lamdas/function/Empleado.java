package com.lamdas.function;

public class Empleado {

	private String nombre;
	private Double salario;
	
	public Empleado() {}
	
	public Empleado(String nombre, Double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	
	
	
}
