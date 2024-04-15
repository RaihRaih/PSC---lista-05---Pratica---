public class Questao09 {
    public static void main(String[] args) {
        double soma = 0;

        for (int i = 1, j = 1000; i <= 50; i++, j -= 3) {
            if (i % 2 == 0) {
                soma -= j / i;
            } else {
                soma += j / i;
            }
        }

        System.out.println("A soma dos 50 primeiros termos da série S é: " + soma);
    }
}
