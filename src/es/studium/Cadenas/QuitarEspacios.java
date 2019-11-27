package es.studium.Cadenas;

import java.util.Scanner;

public class QuitarEspacios
{

	public static void main(String[] args)
	{
		String cadena1, cadena2;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un texto");
		cadena1=teclado.nextLine();
		
		cadena2=cadena1.replaceAll(" ", "");	
		System.out.println("La frase sin espacios queda de la siguiente manera: "+cadena2);
		
		teclado.close();

	}

}
