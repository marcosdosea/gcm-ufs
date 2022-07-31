class GerenciadorCliente {
    private String name;

    public GerenciadorCliente() {
        name = " ";
    }

    // Inseri o nome para o gerenciador de cliente
    public boolean inserir(String name) {

        if (name.equals(" ")) {
            this.name = name;
            return true;
        }

        return false;
    }

    // Retorna o nome do responsável por gerenciar os clientes
    public void consultar() {
        System.out.println("Nome do gerenciador de clientes: " + name);
    }

    // Remove o gerenciador cliente se ele possuir um nome
    public boolean remover() {
        if(!name.equals(" ")) {
            name = " ";
            return true;
        }

        return false;
    }

    // Altera o nome do gerenciador de cliente e retorna um true para notificar que
    // a modificação foi feita com sucesso.
    public boolean alterar(String name) {
        this.name = name;
        return true;
    }

}