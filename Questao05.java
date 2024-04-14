import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSim = 0;
        int totalNao = 0;
        int mulheresSim = 0;
        int homensSim = 0;
        int totalHomens = 0;

        System.out.println("Pesquisa de mercado: ");
        System.out.println("Responda S para sim e N para não.");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Entrevistado " + i + ":");
            System.out.print("Sexo: [M] / [H] ");
            char sexo = scanner.next().charAt(0);
            System.out.print("Resposta [S] / [N]: ");
            char resposta = scanner.next().charAt(0);

            if (resposta == 'S') {
                totalSim++;
                if (sexo == 'F') {
                    mulheresSim++;
                } else {
                    homensSim++;
                }
            } else if (resposta == 'N') {
                totalNao++;
            } else {
                System.out.println("Resposta inválida. Por favor, responda S ou N.");
                i--; // Decrementar o contador para repetir esta iteração
            }

            if (sexo == 'M') {
                totalHomens++;
            }
        }

        double percentualHomensNao = 0;
        if (totalHomens > 0) {
            percentualHomensNao = (double) totalNao / totalHomens * 100;
        }

        System.out.println("\nResultados da pesquisa:");
        System.out.println("Total de pessoas que responderam sim: " + totalSim);
        System.out.println("Total de pessoas que responderam não: " + totalNao);
        System.out.println("Total de mulheres que responderam sim: " + mulheresSim);
        System.out.println("Percentagem de homens que responderam não: " + percentualHomensNao + "%");

        scanner.close();
    }
}
