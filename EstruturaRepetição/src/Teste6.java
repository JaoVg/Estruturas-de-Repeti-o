import java.util.Scanner;

public class Teste6 {
    public static void main(String[] args) throws Exception {

        int num [] = new int[21] ;

        for(int n = 1 ; n <= 20 ; n++) {
            System.out.println("Digite o seu " + n + "º número");
            Scanner scan = new Scanner(System.in);
            num[n] = scan.nextInt();
        }
        for (int con = 1 ; con <= 20 ; con++){
            System.out.print("Seu " + con + "º número foi: " + num[con] + ", ");
        }
    }
}