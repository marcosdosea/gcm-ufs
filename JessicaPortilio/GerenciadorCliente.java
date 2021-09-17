class GerenciadorCliente {
    public int insert() {
        ClienteDAO.insert(cliente);
    }

    public int consult() {
        return ClienteDAO.consult(cliente);
    }
}