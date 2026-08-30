import java.util.Scanner;

public class LocadoraDeVeiculos {

    public static void main(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("O usuário já possui cadastro?: ");
        String login = entrada.nextLine();

        if(login.equalsIgnoreCase("Não")){

            System.out.print("Digite seu nome: ");
            String nome = entrada.nextLine();

            System.out.print("Digite seu CPF: ");
            String CPF = entrada.nextLine();

            System.out.print("Digite seu endereço: ");
            String Endereco = entrada.nextLine();

            System.out.print("Digite seu E-mail: ");
            String email = entrada.nextLine();

            System.out.print("Digite seu telefone: ");
            String Telefone = entrada.nextLine();

            System.out.print("Digite sua senha: ");
            String Senha = entrada.nextLine();
        }else {
            System.out.print("---MENU PRINCIPAL---");
            System.out.print("(1)CONSULTAR DISPONIBILIDADE DE VEÍCULOS");
            System.out.print("(2)FAZER LOCAÇÃO");
            System.out.print("(3)CADASTRAR VEÍCULO");

            int opcao = entrada.nextInt();

            if(opcao == 1){


            }
        }


    }
}
