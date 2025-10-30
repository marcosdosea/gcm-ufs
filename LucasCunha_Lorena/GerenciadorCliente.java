public class GerenciadorCliente{

    public void inserir(String nome_completo,String data_nasc,String cpf){

        if ((nome_completo || data_nasc || cpf) != null){
            Cliente cliente = new Cliente(nome_completo,data_nasc,cpf);

            context.add(cliente);
        }else {
            System.err.println("Erro: Algum campo está vazio");
        }
        
    }

    public Cliente atualizar(int id, String nome_completo,String data_nasc,String cpf){

        Cliente cliente = context.findById(id);

        if (cliente != null){
            cliente.setNome_completo(nome_completo);
            cliente.setData_nasc(data_nasc);
            cliente.setCpf(cpf);

            context.update(cliente);

            return cliente;
        }else {
            System.err.println("Erro: Cliente não encontrado");
            return null;
        }
        
    }
}