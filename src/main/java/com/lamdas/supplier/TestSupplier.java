package com.lamdas.supplier;

import java.util.function.Supplier;

public class TestSupplier 
{

	public static void main(String[] args) {
		Supplier<String> sup1 = () -> "Ingeniero";
		System.out.println("El valor de sup1 es: " + sup1.get());
	}
}
