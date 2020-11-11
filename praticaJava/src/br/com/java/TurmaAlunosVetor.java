package br.com.java;

import java.util.Scanner;

public class TurmaAlunosVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		String aluno [];
		
		float nota1[], nota2[], media[], mediaTurma;
		aluno = new String [30];
		nota1 = new float [30];
		nota2 = new float [30];
		media = new float [30];
		
		mediaTurma = 0;
		
		for (int i = 0; i <3; i++) {
			System.out.print("Digite o nome do aluno: ");
			aluno[i] = teclado.nextLine();
			
			System.out.print("Digite a primeira nota: ");
			nota1 [i] = teclado.nextFloat();
			
			System.out.print("Digite a segunda nota: ");
			nota2 [i] = teclado.nextFloat();
			
			teclado.nextLine();
			
			media[i] = (nota1[i] + nota2 [i])/2;
			mediaTurma += media[i];
			
			System.out.printf("a média do aluno é %1f\n", media[i]);
			
			if (media[i] >= 6)
				System.out.println("O aluno foi aprovado. Parabéns!.");
			
			else 
				System.out.println("O aluno foi reprovado! Estude mais.");
		}
		
		mediaTurma /= 3;
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("aluno: %s - Média: &.1f\n", aluno[i], media[i]);
			System.out.printf("Média da turma = %.1f\n", mediaTurma);
			
			teclado.close();
		}

	}

}
