public class GerenciadorVenda {
    
    public Cliente criarVendaCliente(Venda venda, Cliente cliente) {
        cliente.venda = venda;
        return cliente;
    }
}
