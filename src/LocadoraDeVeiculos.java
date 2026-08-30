import java.util.Scanner;

public class LocadoraDeVeiculos {

    public static void main(){
        int opcao;
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

            cadastroCliente cliente = new cadastroCliente(nome, CPF, Endereco, email, Telefone, Senha);
        }else {

            do{
                System.out.print("---MENU PRINCIPAL---");
                System.out.print("(1)CONSULTAR DISPONIBILIDADE DE VEÍCULOS");
                System.out.print("(2)FAZER LOCAÇÃO");
                System.out.print("(3)CADASTRAR NOVO VEÍCULO");
                System.out.print("(4)SAIR");
                opcao = entrada.nextInt();

                switch (opcao){
                    case 1:
                        break;

                    case 2:
                        break;

                    case 3:
                        System.out.print("Digite a marca do carro: ");
                        String marca = entrada.nextLine();

                        System.out.print("Digite o modelo do carro: ");
                        String modelo = entrada.nextLine();

                        System.out.print("Digite a placa do carro: ");
                        String placa = entrada.nextLine();

                        System.out.print("Digite o ano de fabricação do veículo: ");
                        int ano = entrada.nextInt();

                        System.out.print("Digite o valor da diária do carro: ");
                        double valorLocacao = entrada.nextDouble();

                        veiculo veiculo = new veiculo(marca, modelo, placa, ano, valorLocacao);

                        break;

                    case 4:
                        break;
                }

            }while(opcao !=5);
        }


    }
}
