class GerenciadorCliente{
    private String name;
        
    //Method
    public void inserir(String name){
        this.name = name;
    }

    //Method
    public void consultar() {
        System.out.println("Nome do gerenciador de clientes: " + name);
    }
}