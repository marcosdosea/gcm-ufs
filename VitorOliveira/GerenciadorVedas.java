import java.util.ArrayList;

public class GerenciadorVedas {
    private ArrayList<Venda> vendas;
    private int qtdVendas;

    public GerenciadorVedas() {
        this.vendas = new ArrayList<Venda>();
        this.qtdVendas = 0;
    }
    
    public Cliente criarVendaCliente(Venda venda, Cliente cliente) {
        cliente.venda = venda;
        return cliente;
    }
}
