package es.studium.Cadenas;

import java.util.Scanner;

public class Nombres {

	public static void main(String[] args) {
		
		String nom1;
		String nom2 = new String("");
		String nom3 = new String();
		String nom4 = "";
		String nom5 = new String();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una cadena");
		nom1=teclado.next();
		System.out.println("Dame otra cadena");
		nom2=teclado.next();
		System.out.println("Dame otra mas cadena");
		nom3=teclado.next();
		System.out.println("Dame la penúltima cadena");
		nom4=teclado.next();
		System.out.println("Dame la última cadena");
		nom5=teclado.next();
		
		System.out.println(String.format("Las cadenas son '%s',' %s',' %s','%s' y \"%s\"",nom1,nom2,nom3,nom4,nom5));
		teclado.close();
		
		


	}

}
