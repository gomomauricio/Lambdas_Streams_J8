package com.lamdas.streams.operaciones.reduccion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.lamdas.streams.operaciones.intermedias.EmpleadoSorted;

public class TestReduce {

	public static void main(String[] args)
	{
		
		int[] numeros = {4,6,10,12,15,55,7,8,9,10,2,5,8,9,10,45,6,9,33,66,85,97,81,24,99};
		List<EmpleadoSorted> empleados = EmpleadoSorted.empleados();
		
		int suma = 0;
		
		suma = IntStream.of(numeros)
						.reduce(0, new IntBinaryOperator() 
								{
									@Override
									public int applyAsInt(int left, int right) 
									{ //System.out.println("	entra " + left + " y " + right);
										return left + right;
									}
								}
								);
		System.out.println("La suma es: " + suma);
		
		suma = IntStream.of(numeros)
//				.reduce( 0, (num1,num2) -> num1 + num2  );
				.reduce( 0, (num1,num2) -> Integer.sum(num1, num2)  );

		System.out.println("La suma es: " + suma);
		
		formatArch();
	}
	
	
	public static void formatArch()
	{
		System.out.println("______________________________ leyendo archivo");
	
		Path pt = Paths.get("Texto1.txt");
		String sinComas = "___";
		
		try(Stream<String> lineas = Files.lines(pt)) 
		{
			sinComas = lineas.map( linea -> linea.replace("'", "*") ) //quitamos comas
							 .reduce("",(ln1,ln2) -> ln1.concat(" \n").concat(ln2) );
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//grabamos a un archivo
		try(BufferedWriter bw = new BufferedWriter( new FileWriter("SinComas.txt"))) {
			bw.write(sinComas);
			System.out.println("Se guardo ---> " + sinComas);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
 
	
	
}
