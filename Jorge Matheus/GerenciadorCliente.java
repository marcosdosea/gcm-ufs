public class GerenciadoraCliente{
    private int id;
    private String nome;
    private String endereco;
    
    private ACliente ACliente = new ACliente();


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