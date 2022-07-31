class GerenciadorCliente{
    private String name;
        
    public GerenciadorCliente(){
        name = " ";
    }

    //Inseri o nome para o gerenciador de cliente
    public boolean inserir(String name){

        if(name.equals(" ")) {
            this.name = name;
            return true;
        }

        return false;
    }

    //Retorna o nome do responsável por gerenciar os clientes
    public void consultar() {
        System.out.println("Nome do gerenciador de clientes: " + name);
    }
}
