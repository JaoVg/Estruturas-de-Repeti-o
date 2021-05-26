import java.util.Scanner;

public class Teste7 {
    private static String[] args;

    public static void main(String[] args) throws Exception {
        int Q = 1;

        System.out.printf("Quantos númeors quer comparar? ");
        Scanner scan = new Scanner(System.in);
        Q = scan.nextInt();

        double val[] = new double[Q];
        double ma = 1;
        int m = 1;

        for (int n = 0 ; n < Q ; n++){
            System.out.printf("Digite seu " + m + "º número: ");
            scan = new Scanner(System.in);
            val[n] = scan.nextDouble();
            m++;
            ma = val[n];
        }

        for (int n=0 ; n<Q ; n++) {
            ma = Math.max(ma, val[n]);
        }

        System.out.println("O numero maior é: " + ma);
    }
}