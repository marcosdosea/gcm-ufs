public Class GerenciadorCliente {

    public void inserir(Cliente cliente) {
        System.out.println("Cliente " + cliente.getNome() + " inserido com sucesso.");
        System.out.println("ID: " + cliente.getId());
    }
    
    public void remover(Cliente cliente) {
        System.out.println("ID: " + cliente.getId());
        System.out.println("Cliente " + cliente.getNome() + " removido com sucesso.");
    }

    public void alterar(Cliente cliente) {
        System.out.println("Novo ID: " + cliente.getId());
        System.out.println("Novo nome: " + cliente.getNome());
        System.out.println("Novo email: " + cliente.getEmail());
        System.out.println("Novo telefone: " + cliente.getTelefone());
        System.out.println("Novo endereço: " + cliente.getEndereco());
        System.out.println("Cliente " + cliente.getNome() + " alterado com sucesso.");
    }

    public void consultar(Cliente cliente) {
        System.out.println("Consultando cliente: " + cliente.getNome());
        System.out.println("ID: " + cliente.getId());
    }
}
