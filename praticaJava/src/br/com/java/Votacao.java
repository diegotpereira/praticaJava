package br.com.java;

import java.util.Scanner;

public class Votacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String candidato1, candidato2, candidato3, candidato4, candidato5;
	      
		int votos1, votos2, votos3, votos4, votos5;
	      
		int votacao, totalVotos, maiorVotacao;
	      
		votos1 = votos2 = votos3 = votos4 = votos5 = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Candidato1: ");
		candidato1 = teclado.nextLine();
		
		System.out.print("candidato2: ");
		candidato2 = teclado.nextLine();
		
		System.out.print("Candidato 3: ");
	    candidato3 = teclado.nextLine();
	    
	    System.out.print("Candidato 4: ");
	    candidato4 = teclado.nextLine();
	      
	    System.out.print("Candidato 5: ");  
	    candidato5 = teclado.nextLine();
		
	    totalVotos = 0;
	    
	    do {
			System.out.print("Digite o n�mero do seu candidato: ");
			votacao = teclado.nextInt();
			
			switch (votacao) {
			case 1:
				votos1++;
				totalVotos++;
				break;
				
			case 2 :
				votos2++;
	               totalVotos++;
	               break;

	            case 3:
	               votos3++;
	               totalVotos++;
	               break;

	            case 4:
	               votos4++;
	               totalVotos++;
	               break;

	            case 5:
	               votos5++;
	               totalVotos++;
	               break;

			default:
				if (votacao !=0) {
					System.out.print("Voto Inv�lido");
				}
			}
		} while (votacao !=0);

	    System.out.println("Candidato " +candidato1+" teve "+votos1+" votos");
	    System.out.println("Candidato "+candidato2+" teve "+votos2+" votos");
	    System.out.println("Candidato "+candidato3+" teve "+votos3+" votos");
	    System.out.println("Candidato "+candidato4+" teve "+votos4+" votos");
	    System.out.printf("Candidato %s teve %d votos\n", candidato5, votos5);      
	    System.out.printf("Total de Votos da Elei��o: %d\n", totalVotos);
	    
	    maiorVotacao = votos1;
	    
	    if (votos2 > maiorVotacao)
	         maiorVotacao = votos2;
	      
	    if (votos3 > maiorVotacao)
	         maiorVotacao = votos3;
	      
	    if (votos4 > maiorVotacao)
	         maiorVotacao = votos4;
	      
	    if (votos5 > maiorVotacao)
	         maiorVotacao = votos5;
	    
	    System.out.println("Candidato(s) Vencedor(es) da Elei��o:");
	      
	    if (votos1 == maiorVotacao)
	         System.out.println(candidato1);
	      
	    if (votos2 == maiorVotacao)
	         System.out.println(candidato2);
	      
	    if (votos3 == maiorVotacao)
	         System.out.println(candidato3);
	      
	    if (votos4 == maiorVotacao)
	         System.out.println(candidato4);
	      
	    if (votos5 == maiorVotacao)
	         System.out.println(candidato5);
	    
	    teclado.close();
	}

}
