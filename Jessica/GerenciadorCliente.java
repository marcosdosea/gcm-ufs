class GerenciadorCliente {
    public int inserir(Cliente cliente) {
        ClienteDAO.inserir(cliente);
    }

    public int consultar(Cliente cliente) {
        return ClienteDAO.consultar(cliente);
    }

    public int remover(Cliente cliente) {
        return ClienteDAO.remover(cliente);
    }

    public int alterar(Cliente cliente) {
        return ClienteDAO.alterar(cliente);
    }
}