package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppFibonacci {
	
	public static void main(String[] args) {
		int iNum,numFi=1, numFi2=1, res=0;
		
		System.out.println("Dame un numero:");
		
		Scanner sc = new Scanner(System.in);
		iNum = sc.nextInt();
		
		for(int i=1; i<iNum; i++) {
			if(i==1) {
				System.out.print(numFi+" ");
			}
			
			System.out.print(numFi2+" ");			
			
			res = numFi + numFi2;
			numFi= numFi2;
			numFi2 = res;
			
		}
	}
}
