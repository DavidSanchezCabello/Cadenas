package es.studium.Cadenas;

import java.util.Scanner;

public class Copiar
{

	public static void main(String[] args)
	{
		Scanner teclado=new Scanner(System.in);
		String texto1,texto2;
		
		System.out.println("Introduzca un texto");
		texto1=teclado.nextLine();
		
		
		texto2=texto1;
		
		System.out.println(texto2);
		teclado.close();
	}

}
