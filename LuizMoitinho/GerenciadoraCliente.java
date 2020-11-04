

public class GerenciadoraCliente{
    protected int id;
    protected String nome;
    protected String endereco;

    public int inserir(Cliente cliente){
        this.id = cliente.id;
        this.nome = cliente.nome;
        this.endereco = cliente.endereco;
        
        return 1;
        
    }

    public int getId(){
        return this.id;
    }

}