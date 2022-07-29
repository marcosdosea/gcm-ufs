class GerenciadorCliente{
    private String name;
        
    public GerenciadorCliente{
        name = " ";
    }

    //Inseri o nome para o gerenciador de cliente
    public boolean inserir(String name){

        if(name != " ") {
            this.name = name;
            return true;
        }

        return false;
    }

    //Retorna o nome do responsável por gerenciar os clientes
    public void consultar() {
        System.out.println("Nome do gerenciador de clientes: " + name);
    }

    // Apaga nome do gerenciador de clientes
    public boolean remover(){
        name = " ";
        return true;
    }

    // Altera o nome do gerenciador de clientes
    public boolean alterar(String name) {
        this.name = name;
        return true
    }
}