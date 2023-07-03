public class GerenciadorCliente{

    String nome;
    String cpf;
    int codigo;

    public Cliente inserir(String nome, String cpf, int codigo){
        c.nome = nome;
        c.cpf = cpf;
        c.codigo = codigo;
        return c;
    }

    public void consultar(Cliente c){
        System.out.println(c.nome);
        System.out.println(c.cpf);
        System.out.println(c.codigo);
    }

    public void remover(Cliente c){
        c.nome = null;
        c.cpf = null;
        c.codigo = null;
    }

    public Cliente alterar(Cliente c, String nomeNovo, String cpfNovo, int codigoNovo){
        c.nome = nomeNovo;
        c.cpf = cpfNovo;
        c.codigo = codigoNovo;
        return c;
    }
}