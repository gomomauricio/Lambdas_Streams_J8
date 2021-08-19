package com.lamdas.main;

import com.lamdas.uso.ExpLambda;

public class ExpLambdaMain {

	public static void main(String[] args)
	{
		System.out.println("Inicia ExpLambda");
		int v1 = 1;
		int v2 = 2;
		
		ExpLambda f1 = par -> System.out.println("*** " + par);
		f1.accept(v2);
		
		ExpLambdaMain m1 = new ExpLambdaMain();
		
//		Implementacion Normal
//		m1.Metodo(new ExpLambda() 
//				{
//			         public void accept(int entero)
//			         {
//			        	 System.out.println("## " + entero);
//			         }
//				});
	

//		Expresion Lambda
		m1.Metodo( par -> System.out.println("@@@ " + par));
		
		 m1.Metodo(f1); //
	}
	
	
	public void Metodo(ExpLambda par)
	{
		System.out.println(" ___ ____ ___");
		par.accept(0);
	}
	
}
