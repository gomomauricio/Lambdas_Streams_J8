package com.lamdas.function;

import java.util.function.Function;

public class DatosComensal 
{
	
	public static void main(String[] args) {
		Comensal com1 = new Comensal("Javier", 256.2, 5);
		String nombreCom = (String) getDatoComensal( com1 , x -> x.getNombre());
		int mesa = (int) getDatoComensal(com1, x -> x.getMesa());
		double monto = (double) getDatoComensal(com1, x -> x.getMonto_pedido());
		
		System.out.println("Nombre: " + nombreCom );
		System.out.println("Monto: " + mesa );
		System.out.println("Mesa: " + monto );
	}
	
	
	public static Object getDatoComensal(
			  Comensal com, Function<Comensal, Object> func
			){
		 
		return func.apply(com);  
	}
	

}
