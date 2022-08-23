//Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e imprima os elementos. 
//Alem disso, deve-se realizar a impress̃ao inversa tambem.

import java.util.Scanner;

public class ListaDois_Q3 {

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
        
        System.out.println("O inverso é: ");
        
        for(int i = elementos.length-1; i >= 0; i--) {
        	System.out.println(elementos[i]);
        
        }

        sc.close();
	}

}
