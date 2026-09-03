import java.util.Scanner;

public class principal {

    static Scanner scanner = new Scanner(System.in);
    static lojaLocadora loja = new lojaLocadora();

    public static void main(String[] args) {

        boolean continuarPrograma = true;

        while(continuarPrograma){

            cadastroCliente clienteLogado = autenticarOuCadastrar();

            System.out.println("Bem-vindo, " + clienteLogado.getNome() + "!");

            boolean logout = false;
            int opcao;

            do {
                System.out.print("---MENU PRINCIPAL---\n");
                System.out.print("(1)CONSULTAR DISPONIBILIDADE DE VEÍCULOS\n");
                System.out.print("(2)FAZER LOCAÇÃO\n");
                System.out.print("(3)CADASTRAR NOVO VEÍCULO\n");
                System.out.print("(4)LOGOUT\n");
                System.out.print("(5)ENCERRAR CÓDIGO\n");
                System.out.print("Escolha uma opção: ");

                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        // consultar disponibilidade
                        break;
                    case 2:
                        // fazer locação
                        break;
                    case 3:
                        System.out.println("Digite a marca do carro:");
                        String marca = scanner.nextLine();

                        System.out.println("Digite o modelo do veículo:");
                        String modelo = scanner.nextLine();

                        System.out.println("Digite a placa do veículo:");
                        String placa = scanner.nextLine();

                        System.out.println("Digite o ano de fabricação do veículo:");
                        int ano = scanner.nextInt();

                        System.out.println("Digite o valor da diária do veículo:");
                        double valorLocacao = scanner.nextDouble();

                        veiculo veiculo = new veiculo(marca, modelo, placa, ano,valorLocacao);
                        break;
                    case 4:
                        System.out.println("Voltando ao menu de login...");
                        logout = true;
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }

            } while (opcao != 4);
        }

    }

    public static cadastroCliente autenticarOuCadastrar() {
        cadastroCliente clienteLogado = null;

        while (clienteLogado == null) {
            System.out.println("Você já possui cadastro? (S/N)");
            String resposta = scanner.nextLine().trim().toUpperCase();

            if (resposta.equalsIgnoreCase("Sim")) {
                clienteLogado = fazerLogin();

                if (clienteLogado == null) {
                    System.out.println("Cadastro não encontrado.");
                }

            } else if (resposta.equalsIgnoreCase("Não")) {
                clienteLogado = criarCadastro();

            } else {
                System.out.println("Resposta inválida. Digite Sim ou Não.");
            }
        }

        return clienteLogado;
    }

    public static cadastroCliente fazerLogin() {
        System.out.println("Digite seu email:");
        String email = scanner.nextLine();

        System.out.println("Digite sua senha:");
        String senha = scanner.nextLine();

        return loja.autenticarCliente(email, senha);
    }

    public static cadastroCliente criarCadastro() {
        System.out.println("Digite seu nome:");
        String Nome = scanner.nextLine();

        System.out.println("Digite seu email:");
        String email = scanner.nextLine();

        System.out.println("Digite sua senha:");
        String Senha = scanner.nextLine();

        System.out.println("Digite seu CPF:");
        String CPF = scanner.nextLine();

        System.out.println("Digite seu endereço:");
        String Endereco = scanner.nextLine();

        System.out.println("Digite seu telefone:");
        String Telefone = scanner.nextLine();

        cadastroCliente novoCliente = new cadastroCliente(Nome, CPF, Endereco, email, Telefone, Senha);
        loja.CadastrarCliente(novoCliente);

        System.out.println("Cadastro realizado com sucesso!");
        return novoCliente;
    }
}
