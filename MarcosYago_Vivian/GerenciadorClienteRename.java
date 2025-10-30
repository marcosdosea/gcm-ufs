public class GerenciadorCliente {

    public void inserir(Cliente cliente) {
        if (cliente.Nome != null) {
            cliente.Nome = cliente.Nome.toUpperCase();
        }
        context.add(cliente); 
    }

    public void atualizar(Cliente cliente) {
        context.merge(cliente);
        System.out.println("Cliente atualizado:: " + cliente.Nome);
    }
    
}