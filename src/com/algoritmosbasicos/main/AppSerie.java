package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppSerie {

	public static void main(String[] args) {
		int opcion;
		char opcion2;
		
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Selecciona una opcion \n 1-Serie 1-50\n 2-Serie 50-1\n 3-Serie de 2 en 2");
		opcion = sc.nextInt();
		
		
			switch(opcion) {
				case 1:
					for(int i = 1; i<=50; i++) {
						System.out.print(i+" ");
					}
					break;
				case 2:
					System.out.println("");
					for(int i = 50; i>0; i--) {	
						System.out.print(i+" ");
					}
					break;
				case 3:
					System.out.println("En construccion.....");
					break;
				
			}
			System.out.println("Desea realizar otra operación");
			opcion2 = sc.next().charAt(0);
		}while(opcion2 == 's' || opcion2 == 'S');	
	}

}
