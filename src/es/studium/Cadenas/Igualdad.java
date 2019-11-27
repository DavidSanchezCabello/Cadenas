package es.studium.Cadenas;

import java.util.Scanner;

public class Igualdad {

	public static void main(String[] args) {
		

		String nom1= new String();
		String nom2="";
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduzca un nombre para la primera cadena");
		nom1=teclado.next();
		System.out.println("Introduzca otro nombre para la segunda cadena");
		nom2=teclado.next();
		
		
		if (nom1.equals(nom2)) {
			
			System.out.println("Las cadenas son iguales");
		}else {
			System.out.println("Las cadenas son distintas");
		}
teclado.close();
	}

}
