import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;


public class lojaLocadora {
    private List<cadastroCliente> clientes;
    private List<veiculo> veiculos;
    private List<locacao> locacoes;

    public lojaLocadora(){
        clientes= new ArrayList<>();
        veiculos= new ArrayList<>();
        locacoes= new ArrayList<>();

    }

    public void CadastrarCliente(cadastroCliente cliente){
        clientes.add(cliente);
    }

    public void CadastrarVeiculo(veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void realizarAluguel(cadastroCliente cliente, veiculo veiculo, LocalDate dataRetirada, LocalDate dataDevolucao) {

        // Verifica se o veículo está disponível
        if (!veiculo.isDisponibilidade()) {
            throw new IllegalArgumentException("Veículo já está alugado.");
        }

        // Calcula o valor total da locação
        long dias = java.time.temporal.ChronoUnit.DAYS.between(dataRetirada, dataDevolucao);
        double valorTotal = dias * veiculo.getvalorLocacao();
        boolean finalizado = false;

        // Cria a locação
        locacao locacao = new locacao(cliente, veiculo, dataRetirada, dataDevolucao, valorTotal, finalizado);

        locacoes.add(locacao);
    }

    public void listarClientes() {

        for (cadastroCliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void listarVeiculos() {

        for (veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }
    }

    public void listarLocacoes() {

        for (locacao locacao : locacoes) {
            System.out.println("----------------------");
            System.out.println(locacao);
        }
    }

    public cadastroCliente autenticarCliente(String email, String senha) {
        for (cadastroCliente cliente : clientes) {
            if (cliente.getEmail().equals(email) && cliente.getSenha().equals(senha)) {
                return cliente; // encontrado
            }
        }
        return null; // não encontrado
    }

}
