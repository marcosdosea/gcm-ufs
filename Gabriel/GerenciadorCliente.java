class GerenciadorCliente{
    private String name;
        
    //Inseri o nome para o gerenciador de cliente
    public void inserir(String name){
        this.name = name;
    }

    //Retorna o nome do responsável por gerenciar os clientes
    public void consultar() {
        System.out.println("Nome do gerenciador de clientes: " + name);
    }
}