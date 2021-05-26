import java.util.Arrays;
import java.util.Scanner;

public class Teste9 {
    private static String[] args;

    public static void main(String[] args) throws Exception {
        int Q = 1, p = 0, i = 0;
        double soma = 0;

        System.out.printf("Quantos números quer digitar? ");
        Scanner scan = new Scanner(System.in);
        Q = scan.nextInt();

        double val[] = new double[Q];
        double par[] = new double[Q];
        double impar[] = new double[Q];
        int m = 1;

        for (int n = 0; n < Q; n++) {
            System.out.printf("Digite seu " + m + "º número: ");
            scan = new Scanner(System.in);
            val[n] = scan.nextDouble();
            m++;
        }

        for (int n = 0; n < Q; n++) {
            if((val[n] % 2) == 0){
                par[p] = val [n];
                p++;
            }
            else{
                impar[i] = val[n];
                i++;
            }
        }
        
        System.out.println ("Seus numeros pares são: ");
        for(int n = 0; n < p; n++){
            System.out.println(par[n]);
        }

        System.out.println ("Seus numeros impares são: ");
        for(int n = 0; n < i; n++){
            System.out.println(impar[n]);
        }
    }
}
