class GerenciadorCliente {
    public int inserir(Cliente cliente) {
        ClienteDAO.insert(cliente);
    }
}