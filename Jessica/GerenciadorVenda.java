class GerenciadorVenda {
    public int realizarVenda(Cliente infoCliente) {
        GerenciadorCliente cliente = new GerenciadorCliente();
        cliente.inserir(infoCliente);
    }

    public int removerVenda(int idVenda) {
        VendaDAO.remove(idVenda);
        return true;
    }
}