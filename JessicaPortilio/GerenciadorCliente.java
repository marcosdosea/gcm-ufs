class GerenciadorCliente {
    public int insert(Cliente cliente) {
        ClienteDAO.insert(cliente);
    }

    public int consult(Cliente cliente) {
        return ClienteDAO.consult(cliente);
    }
}