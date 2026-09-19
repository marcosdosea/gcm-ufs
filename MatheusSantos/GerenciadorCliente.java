import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorCliente {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static class Cliente {
        int id;
        String nome;
        String email;
        String telefone;

        Cliente(int id, String nome, String email, String telefone) {
            this.id = id;
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
        }

        @Override
        public String toString() {
            return "ID: " + id +
                   " | Nome: " + nome +
                   " | Email: " + email +
                   " | Telefone: " + telefone;
        }
    }

    // CREATE
    public static void inserirCliente() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        clientes.add(new Cliente(id, nome, email, telefone));

        System.out.println("Cliente inserido com sucesso!");
    }

    // READ
    public static void consultarCliente() {
        System.out.print("Digite o ID do cliente: ");
        int id = scanner.nextInt();

        for (Cliente cliente : clientes) {
            if (cliente.id == id) {
                System.out.println(cliente);
                return;
            }
        }

        System.out.println("Cliente não encontrado!");
    }

    // UPDATE
    public static void alterarCliente() {
        System.out.print("Digite o ID do cliente: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.id == id) {

                System.out.print("Novo nome: ");
                cliente.nome = scanner.nextLine();

                System.out.print("Novo email: ");
                cliente.email = scanner.nextLine();

                System.out.print("Novo telefone: ");
                cliente.telefone = scanner.nextLine();

                System.out.println("Cliente alterado com sucesso!");
                return;
            }
        }

        System.out.println("Cliente não encontrado!");
    }

    // DELETE
    public static void removerCliente() {
        System.out.print("Digite o ID do cliente: ");
        int id = scanner.nextInt();

        for (Cliente cliente : clientes) {
            if (cliente.id == id) {
                clientes.remove(cliente);
                System.out.println("Cliente removido com sucesso!");
                return;
            }
        }

        System.out.println("Cliente não encontrado!");
    }

    // LISTAR
    public static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n===== GERENCIADOR DE CLIENTES =====");
            System.out.println("1 - Inserir cliente");
            System.out.println("2 - Consultar cliente");
            System.out.println("3 - Alterar cliente");
            System.out.println("4 - Remover cliente");
            System.out.println("5 - Listar clientes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    inserirCliente();
                    break;

                case 2:
                    consultarCliente();
                    break;

                case 3:
                    alterarCliente();
                    break;

                case 4:
                    removerCliente();
                    break;

                case 5:
                    listarClientes();
                    break;

                case 0:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
