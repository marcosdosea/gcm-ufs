class GerenciadorCliente {
    public int insert(Cliente cliente) {
        ClienteDAO.insert(cliente);
    }

    public int consult(Cliente cliente) {
        return ClienteDAO.consult(cliente);
    }
    public int remove(Cliente cliente) {
        return ClienteDAO.remove(cliente);
    }

    public int alter(Cliente cliente) {
        return ClienteDAO.alter(cliente);
    }

}