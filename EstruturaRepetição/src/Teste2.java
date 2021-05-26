import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) throws Exception {
        
        String nome = "a";

        String senha = "a";

        while (nome.equals(senha)){

            System.out.println("Digite seu nome:");
            
            Scanner entrada = new Scanner(System.in);

            nome = entrada.nextLine();

            System.out.println("Digite sua senha:");
            
            entrada = new Scanner(System.in);

            senha = entrada.nextLine();

            if(nome.equals(senha)){
            
                System.out.println("Senha inválida!");
            
            }
            else{
            
                System.out.println("Cadastro válido!");
            
            }
        }
    }
}