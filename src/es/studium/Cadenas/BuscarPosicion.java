package es.studium.Cadenas;

import java.util.Scanner;

public class BuscarPosicion
{

	public static void main(String[] args)
	{
		String frase;
		char caracter;
		int posicion = -1;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca una frase");
		frase = teclado.nextLine();
		System.out.println("Introduzca un caracter");
		caracter = teclado.next().charAt(0);

		for (int i = 0; i < frase.length(); i++)
		{
			if (frase.charAt(i) == caracter)
			{
				posicion = i;
				i = frase.length();
			}

		}
		if (posicion == -1)
		{
			System.out.println("No encontrado");
		} else
		{
			System.out.println("Se ha encontrado en la posición " + posicion);
		}

	}

}
