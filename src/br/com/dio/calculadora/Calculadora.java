package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a,b;
		System.out.print("Dgite o a: ");
		a = scan.nextInt(); 
		System.out.print("Digite o b: ");
		b = scan.nextInt();
	
		int soma = soma(a , b);
		int sub = sub(a,b);
		float div = div(a,b);
		int mul = mult(a,b);
		
		System.out.println("soma = " + soma + 
				"\nsub = " + sub + "\ndiv = " + div +
				"\nmult = " + mul);
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	public static float div(float a, float b) {
		return a / b;
	}
	public static int mult(int a, int b) {
		return a * b;
	}

}
