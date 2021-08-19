package com.lamdas.main;

import com.lamdas.uso.Ficticia1;

public class TestMain {

	public static void main(String[] args)
	{
		System.out.println("Hola Lambdas & Streams");
		int v1 = 1;
		int v2 = 2;
		
//		Implementacion  Normal
//		Ficticia1 f = new Ficticia1() {
//			
//			public void aceptar(int v1, int v2) {
//				
//				System.out.println("El valor 1 " + v1 + " valor 2 " + v2);
//			}
//		};
		
		
//		Implementacion Lambda
		Ficticia1 f1 = (a1,a2) -> System.out.println("El valor 1 " + a1 + " valor 2 " + a2); 

		f1.aceptar(v1, v2);
	}

}
