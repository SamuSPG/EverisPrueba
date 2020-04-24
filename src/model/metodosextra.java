package model;

import java.util.Scanner;

public class metodosextra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner teclado = new Scanner(System.in);
	
	int num1 = 0;
	int num2 = 0;
	int result;
		
	System.out.println("Introduce el primer número:");			
	num1 = teclado.nextInt();
				
	System.out.println("Introduce el segundo número:");
	num2 = teclado.nextInt();
	
	result = num1+num2;

	System.out.println("La suma es " + num1 + " + " + num2 + " = " + result);

	}
	public int suma (int a, int b) {
    	a= 2; 
    	b = 2;
    	int result;
    	result = a-b;
	return result;	
    }
}
