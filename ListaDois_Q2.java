//Dada a entrada de 10 inteiros em sequencia, realize a impressao da entrada inicial de forma inversa.

import java.util.Scanner;

public class ListaDois_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int[] vetor = new int[10];
        
        System.out.println("Digite 10 números");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }
        
        System.out.println("O inverso das suas entradas foram: ");
        
        for(int i = vetor.length-1; i >= 0; i--){
            System.out.println(vetor[i]);
            sc.close();
	}

		
	}

}
