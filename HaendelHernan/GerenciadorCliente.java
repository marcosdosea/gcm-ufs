public class GerenciadorCliente{
    public static void main(String[] args) {
        adicionarCliente();
        System.out.println("Cliente adicionado.");
        consultarCliente();
        removerCliente();
        alterarCliente();
    }

    public static void adicionarCliente(){
        System.out.println("Adicionando cliente...");
    }
    public static void consultarCliente(){
        System.out.println("Dados do cliente:");
    }
    public static void removerCliente(){
        System.out.println("Cliente removido.");
    }
    public static void alterarCliente(){
        System.out.println("Cliente alterado.");
    }
}