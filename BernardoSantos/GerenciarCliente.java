public class GerenciarCliente {
    
    public int inserirCliente(Cliente cliente){
        // insere o cliente no banco de dados e retorna o id do usuario inserido
        return cliente.id;
    }

    public Cliente consultar(int id){
        // busca o cliente no banco de dados pelo id e retorna o cliente
        return cliente;
    }
    
}