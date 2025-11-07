import java.util.Scanner;

public class GerenciadorCliente {

    public void Inserir(Cliente cliente){
        Scanner sc = new Scanner(System.in);
        system.out.println("Insira o nome do cliente:");
        String nomeCliente = sc.nextLine();
        System.out.println("\nCLIENTE: " + nomeCliente + " | STATUS: Inserido com sucesso.");
        sc.close();
    } 

    public void consultar(Cliente cliente){
       System.out.println("Consultando dados do cliente " + cliente + "...");
    }

    public void Remover(Cliente cliente){
        System.out.println("Cliente " + cliente + " removido.");
    }

    public void Alterar(Cliente cliente){
        System.out.println("Dados do cliente " + cliente + " atualizados.");
    }
}
public void main(String[] args){
    System.out.println("Bem vindo ao Gerenciador");
}