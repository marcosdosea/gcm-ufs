public class GerenciadorCliente;

    public void inserir(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Inserido!");
    }

    public Cliente consultar(int id) {
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null; 
    }