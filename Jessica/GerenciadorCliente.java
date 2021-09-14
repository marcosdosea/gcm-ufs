class GerenciadorCliente {
    public int inserir(Cliente cliente) {
        ClienteDAO.insert(cliente);
    }

    public int consultar(Cliente cliente) {
        return ClienteDAO.consult(cliente);
    }

    public int remover(Cliente cliente) {
        return ClienteDAO.remove(cliente);
    }

    public int editar(Cliente cliente) {
        return ClienteDAO.edit(cliente);
    }
}