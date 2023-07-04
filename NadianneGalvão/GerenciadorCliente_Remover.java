import java.util.ArrayList;
import java.util.List;

public class GerenciadorCliente {
    private List<Cliente> clientes;

    public GerenciadorCliente() {
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void excluirCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println("Sexo: " + cliente.getSexo());
            System.out.println("Oi linda: " + cliente.getSexo());
        }
    }

    public static void main(String[] args) {
        GerenciadorCliente gerenciador = new GerenciadorCliente();

        Cliente cliente1 = new Cliente("João", 25, "Rua A", "Masculino");
        Cliente cliente2 = new Cliente("Maria", 30, "Rua B", "Feminino");

        gerenciador.adicionarCliente(cliente1);
        gerenciador.adicionarCliente(cliente2);

        gerenciador.listarClientes();

        gerenciador.excluirCliente(cliente1);

        gerenciador.listarClientes();
    }
}

class Cliente {
    private String nome;
    private int idade;
    private String endereco;
    private String sexo;

    public Cliente(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;

       
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }


}
