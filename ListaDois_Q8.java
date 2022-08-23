//Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e realize o calculo
//da media aritmetica.

import java.util.Scanner;

public class ListaDois_Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantidadeNotas;
		float notas[];
		float resultado=0;
		
		System.out.println("Quantas notas você deseja inserir?");
		quantidadeNotas = sc.nextInt();
		
		notas = new float[quantidadeNotas];
		
        
        for(int i = 0; i < notas.length; i++) {
        	notas[i] = (int)(Math.random()*100);
        	System.out.println(notas[i]);
        }
        
		
		for(int i = 0; i < notas.length; i++) {
			resultado = resultado + notas[i];
		}
		
		System.out.println("A média aritmética é " + resultado/notas.length);
		
		
		
		
		sc.close();
	}

}
