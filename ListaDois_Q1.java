//Escreva um algoritmo em Java que solicite 5 notas e realize o calculo da media aritmetica ao termino
//da execucao.

import java.util.Scanner;

public class ListaDois_Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int quantidadeNotas;
		float notas[];
		float resultado=0;
		
		System.out.println("Quantas notas você deseja inserir?");
		quantidadeNotas = sc.nextInt();
		
		notas = new float[quantidadeNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Insira a nota " + (i+1));
			notas[i] = sc.nextFloat();
			resultado = resultado + notas[i];
		}
		
		System.out.println("A média aritmética é " + resultado/notas.length);
		
		sc.close();
	}

}
