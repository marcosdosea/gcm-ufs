import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorCliente {
    private final List<Cliente> clientes = new ArrayList<>();

    public void cadastrar(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("O cliente é obrigatório.");
        }
        if (buscarPorCpf(cliente.getCpf()) != null) {
            throw new IllegalArgumentException("Já existe um cliente com este CPF.");
        }
        clientes.add(cliente);
    }

    public boolean removerPorCpf(String cpf) {
        Cliente cliente = buscarPorCpf(cpf);
        return cliente != null && clientes.remove(cliente);
    }

    public Cliente buscarPorCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public List<Cliente> listar() {
        return Collections.unmodifiableList(clientes);
    }

    public static void main(String[] args) {
        GerenciadorCliente gerenciador = new GerenciadorCliente();
        gerenciador.cadastrar(new Cliente("Victor", "000.000.000-00", 20, 1.75f, 70f));
        System.out.println("Clientes cadastrados: " + gerenciador.listar().size());
    }

    public static class Cliente {
        private final String nome;
        private final String cpf;
        private final int idade;
        private final float altura;
        private final float peso;

        public Cliente(String nome, String cpf, int idade, float altura, float peso) {
            if (nome == null || nome.isBlank() || cpf == null || cpf.isBlank()) {
                throw new IllegalArgumentException("Nome e CPF são obrigatórios.");
            }
            if (idade < 0 || altura <= 0 || peso <= 0) {
                throw new IllegalArgumentException("Idade, altura e peso devem ser válidos.");
            }
            this.nome = nome.trim();
            this.cpf = cpf.trim();
            this.idade = idade;
            this.altura = altura;
            this.peso = peso;
        }

        public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }

        public int getIdade() {
            return idade;
        }

        public float getAltura() {
            return altura;
        }

        public float getPeso() {
            return peso;
        }
    }
}
