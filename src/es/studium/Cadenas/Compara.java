package es.studium.Cadenas;

import java.util.Scanner;

public class Compara {

	public static void main(String[] args) {
		
		String nom1= new String();
		String nom2="";
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduzca un nombre para la primera cadena");
		nom1=teclado.next();
		System.out.println("Introduzca otro nombre para la segunda cadena");
		nom2=teclado.next();
		
		if (nom1.length()==nom2.length()) {
		
		System.out.println("Son iguales");
		}else if (nom1.length()<nom2.length()) {
			System.out.println("La primera cadena es menor que la segunda");
	}else   {
			System.out.println("La primera cadena es mayor que la segunda");
	}teclado.close();
	}

}
