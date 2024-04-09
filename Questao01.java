/*Raissa Rodrigues - Sistemas de Informação
Faça um programa que receba várias idades, 
calcule e mostre a média das idades digitadas.
Finalize digitando idade igual a zero.*/

import java.util.Scanner;

public class Questao01
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int somaIdades = 0;
		int idade = 0;
		int contadorIdades = 0;
		double media = 0;
		
		System.out.println("Some idades(Digite ZERO para sair): ");
		
		do {
            idade = scanner.nextInt();
            
            if (idade != 0) {
                somaIdades += idade;//soma TODAS as idades lidas
                contadorIdades++;// conta quantas idades foram lidas[ valor de N ]
            }
        } while (idade != 0);
		media = somaIdades / contadorIdades;
		System.out.println("Soma das Idades: " + somaIdades + "\nMedia: " + media + "\nQauntidade de idades digitadas: "+ contadorIdades);
	}
}
