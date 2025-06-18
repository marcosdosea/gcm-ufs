public Class GerenciadorCliente {

    public void inserir(Cliente cliente) {
        System.out.println("Cliente " + cliente.getNome() + " inserido com sucesso.");
    }

    public void consultar(Cliente cliente) {
        System.out.println("Consultando cliente: " + cliente.getNome());
    }
    
    public void remover(Cliente cliente) {
        System.out.println("Cliente " + cliente.getNome() + " removido com sucesso.");
    }

    public void alterar(Cliente cliente) {
        System.out.println("Cliente " + cliente.getNome() + " alterado com sucesso.");
    }

}
