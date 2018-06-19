package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppIsPrimo {

	public static void main(String[] args) {
		int iNum=0;
		char opcion;
		boolean isPrimo = true;
		
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			isPrimo=true;
			System.out.print("Dame un Numero: ");
			iNum = sc.nextInt();
			
			for(int i= 2; i<iNum; i++) 
			{
				if(iNum %i ==0) 
				{
					isPrimo=false;
				}
			}
			
			if(isPrimo==false) 
			{
				System.out.println("El numero no es primo");
			}
			else 
			{
				System.out.println("El numero es primo");
			}
			
			System.out.println("Quiere realizar otra operacion");
			opcion = sc.next().charAt(0);
			
		}while(opcion=='s' || opcion=='S');
	}
}
