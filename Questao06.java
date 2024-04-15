import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int escolha;
        double salario = 0, imposto = 0, salarioNovo = 0;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. imposto");
            System.out.println("2. Novo salário");
            System.out.println("3. classificação");
            System.out.println("4. finalizar o programa");
            System.out.print("Digite a opção desejada: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite seu salário: ");
                    salario = input.nextDouble();
                    if (salario < 1400) {
                        imposto = (salario / 100) * 5;
                    } else if (salario >= 1400 && salario < 2500){
                        imposto = (salario / 100) * 10;
                    } else{
                        imposto = (salario / 100) * 15;
                    }
                    System.out.println("O imposto à ser pago é: " + imposto);
                    break;

                case 2:
                    System.out.print("Digite seu salário: ");
                    salario = input.nextDouble();
                    if (salario > 5000) {
                        salarioNovo = salario + 25;
                    } else if(salario >= 2500 && salario <= 5000){
                        salarioNovo = salario + 50;
                    } else if(salario >= 1400 && salario < 2500){
                        salarioNovo = salario + 75;
                    } else{
                        salarioNovo = salario + 100;
                    }
                    System.out.println("Seu novo salário é: " + salarioNovo);
                    break;

                case 3:
                    System.out.print("Digite seu salário: ");
                    salario = input.nextDouble();
                    if (salario <= 1400) {
                        System.out.println("Mal-remunerado");
                    } else{
                        System.out.println("Bem-remunerado");
                    }
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
}
