package es.studium.Cadenas;

import java.util.Scanner;

public class MayusculasMinusculas {

	public static void main(String[] args) {
		
		String nom1= new String();
		
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduzca una cadena con mayúsculas y minúsculas entrelazadas");
		nom1=teclado.next();
		
		System.out.println("Mayúsculas: " + nom1.toUpperCase());
		System.out.println("minúsculas: "+ nom1.toLowerCase());
		teclado.close();		


	}

}
