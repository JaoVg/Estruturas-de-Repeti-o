import java.util.Scanner;

public class Teste5 {
    public static void main(String[] args) throws Exception {
        
    double A;
    double Pa;
    double B;
    double Pb;
    
    System.out.println("Digite a população da cidade menor");
    Scanner entrada = new Scanner(System.in);
    A = entrada.nextDouble();

    System.out.println("Digite a taxa de crecimento da cidade menor (em %, apenas números)");
    entrada = new Scanner(System.in);
    Pa = entrada.nextDouble();
    Pa = Pa/100;

    System.out.println("Digite a população da cidade maior");
    entrada = new Scanner(System.in);
    B = entrada.nextDouble();

    System.out.println("Digite a taxa de crecimento da cidade maior (em %, apenas números)");
    entrada = new Scanner(System.in);
    Pb = entrada.nextDouble();
    Pb = Pb/100;

        for (int anos = 0; A<B; anos++){

            A = A+(A*Pa);
            B = B+(B*Pb);
            System.out.println(anos);

        }
    }
}