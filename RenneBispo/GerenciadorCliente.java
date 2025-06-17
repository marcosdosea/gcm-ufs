public Class GerenciadorCliente {

    public void inserir(Cliente cliente) {
        System.out.println("Cliente " + cliente.getNome() + " inserido com sucesso.");
    }

    public void consultar(Cliente cliente) {
        System.out.println("Consultando cliente: " + cliente.getNome());
    }
}
