public class cadastroCliente {

    private int IDCliente;
    public String login;
    private String Nome;
    private String CPF;
    private String Endereco;
    private String email;
    private String Telefone;
    private String Senha;

    public cadastroCliente(int IDCliente, String Nome, String CPF, String Endereco, String email, String Telefone, String Senha){
        this.IDCliente = IDCliente;
        this.Nome = Nome;
        this.CPF = CPF;
        this.Endereco = Endereco;
        this.email = email;
        this.Telefone = Telefone;
        this.Senha = Senha;

    }
}
