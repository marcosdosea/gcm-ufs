

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

    
    public Boolean validaVenda(){

        return this.id != 0 && this.valor>0 && this.id_cliente!=0 ? true:false;
        
    }

    public Boolean update(GerenciadoraVenda venda){
        if(venda)
            return this.DAOVenda.update(venda);
        return false;
    }

}