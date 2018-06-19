package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppFactorial {

	public static void main(String[] args) 
	{
		long iNum,res=1;
		
		System.out.println("Hola Usuario");
		System.out.println("Dame un numero: ");
		
		Scanner sc = new Scanner(System.in);
		iNum = sc.nextInt();
		
		for(int cont=1; cont<=iNum; cont++) {
			res = res * cont;
			System.out.println("Factorial de "+cont+": "+res);
		}
	}
}
