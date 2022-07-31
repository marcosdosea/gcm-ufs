class GerenciadorCliente {
    public int codigo;
    public String nome; 
    public String endereco;
    
    public GerenciadorCliente(int codigo, String nome, String endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
    }

    public void inserir(int codigo, String nome, String endereco){
        System.out.println(nome+"Inserido...");
    }

    public void consultar(int code){
        if(code == codigo)
            System.out.println(nome+" ja está cadastrado no sistema.");
        else
            System.out.println(nome+" não está cadastrado no sistema.");
    }
}