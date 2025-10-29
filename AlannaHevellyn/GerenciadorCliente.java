public class GerenciadorVendas {
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo(a) ao nosso gerenciador!!!!");
    }

       public int atualizarCliente(int id, String novoNome, String novoEmail) {
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                c.setNome(novoNome);
                c.setEmail(novoEmail);

            }
        }
    }
}

