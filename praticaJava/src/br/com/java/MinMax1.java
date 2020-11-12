package br.com.java;

import java.util.Scanner;

public class MinMax1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.print("Digite o  primeiro número inteiro: ");
		n1 = teclado.nextInt();
		
		System.out.print("Digite o segundo número inteiro: ");
		n2 = teclado.nextInt();
		
		System.out.print("Digite o terceiro número inteiro: ");
		n3 = teclado.nextInt();
		
		if (n1 > n2) {
			if (n1 > n3) {
				if (n2 < n3) {
					System.out.println("O menor número é: " + n2);
				} else {
					System.out.println("O menor número é: " + n3);
				}
				System.out.println("O maior numero é: " + n1);
			} else {
				if (n1 < n2) {
					System.out.println("O menor número é: " + n1);
				} else {
					System.out.println("O menor número é: " + n2);
				}
				System.out.println("O maior número é: " + n3);
			}
			
		} else {
			if (n2 > n3) {
				if (n1 < n3) {
					System.out.println("O menor número e´:" + n1);
				} else {
					System.out.println("O menor número é: " + n3 );
				}
				System.out.println("O mairo número é: " + n2);
			} else {
				if (n1 < n2) {
					System.out.println("O menor número é: " + n1);
				} else {
					System.out.println("O menor número é " + n2);
				}
				System.out.println("O maior número é: " + n3);

			}

		}

	}

}
