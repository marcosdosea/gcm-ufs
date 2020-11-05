

public class GerenciadoraCliente{
    protected int id;
    protected String dataNascimento;
    protected String nome;
    protected String endereco;
    protected String CPF;

    private DAOCliente DAOCliente = new DAOCliente();


    public int inserir(Cliente cliente){
        this.id = cliente.id;
        this.nome = cliente.nome;
        this.endereco = cliente.endereco;
        this.dataNascimento = cliente.dataNascimento;
        this.CPF = cliente.CPF;
        
        return 1;
        
    }

    public int getId(){
        return this.id;
    }


    public Boolean remover(Cliente cliente){
        if(cliente)
           return this.DAOCliente.delete(cliente);
        return false;

    }

}