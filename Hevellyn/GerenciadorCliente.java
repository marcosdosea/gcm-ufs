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
public void remover(int id) {
    Cliente cli = consultar(id);
    if (c != null) {
        clientes.remove(cli);
    }
}

public void alterar(int id, String nvNome, String Email) {
    Cliente cli = consultar(id);
    if (cli != null) {
        c.setNome(nvNome);
        c.setEmail(Email);

    }
}