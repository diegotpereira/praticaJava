package praticaJava;

import java.util.Scanner;

public class TurmaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		String aluno;
		float nota1, nota2, media, soma, mediaTurma;
		
		soma = 0;
		for (int i = 0; i <3; i++) {
			System.out.print("Por favor digite o nome do aluno:");
			aluno = teclado.next();
			
			System.out.print("Por favor digite a primeira nota:");
			nota1 = teclado.nextFloat();
			
			System.out.print("Por favor digite a segunda nota");
			nota2 = teclado.nextFloat();
			
			media = (nota1+nota2)/2;
			soma = soma + media;
			System.out.print("A média do aluno foi %.1f\\n" + media);
			
			if (media >= 6 ) 
				System.out.print("O aluno foi aprovado. Parabéns.");
			
			else 
				
				System.out.println("O aluno foi reprovado! Estude mais.");
		}
		
		mediaTurma = soma/3;
		
		System.out.printf("A média da turma = %.1f/n", mediaTurma);
		
		teclado.close();

	}

}
