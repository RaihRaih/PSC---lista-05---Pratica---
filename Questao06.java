import java.util.Scanner;

public class Questao6 {
    // Constantes para as faixas de salário e as taxas de imposto
    private static final double FAIXA1_MIN = 1400;
    private static final double FAIXA2_MIN = 2500;
    private static final double TAXA_FAIXA1 = 5;
    private static final double TAXA_FAIXA2 = 10;
    private static final double TAXA_FAIXA3 = 15;

    // Constantes para os aumentos de salário
    private static final double AUMENTO_FAIXA1 = 100;
    private static final double AUMENTO_FAIXA2 = 75;
    private static final double AUMENTO_FAIXA3 = 50;
    private static final double AUMENTO_FAIXA4 = 25;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int escolha;
        double salario = 0, imposto = 0, salarioNovo = 0;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Imposto");
            System.out.println("2. Novo salário");
            System.out.println("3. Classificação");
            System.out.println("4. Finalizar o programa");
            System.out.print("Digite a opção desejada: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite seu salário: ");
                    salario = input.nextDouble();
                    imposto = calcularImposto(salario);
                    System.out.println("O imposto a ser pago é: " + imposto);
                    break;

                case 2:
                    System.out.print("Digite seu salário: ");
                    salario = input.nextDouble();
                    salarioNovo = calcularNovoSalario(salario);
                    System.out.println("Seu novo salário é: " + salarioNovo);
                    break;

                case 3:
                    System.out.print("Digite seu salário: ");
                    salario = input.nextDouble();
                    classificarSalario(salario);
                    break;

                case 4:
                    System.out.println("Você saiu do programa!");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, digite 1, 2, 3 ou 4.");
                    break;
            }
        } while (escolha != 4);

        input.close();
    }

    // Método para calcular o imposto com base no salário
    private static double calcularImposto(double salario) {
        if (salario < FAIXA1_MIN) {
            return (salario / 100) * TAXA_FAIXA1;
        } else if (salario < FAIXA2_MIN) {
            return (salario / 100) * TAXA_FAIXA2;
        } else {
            return (salario / 100) * TAXA_FAIXA3;
        }
    }

    // Método para calcular o novo salário com base no salário atual
    private static double calcularNovoSalario(double salario) {
        if (salario > 5000) {
            return salario + AUMENTO_FAIXA4;
        } else if (salario >= FAIXA2_MIN) {
            return salario + AUMENTO_FAIXA3;
        } else if (salario >= FAIXA1_MIN) {
            return salario + AUMENTO_FAIXA2;
        } else {
            return salario + AUMENTO_FAIXA1;
        }
    }

    // Método para classificar o salário como mal ou bem remunerado
    private static void classificarSalario(double salario) {
        if (salario <= FAIXA1_MIN) {
            System.out.println("Mal-remunerado");
        } else {
            System.out.println("Bem-remunerado");
        }
    }
}
