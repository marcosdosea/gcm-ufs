class GerenciadorVenda {
    public int realizarVenda() {
        GerenciadorCliente cliente = new GerenciadorCliente();
        cliente.insert(infoCliente);
    }

    public int removeVenda() {
        VendaDAO.remove(idVenda);
        return true;
    }
}