package es.studium.Cadenas;

import java.util.Scanner;

public class Comparacion
{

	public static void main(String[] args)
	{
		String pal1, pal2;
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduzca una cadena");
		pal1 = teclado.next();
		
		System.out.println("Introduzca una posicion");
		pal2 = teclado.next();

			System.out.println("la mayor de las dos es: "+ funMayor(pal1,pal2));
	}
public static String funMayor(String a, String b) {
	
	String mayorFinal = "";
	int i;
	
	if(a==b) {
		mayorFinal = a;
	} else {
	for ( i = 0; (i<b.length()) || (i<a.length()) ;i++) {
		if(a.charAt(i)>b.charAt(i)) {
			mayorFinal = b;
			i = b.length();
		} else {
			mayorFinal = a;
			i = a.length();
		}		
	}
	}
	return mayorFinal;

	
}
	
}

