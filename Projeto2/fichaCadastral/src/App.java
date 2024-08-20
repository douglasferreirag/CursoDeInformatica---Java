import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner input = new Scanner(System.in);

        System.out.println();

        System.out.println("Bem vindo (a) ao Curso de informática");
        System.out.println("Insira seus dados corretamente para que possamos te cadastrar em nosso banco de dados: ");
        
        System.out.println("Digite seu nome: ");
        String nome = input.next();

        System.out.println("Digite sua data de nascimento: ");
        String dataNascimento = input.next();
       

        System.out.println("Digite sua cidade: ");
        String cidade = input.next();

        System.out.println("Digite a sigla do seu estado: ");
        String estado = input.next();

        System.out.println("Digite o curso que deseja fazer: ");
        String curso = input.next();

        System.out.println("Inscrição concluída com sucesso.");
    
    }
}
