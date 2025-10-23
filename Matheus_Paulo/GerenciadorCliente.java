public class GerenciadorCliente {

    public void inserir(Cliente cliente) {
        cliente.Nome = cliente.Nome.ToUpper();
        context.Add(cliente);
    }

    public void atualizar(Cliente cliente){
        if (cliente == null) return;
        cliente.Nome = cliente.Nome.toUpperCase();
        for (int i = 0; i < context.size(); i++) {
            if (context.get(i).Id == cliente.Id) {
                context.set(i, cliente);
                return;
            }
        }
        
    }

}
