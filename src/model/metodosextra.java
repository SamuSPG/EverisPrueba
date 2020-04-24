package model;

import java.util.Scanner;

public class metodosextra {

	public static int suma(int num1, int num2) {
		
		
	Scanner teclado = new Scanner(System.in);
	
	num1 = 0;
	num2 = 0;
	int result;
		
	System.out.println("Introduce el primer número:");			
	num1 = teclado.nextInt();
				
	System.out.println("Introduce el segundo número:");
	num2 = teclado.nextInt();
	
	result = num1+num2;

	System.out.println("La suma es " + num1 + " + " + num2 + " = " + result);
	return result;	

	}
	public static int Resta (int a, int b) {
    	a= 2; 
    	b = 2;
    	int result;
    	result = a-b;
	return result;	
    }
}
