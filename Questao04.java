import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 10 dez idades, pesos e alturas: ");

        int[] idade = new int[10];
        int[] peso = new int[10];
        double[] altura = new double[10];

        for (int i = 0; i < idade.length; i++) {
            System.out.println("Digite a idade: ");
            idade[i] = scan.nextInt();
            System.out.println("Digite o peso: ");
            peso[i] = scan.nextInt();
            System.out.println("Digite a altura: ");
            altura[i] = scan.nextDouble();
        }

        // Calculando a média das idades
        int somaIdades = 0;
        for (int i = 0; i < idade.length; i++) {
            somaIdades += idade[i];
        }
        double mediaIdades = (double) somaIdades / idade.length;
        System.out.println("A média das idades é: " + mediaIdades);

        // Contando a quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 metro
        int countPessoas = 0;
        for (int i = 0; i < peso.length; i++) {
            if (peso[i] > 90 && altura[i] < 1.50) {
                countPessoas++;
            }
        }
        System.out.println("Quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 m: " + countPessoas);

        // Calculando a porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m
        int countPessoasAltura = 0;
        int countPessoasIdade = 0;
        for (int i = 0; i < idade.length; i++) {
            if (altura[i] > 1.90) {
                countPessoasAltura++;
                if (idade[i] >= 10 && idade[i] <= 30) {
                    countPessoasIdade++;
                }
            }
        }
        double porcentagem = (double) countPessoasIdade / countPessoasAltura * 100;
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m: " + porcentagem + "%");

        scan.close();
    }
}
