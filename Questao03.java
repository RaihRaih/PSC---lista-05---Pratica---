/*Raissa Rodrigues - Sistemas de Informação
Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Média aritmética
2. Média ponderada
3. Sair
Digite a opção desejada.
Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar média ponderada.
Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida. Nesse caso, o programa deverá mostrar uma mensagem. */

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a opção desejada: \n[1]. Média aritmética\t[2]. Média ponderada\t[3]. Sair");
        int opcao = scanner.nextInt();

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Calcular média aritmética");
            System.out.println("2. Calcular média ponderada");
            System.out.println("3. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                System.out.println("Digite a primeira nota:");
                double nota1 = scanner.nextDouble();
        
                System.out.println("Digite a segunda nota:");
                double nota2 = scanner.nextDouble();
        
                double media = (nota1 + nota2) / 2;
        
                System.out.println("A média aritmética é: " + media);
                break;

                case 2:
                System.out.println("Digite a primeira nota:");
                double nota3 = scanner.nextDouble();
                System.out.println("Digite o peso da primeira nota:");
                double peso1 = scanner.nextDouble();
        
                System.out.println("Digite a segunda nota:");
                double nota4 = scanner.nextDouble();
                System.out.println("Digite o peso da segunda nota:");
                double peso2 = scanner.nextDouble();
        
                System.out.println("Digite a terceira nota:");
                double nota5 = scanner.nextDouble();
                System.out.println("Digite o peso da terceira nota:");
                double peso3 = scanner.nextDouble();
        
                double somaPesos = peso1 + peso2 + peso3;
                double mediaPonderada = (nota3 * peso1 + nota4 * peso2 + nota5 * peso3) / somaPesos;
        
                System.out.println("A média ponderada é: " + mediaPonderada);
                break;

                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
                }
            
        } while (opcao!= 3);
    
        scanner.close();
    }
}
