import java.util.Scanner;

class Venda {
    int id;
    String status;

    public Venda(int id) {
        this.id = id;
        this.status = "Em andamento";
    }
}

class GerenciadorVenda {

    public void finalizar(Venda venda) {
        if (venda.status.equals("Cancelada")) {
            System.out.println("Não é possível finalizar uma venda cancelada.");
            return;
        }

        if (venda.status.equals("Finalizada")) {
            System.out.println("Essa venda já foi finalizada.");
            return;
        }

        venda.status = "Finalizada";
        System.out.println("Venda finalizada com sucesso!");
    }

    public void cancelar(Venda venda) {
        if (venda.status.equals("Finalizada")) {
            System.out.println("Não é possível cancelar uma venda finalizada.");
            return;
        }

        if (venda.status.equals("Cancelada")) {
            System.out.println("Essa venda já foi cancelada.");
            return;
        }

        venda.status = "Cancelada";
        System.out.println("Venda cancelada com sucesso!");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Venda venda = new Venda(1);
        GerenciadorVenda gerenciador = new GerenciadorVenda();

        System.out.println("=== MINHAS VENDAS ===");
        System.out.println("Venda: " + venda.id);
        System.out.println("Status: " + venda.status);

        System.out.println();
        System.out.println("1 - Finalizar venda");
        System.out.println("2 - Cancelar venda");

        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            gerenciador.finalizar(venda);
        } else if (opcao == 2) {
            gerenciador.cancelar(venda);
        } else {
            System.out.println("Opção inválida.");
        }

        System.out.println("Status atual: " + venda.status);

        scanner.close();
    }
}
