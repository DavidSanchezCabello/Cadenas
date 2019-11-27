package es.studium.Cadenas;

import java.util.Scanner;

public class Concatena {

	public static void main(String[] args) {
		
		String nom1= new String();
		String nom2="";
		String nom3=new String();
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduzca un nombre para la primera cadena");
		nom1=teclado.next();
		System.out.println("Introduzca otro nombre para la segunda cadena");
		nom2=teclado.next();
		nom3 = nom1+" " +nom2;
		
		System.out.println(String.format("La cadena '%s' concatenada con la cadena '%s' resulta '%s'",nom1,nom2,nom3));
		teclado.close();
	}

}
