package com.lamdas.pedicate;

public class EmpleadoPred {
	
	private String nombre;
	private Integer edad;
	private Double salario;
	private String Departamento;
	
	public EmpleadoPred() {}
	
	public EmpleadoPred(String nombre, Integer edad, Double salario, String departamento) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		Departamento = departamento;
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

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" ");
		builder.append(nombre);
		builder.append(",");
		builder.append(edad);
		builder.append(",");
		builder.append(salario);
		builder.append(",");
		builder.append(Departamento);
		builder.append("\n");
 
		return builder.toString();
	}
	
	
	
	

}
