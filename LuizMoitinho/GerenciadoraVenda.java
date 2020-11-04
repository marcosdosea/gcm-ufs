

public class GerenciadoraVenda{
    protected int id;
    protected int id_cliente;
    protected String nome;
    protected float valor;

    protected GerenciadoraCliente cliente = new GerenciadoraCliente();

    public int inserir(Venda venda){
        this.id = venda.id;
        this.nome = venda.nome;
        this.valor = venda.valor;
        
        this.id_cliente = cliente.getId();

    }


}