public class GerenciadorCliente {
    
    public Boolean inserirCliente(Cliente cliente) {
        if(cliente.inserido == true){
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

    public Boolean removerCliente(String nomeCLiente) {
         if(nomeCliente == cliente.nome){
            return true;
        }

        return false;
    }

    public Boolean alterarCliente(String nomeCLiente) {
        if(nomeCliente == cliente.nome){
            return true;
        }

        return false;
    }
}
