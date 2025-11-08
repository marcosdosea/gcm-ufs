public package ThiagoLima;

class GerenciadorCliente {

    public void inserir(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente inserido com sucesso!");
    }

    public Cliente consultar(int id) {
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null; 
    }
}