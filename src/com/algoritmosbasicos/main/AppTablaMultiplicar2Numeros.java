package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppTablaMultiplicar2Numeros {
	
	public static void main(String[] args) {
		long iNum, iNum2,res=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero:");
		iNum = sc.nextInt();
		
		System.out.println("Dame otro numero:");
		iNum2 = sc.nextInt();
		
		for(int i=1; i<=iNum2; i++) {
			for(int j=1; j<=iNum; j++) {
				res = i * j;
				System.out.print(j+" * "+i+" = "+res+"\t");
			}
			System.out.println("");
		}
	}
}
