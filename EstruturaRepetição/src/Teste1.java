import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args) throws Exception {
        
        double nota = 10000;

        while ( nota>10 || nota<0 ){

            System.out.println("Digite sua nota: ");
            
            Scanner entrada = new Scanner(System.in);

            nota = entrada.nextDouble();

            if(nota>10 || nota <0){
            
                System.out.println("Nota inválida!");
            
            }
            else{
            
                System.out.println("Nota válida!");
            
            }
        }
    }
}