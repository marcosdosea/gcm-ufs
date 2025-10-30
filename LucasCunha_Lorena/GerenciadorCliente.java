public class GerenciadorCliente{

    public void inserir(String nome_completo,String data_nasc,String cpf){

        if ((nome_completo || data_nasc || cpf) != null){
            Cliente cliente = new Cliente(nome_completo,data_nasc,cpf);

            context.add(cliente);
        }else {
            System.err.println("Erro: Algum campo está vazio");
        }
        
    }
}