

public class GerenciadoraVenda{
    protected int id;
    protected int id_cliente;
    protected String nome;
    protected float valor;
    protected GerenciadoraCliente cliente = new GerenciadoraCliente();
    private DAOVenda DAOVenda = new DAOVenda();

    public int inserir(Venda venda){
        this.id = venda.id;
        this.nome = venda.nome;
        this.valor = venda.valor;

        this.id_cliente = cliente.getId();

    }


    public Boolean update(GerenciadoraVenda venda){
        if(venda)
            return this.DAOVenda.update(venda);
        return false;
    }

}