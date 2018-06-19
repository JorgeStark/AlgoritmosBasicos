package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppTablaMultiplicar {

	public static void main(String[] args) {
		int iNum=0,res=0;
		System.out.println("Dame un numero:");
		
		Scanner sc = new Scanner(System.in);
		iNum = sc.nextInt();

		for(int i=1; i<=20; i++) {
			res = iNum * i;
			System.out.println(iNum+" * "+i+" = "+res);
		}
	}

}
