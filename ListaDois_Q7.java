//Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e imprima o maior
//e menor elemento.

import java.util.Scanner;

public class ListaDois_Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int elementos[];
        int qntdElementos=0;
        int maior = 0;
        int menor = 0;
        
        
        System.out.println("Quantos elementos?");
        qntdElementos = sc.nextInt();
        
        elementos = new int[qntdElementos];
        
        for(int i = 0; i < elementos.length; i++) {
        	elementos[i] = (int)(Math.random()*100);
        	System.out.println(elementos[i]);
        	maior = elementos[i];
        	menor = elementos[i];
        }
        
        System.out.println("O menor e o maior são: ");

        for(int i = 0; i < elementos.length; i++) {
        	if(elementos[i]>maior) {
        		maior = elementos[i];
        	}else if(elementos[i] < menor) {
        		menor = elementos[i];
        	}
        }
        	
        	System.out.println("Menor é: " + menor);
        	System.out.println("Maior é: " + maior);
 
       
		
		sc.close();
	}

}
