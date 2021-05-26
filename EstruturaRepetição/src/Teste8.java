import java.util.Scanner;

public class Teste8 {
    private static String[] args;

    public static void main(String[] args) throws Exception {
        int Q = 1;
        double soma = 0;

        System.out.printf("Quantos númeors quer usar? ");
        Scanner scan = new Scanner(System.in);
        Q = scan.nextInt();

        double val[] = new double[Q];
        int m = 1;

        for (int n = 0; n < Q; n++) {
            System.out.printf("Digite seu " + m + "º número: ");
            scan = new Scanner(System.in);
            val[n] = scan.nextDouble();
            m++;
        }

        for (int i = 0; i < Q; i++) {
            soma = soma + val[i];
        }

        System.out.println(" A soma de sues números é: " + soma + "e a média é: " + (soma/Q));

    }
}