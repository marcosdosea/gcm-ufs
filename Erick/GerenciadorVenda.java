class GerenciadorVenda {
    public int realizarVenda(Cliente infoCliente) {
        GerenciadorCliente cliente = new GerenciadorCliente();
        cliente.inserir(infoCliente);
    }
}