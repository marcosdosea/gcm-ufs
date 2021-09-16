class GerenciadorVenda
{
    private GerenciadorCliente _clientes = new GerenciadorCliente();
    public void novaVenda(Cliente cliente, int idVendedor, string data){
        this._clientes.inserir(cliente);
        // print idVendedor
        // print data
    } 
}