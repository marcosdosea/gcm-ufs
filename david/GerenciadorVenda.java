import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente(int id, String nome, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | CPF: " + cpf + " | Telefone: " + telefone;
    }
}

class GerenciadorCliente {
    private List<Cliente> clientes = new ArrayList<>();
    private int proximoId = 1;

    public void cadastrar(String nome, String cpf, String telefone) {
        Cliente novoCliente = new Cliente(proximoId++, nome, cpf, telefone);
        clientes.add(novoCliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void consultar() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        System.out.println("\n=== LISTA DE CLIENTES ===");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    public void editar(int id, String novoNome, String novoCpf, String novoTelefone) {
        Cliente cliente = buscarPorId(id);
        if (cliente != null) {
            cliente.setNome(novoNome);
            cliente.setCpf(novoCpf);
            cliente.setTelefone(novoTelefone);
            System.out.println("Cliente atualizado com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public Cliente buscarPorId(int id) {
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}

class Venda {
    private int id;
    private Cliente cliente;
    private String status;

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.status = "Em andamento";
    }

    public int getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}

class GerenciadorVenda {
    public void finalizar(Venda venda) {
        if ("Cancelada".equals(venda.getStatus())) {
            System.out.println("Não é possível finalizar uma venda cancelada.");
            return;
        }
        if ("Finalizada".equals(venda.getStatus())) {
            System.out.println("Essa venda já foi finalizada.");
            return;
        }
        venda.setStatus("Finalizada");
        System.out.println("Venda finalizada com sucesso!");
    }

    public void cancelar(Venda venda) {
        if ("Finalizada".equals(venda.getStatus())) {
            System.out.println("Não é possível cancelar uma venda finalizada.");
            return;
        }
        if ("Cancelada".equals(venda.getStatus())) {
            System.out.println("Essa venda já foi cancelada.");
            return;
        }
        venda.setStatus("Cancelada");
        System.out.println("Venda cancelada com sucesso!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorCliente gerCliente = new GerenciadorCliente();
        GerenciadorVenda gerVenda = new GerenciadorVenda();

        gerCliente.cadastrar("Maria Silva", "123.456.789-00", "(79) 99999-1111");
        gerCliente.consultar();

        Cliente c = gerCliente.buscarPorId(1);
        if (c != null) {
            Venda venda = new Venda(1, c);
            System.out.println("\n=== GERENCIANDO VENDA ===");
            System.out.println("Cliente da Venda: " + venda.getCliente().getNome());
            System.out.println("Status Inicial: " + venda.getStatus());
            
            gerVenda.finalizar(venda);
            System.out.println("Status Final: " + venda.getStatus());
        }

        scanner.close();
    }
}
