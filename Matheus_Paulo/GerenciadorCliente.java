public class GerenciadorCliente {

    public void inserir(Cliente cliente) {
        cliente.Nome = cliente.Nome.ToUpper();
        context.Add(cliente);
    }

}
