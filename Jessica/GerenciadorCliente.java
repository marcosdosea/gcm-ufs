class GerenciadorCliente {
    public int inserir(Cliente cliente) {
        ClienteDAO.inserir(cliente);
    }

    public int consultar(Cliente cliente) {
        return ClienteDAO.consultar(cliente);
    }

    public int remove(Cliente cliente) {
        return ClienteDAO.remove(cliente);
    }

    public int alter(Cliente cliente) {
        return ClienteDAO.alter(cliente);
    }
}