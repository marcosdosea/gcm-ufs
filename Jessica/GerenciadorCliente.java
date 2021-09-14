class GerenciadorCliente {
    public int inserir(Cliente cliente) {
        ClienteDAO.insert(cliente);
    }

    public int consultar(Cliente cliente) {
        return ClienteDAO.consult(cliente);
    }
}