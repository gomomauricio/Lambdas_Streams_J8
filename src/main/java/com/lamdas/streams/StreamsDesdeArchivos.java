package com.lamdas.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDesdeArchivos {

	public static void main(String[] args) {
		System.out.println("______________________________ leyendo archivo");
		 
		 Path pt1 = Paths.get("Texto1.txt");
		
		 try(Stream<String> lineas = Files.lines(pt1)) 
		 {
//			 lineas.forEach( System.out::println);
			 lineas.forEach(
					 		linea -> {
					 			        System.out.println("Linea...");
					 			        System.out.println(linea);
					 		         }
					 );
			 
			 
		 }
		 catch (IOException e) {
			e.printStackTrace();
		}
		 
		 System.out.println(" ___________ con directorios");
		 Path dir = Paths.get("."); // le pasamos el directorio donde estamos
		 System.out.printf("%nEl directorio de archivos del proyecto para: %s es %n ",dir.toAbsolutePath());
		
		 
		 try(Stream<Path> pts = Files.walk(dir))
		 {
			 pts.forEach( System.out::println);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
