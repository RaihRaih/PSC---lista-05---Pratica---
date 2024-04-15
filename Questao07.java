import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variáveis para armazenar os resultados
        double maiorIndiceAcidentes = 0, menorIndiceAcidentes = 1, mediaVeiculos = 0;
        int n, somaVeiculos = 0;
        String cidadeMaior = "", cidadeMenor = "";

        // Solicitar o número de cidades
        System.out.println("Informe o número de cidades:");
        n = input.nextInt();

        // Verificar se o número de cidades é válido
        if (n <= 0) {
            System.out.println("Número de cidades inválido.");
            return;
        }

        // Arrays para armazenar os dados das cidades
        String[] cidades = new String[n];
        int[] numVeiculos = new int[n];
        int[] numAcidentes = new int[n];

        // Preencher os arrays com os dados das cidades
        for (int i = 0; i < n; i++) {
            input.nextLine(); // Limpar o buffer
            System.out.println("Informe o nome da cidade:");
            cidades[i] = input.nextLine();
            System.out.println("Informe o número de veículos de passeio:");
            numVeiculos[i] = input.nextInt();
            System.out.println("Informe o número de acidentes de trânsito com vítimas:");
            numAcidentes[i] = input.nextInt();
        }

        // Calcular os resultados
        for (int i = 0; i < n; i++) {
            double indiceAcidentes = (double) numAcidentes[i] / numVeiculos[i];
            if (indiceAcidentes > maiorIndiceAcidentes) {
                maiorIndiceAcidentes = indiceAcidentes;
                cidadeMaior = cidades[i];
            }
            if (indiceAcidentes < menorIndiceAcidentes) {
                menorIndiceAcidentes = indiceAcidentes;
                cidadeMenor = cidades[i];
            }
            somaVeiculos += numVeiculos[i];
        }
        mediaVeiculos = (double) somaVeiculos / n;

        // Exibir os resultados
        System.out.println("Cidade com maior índice de acidentes de trânsito:");
        System.out.println("Nome da cidade: " + cidadeMaior);
        System.out.println("Índice de acidentes: " + maiorIndiceAcidentes);
        System.out.println("Cidade com menor índice de acidentes de trânsito:");
        System.out.println("Nome da cidade: " + cidadeMenor);
        System.out.println("Índice de acidentes: " + menorIndiceAcidentes);
        System.out.printf("Média de veículos nas %d cidades: %.2f%n", n, mediaVeiculos);

        input.close();
    }
}
