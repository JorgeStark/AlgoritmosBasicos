package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppMostrarNombre {
	
	public static void main(String[] args) 
	{
		String sNombre="";
		
		int cont2=0, cont3=0;
		
		System.out.println("Escribe un nombre: ");
		
		Scanner lectura = new Scanner(System.in);
		sNombre = lectura.nextLine();
		
		//For
		for(int cont=0; cont<100;cont++)
		{
			System.out.println(sNombre);
		}
		
		//While
		System.out.println("Escribe un nombre: ");
		sNombre = lectura.nextLine();
		
		while(cont2<100) 
		{
			System.out.println(sNombre);
			cont2++;
		}
		
		//Do-While
		System.out.println("Escribe un nombre: ");
		sNombre = lectura.nextLine();
		do 
		{
			System.out.println(sNombre);
			cont3++;
		}while(cont3<100);
	}

}
