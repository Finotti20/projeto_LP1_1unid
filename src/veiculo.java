public class veiculo {

    private int idcarro;
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double valorLocacao;
    boolean disponibilidade;

    public veiculo(String marca, String modelo, String placa, int ano, double valorLocacao){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valorLocacao = valorLocacao;
    }
}
