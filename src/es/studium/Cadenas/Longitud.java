package es.studium.Cadenas;

import java.util.Scanner;

public class Longitud
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);

		String frase;
		int longitudCon;
		int longitudSin;
		System.out.println("Introduzca una frase");
		frase = teclado.nextLine();
		longitudCon = calcularLong1(frase);
		System.out.println("Longitud" + calcularLong1(frase));
		longitudSin = calcularLong2(frase);
		System.out.println("Longitud" + calcularLong2(frase));
		teclado.close();

	}

	public static int calcularLong1(String cadena)
	{

		int resultado = 0;

		// resultado = cadena.length();
		for (int i = 0; i < cadena.length(); i++)
		{
			resultado++;
		}

		return resultado;

	}

	public static int calcularLong2(String cadena)
	{

		int resultado = 0;

		// resultado = cadena.length();
		for (int i = 0; i < cadena.length(); i++)
		{
			if (cadena.charAt(i) != ' ')
			{
				resultado++;
			}
		}

		return resultado;

	}

}
