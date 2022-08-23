//Crie um algoritmo que preencha um Array com 100 n ́umeros inteiros aleatoriamente e imprima os
//elementos numericos que sejam pares.

import java.util.Scanner;

public class ListaDois_Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int elementos[];
        int qntdElementos=0;
        
        
        System.out.println("Quantos elementos?");
        qntdElementos = sc.nextInt();
        
        elementos = new int[qntdElementos];
        
        for(int i = 0; i < elementos.length; i++) {
        	elementos[i] = (int)(Math.random()*100);
        	System.out.println(elementos[i]);
        }
        
        System.out.println("O(s) par(es) é(são): ");
        
        for(int i = 0; i < elementos.length; i++) {
        	if(elementos[i]%2==0)
        		System.out.println(elementos[i]);
        }

		sc.close();

	}

}
