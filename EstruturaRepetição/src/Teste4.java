
public class Teste4 {
    public static void main(String[] args) throws Exception {
        
    double A = 80000;
    double Pa = 0.03;
    double B = 200000;
    double Pb = 0.015;

        for (int anos = 0; A<B; anos++){

            A = A+(A*Pa);
            B = B+(B*Pb);
            System.out.println(anos);

        }
    }
}