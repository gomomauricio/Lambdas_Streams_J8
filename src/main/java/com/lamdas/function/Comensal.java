package com.lamdas.function;

public class Comensal {
	
	private String nombre;
	private Double monto_pedido;
	private Integer mesa;
	
	public Comensal() {}
	
	public Comensal(String nombre, Double monto_pedido, Integer mesa) {
		super();
		this.nombre = nombre;
		this.monto_pedido = monto_pedido;
		this.mesa = mesa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getMonto_pedido() {
		return monto_pedido;
	}

	public void setMonto_pedido(Double monto_pedido) {
		this.monto_pedido = monto_pedido;
	}

	public Integer getMesa() {
		return mesa;
	}

	public void setMesa(Integer mesa) {
		this.mesa = mesa;
	}
	
	
	
	
	

}
