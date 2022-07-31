/**
 *
 * @author thiago
 */
public class GerenciadorCliente {
    private String nome;
    private Integer idade;
    private double saldo;
    
   
    public void inserir(String nome, Integer idade, double saldo){
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
    }
    
    
    public void consultar(){
        System.out.println("Cliente");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println(String.format("Saldo: %.2f",saldo));
    }

    public void alterar(String nome, Integer idade, double saldo){
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
    }

    public void remover(){
        this.nome = null;
        this.idade = null;
        this.saldo = 0;
    }
    
}