import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) throws Exception {
        
        String nome = "a";

        int idade = -1;

        Double salario = (double) -1;

        String sexo = "a";

        String EC = "a";

        while (nome.length() < 3){

            System.out.println("Digite seu nome:");
            
            Scanner entrada = new Scanner(System.in);

            nome = entrada.nextLine();

            if(nome.length() < 3){
            
                System.out.println("Nome inválido!");
            
            }
            else{
            
                System.out.println("Nome válido!");
            
            }
        } //fim do while do nome
        
        while ( idade>150 || idade<0 ){

            System.out.println("Digite sua idade:");
            
            Scanner entrada = new Scanner(System.in);

            idade = entrada.nextInt();

            if( idade>150 || idade<0){
            
                System.out.println("Idade inválida!");
            
            }
            else{
            
                System.out.println("Idade válida!");
            
            }
        } //fim do while da idade

        while (salario < 0){

            System.out.println("Digite seu salário:");
            
            Scanner entrada = new Scanner(System.in);

            salario = entrada.nextDouble();

            if(salario<0){
            
                System.out.println("Salário inválida!");
            
            }
            else{
            
                System.out.println("Salário válida!");
            
            }
        } //fim do while de salário

        while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")){

            System.out.println("Digite seu gênero (F / M)"); // Foda dever assim, queria fazer de um jeito menos ofencivo, mas mta preguiça de criar código pra isso, perdão

            Scanner entrada = new Scanner(System.in);
            
            sexo = entrada.next();
    
            if ("f".equalsIgnoreCase(sexo)){
    
                System.out.println("Seu gênero é Feminino");
    
            }
            else if("m".equalsIgnoreCase(sexo)){
    
                System.out.println("Seu gênero é Masculino");
    
                }
    
                else{
    
                    System.out.println("Invalido");
            
            }
        } //fim do while de sexo

        while (!EC.equalsIgnoreCase("s") && !EC.equalsIgnoreCase("c") && !EC.equalsIgnoreCase("v") && !EC.equalsIgnoreCase("d")){

            System.out.println("Digite seu Estado Civil (S / C / V / D)"); // Foda dever assim, queria fazer de um jeito menos ofencivo, mas mta preguiça de criar código pra isso, perdão

            Scanner entrada = new Scanner(System.in);
            
            EC = entrada.next();
    
            if ("s".equalsIgnoreCase(EC)){
    
                System.out.println("Você é solteiro ");
    
            }
            else if("c".equalsIgnoreCase(EC)){
    
                System.out.println("Você é Casado");
    
                }
    
                else if ("v".equalsIgnoreCase(EC)){
    
                    System.out.println("Você é Viuvo");
                }
                else if ("d".equalsIgnoreCase(EC)){
    
                    System.out.println("Você é Divorciado");
                }
                else{

                    System.out.println("Invalido");

                }
        } //fim do while de EC

    }
}