import java.util.Scanner;

public class GerenciadorVenda
{

    public static void main(String[] args) {
     
        Scanner l = new Scanner(System.in);
        
        System.out.println("BEM VINDO AO CADASTRO DE VENDAS");
        
        System.out.println("Informe o nome do Cliente: ");
        
        String nome = l.nextLine();
        
        System.out.println("Informe o cpf do Cliente ");
        
        String cpf = l.nextLine();
        // Solicitará ao usuario o codigo do produto
        System.out.println("Informe o codigo do Produto: ");
        
        String cod = l.nextLine();
        
        GerenciadorCliente cliente = new GerenciadorCliente();
        
        cliente.setNome(nome);
        cliente.setCpf(cpf);
		//Armazenará o codigo do produto na instancia da classe GerenciadorCliente
		cliente.setCod(cod);
     }
}