/*Raissa Rodrigues - Sistemas de Informação
Foi feita uma pesquisa sobre a audiência de canal de TV em várias casas de uma cidade, em determinado dia. 
Para cada casa consultada foi fornecido o número do canal (4, 5, 7, 12) e o número de pessoas que estavam assistindo aquele canal. 
Se a televisão estivesse desligada, nada era anotado, ou seja, essa casa não entrava na pesquisa. Faça um programa que:
leia um número indeterminado de dados (número do canal e número de pessoas que estavam assistindo); e
calcule e mostre a porcentagem de audiência de cada canal.
Para encerrar a entrada de dados, digite o número do canal ZERO.
 */
import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 0;
        int[] contagemCanal = new int[4]; // Array para armazenar a contagem de pessoas para cada canal

        System.out.println("Bem-vindo ao programa de audiência de TV!");

        while (true) {
            System.out.println("\nPara adicionar uma casa, digite [1];\nPara encerrar o programa, digite [0];");
            int continuar = scanner.nextInt();

            if (continuar == 0) {
                break; // Encerra o loop se o usuário digitar 0
            } else if (continuar != 1) {
                System.out.println("Opção inválida. Por favor, digite 0 ou 1.");
                continue; // Volta ao início do loop se a opção for inválida
            }

            System.out.println("\nSua TV está ligada?\nDigite: S [Sim]\tN [Não]");
            char resposta = scanner.next().charAt(0);

            if (resposta == 'S' || resposta == 's') {
                System.out.println("\nDigite o número do canal [4, 5, 7, 12]: ");
                int canal = scanner.nextInt();

                // Verifica se o número do canal é válido
                if (canal == 4 || canal == 5 || canal == 7 || canal == 12) {
                    System.out.println("Digite o número de pessoas assistindo: ");
                    int pessoasAssistindo = scanner.nextInt();

                    // Atualiza a contagem total de pessoas
                    totalPessoas += pessoasAssistindo;

                    /*Incrementa a contagem de pessoas para o canal correspondente 
                    contagem[i] em cada posição: 0=4,1=5,2=7,3=12*/
                    switch (canal) {
                        case 4:
                            contagemCanal[0] += pessoasAssistindo;//incrementa
                            break;
                        case 5:
                            contagemCanal[1] += pessoasAssistindo;
                            break;
                        case 7:
                            contagemCanal[2] += pessoasAssistindo;
                            break;
                        case 12:
                            contagemCanal[3] += pessoasAssistindo;
                            break;
                    }
                } else {
                    System.out.println("Canal inválido. Por favor, digite um número válido.");
                }
            }
        }

        System.out.println("Porcentagem de Audiência:");
            System.out.printf("Canal 4: %.2f" + (contagemCanal[0] * 100.0 / totalPessoas) + "%");
            System.out.printf("Canal 5: %.2f" + (contagemCanal[1] * 100.0 / totalPessoas) + "%");
            System.out.printf("Canal 7: %.2f" + (contagemCanal[2] * 100.0 / totalPessoas) + "%");
            System.out.printf("Canal 12: %.2f" + (contagemCanal[3] * 100.0 / totalPessoas) + "%");
        scanner.close();
    }
}