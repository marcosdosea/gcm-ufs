class GerenciadorVenda {
    public int realizarVenda(Cliente infoCliente) {
        GerenciadorCliente cliente = new GerenciadorCliente();
        cliente.insert(infoCliente);
    }

    public int removeVenda(int idVenda) {
        VendaDAO.remove(idVenda);
        return true;
    }
}