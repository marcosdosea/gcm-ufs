package kauaEduardo;

public class GerenciadorCliente {

    public void inserirCliente(String nome) {
        System.out.println("Cliente " + nome + " inserido na base de dados.");
    }

    public String consultarCliente(int id) {
        System.out.println("Consultando cliente ID: " + id);
        return "Cliente encontrado!";
    }
}
