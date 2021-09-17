class GerenciadorCliente {
    public int insert(Cliente cliente) {
        ClienteDAO.insert(cliente);
    }

    public int consult(Cliente cliente) {
        return ClienteDAO.consult(cliente);
    }
    public int remove() {
        return ClienteDAO.remove(cliente);
    }

    public int alter() {
        return ClienteDAO.alter(cliente);
    }

}