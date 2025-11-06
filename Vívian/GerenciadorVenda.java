import java.util.Scanner;
public class GerenciadorVenda {

    public void vendas(Venda venda){
        Scanner sc = new Scanner(System.in); 
        System.out.print(">>> INÍCIO DE VENDA: Informe o ID da Venda: ");
        String idVenda = sc.nextLine();
        System.out.println("\nSTATUS: Venda ID " + idVenda + " iniciada com sucesso.");
        sc.close();
    }

    public void Finalizar(Venda venda){
        System.out.println("Venda " + venda + " processada e FINALIZADA. Gerando nota fiscal...");
    }

    public void Cancelar(Venda venda){
        System.out.println("Venda " + venda + " CANCELADA.");
    }
}

public void main(String[] args){
    system.out.println("Bem vindo ao Gerenciador!");
}