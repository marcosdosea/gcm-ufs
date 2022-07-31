package Lauro;

public class GerenciadorVenda {
    public void Venda(Object cliente, int idVendedor){
        return new GerenciadorCliente().inserirCliente(cliente);
    } 
}
