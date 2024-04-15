import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int N = scanner.nextInt();

        double soma = 0;

        for (int i = 1; i <= N; i++) {
            soma += 1.0 / i;
        }

        System.out.println("O valor de H é: " + soma);

        scanner.close();
    }
}
