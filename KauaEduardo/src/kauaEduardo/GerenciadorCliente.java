package kauaEduardo;

public class GerenciadorCliente {
    public void inserirCliente(String nome) {
        System.out.println("Cliente " + nome + " inserido com sucesso.");
    }

    public String consultarCliente(int id) {
        System.out.println("Consultando cliente ID: " + id);
        
        return "Cliente Encontrado";
    }

    public void alterarCliente(int id, String novoNome) {
        System.out.println("Cliente ID " + id + " alterado para: " + novoNome);
    }

    public void removerCliente(int id) {
        System.out.println("Cliente ID " + id + " removido com sucesso.");
    }
}
