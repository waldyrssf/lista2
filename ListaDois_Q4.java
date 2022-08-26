//Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e imprima os
//elementos numericos que sejam primos.

import java.util.Scanner;

public class ListaDois_Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int elementos[];
        int qntdElementos=0;
        int contador = 0;
        
        
        System.out.println("Quantos números aleatórios você deseja testar?");
        qntdElementos = sc.nextInt();
        
        elementos = new int[qntdElementos];
        
        for(int i = 0; i < elementos.length; i++) {
        	elementos[i] = (int)(Math.random()*10);
        	System.out.println(elementos[i]);
            
            for(int j = 1; j <= i; j++) {
            	if(i%j==0)
            	contador++;
            }

        }
        
        
        if(contador==2) {
        	System.out.println("é primo");
        }else {
        	System.out.println("n é primo");
        }

		
		sc.close();

	}

}
