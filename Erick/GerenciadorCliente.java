class GerenciadorCliente {
    public int inserir(Cliente cliente) {
        ClienteDAO.insert(cliente);
    }

    public int remover(Cliente cliente) {
        return ClienteDAO.remove(cliente);
    }
}