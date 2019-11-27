package es.studium.Cadenas;

import java.util.Scanner;

public class CambiarAporO
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String cadena;

		System.out.println("Introduzca un texto");
		cadena = teclado.nextLine();

		System.out.println(cadena.replace('a', 'o'));
		System.out.println(cadena);
		cadena = cadena.replace('a', 'o');
		System.out.println(cadena);
		teclado.close();
	}

}
