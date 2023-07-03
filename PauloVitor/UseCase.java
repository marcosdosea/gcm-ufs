public class UseCase{

    protected String nome;
    protected String cpf;
    protected int codigo;
    
    public CadastroCliente(String nome, int codigo, String cpf){
        this.nome = nome;
        this.codigo = codigo;
        this.cpf = cpf;
    }

}