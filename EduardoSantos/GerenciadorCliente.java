public class GerenciadorCliente {
    
    public Boolean inserirCliente(Cliente cliente) {
        if(inserido == true){
            return true;
        }

        return false;
    }

    public Cliente consultarCliente(String nomeCliente) {
        if(cliente.nome == nomeCliente){
            return cliente;
        }

        return null;
    }
}
