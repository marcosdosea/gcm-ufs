import java.util.Random;

public class Cliente{
    private int codigo;
    private String nome;
    private int cpf;
    private float limiteDisp;
    
    public inserirCliente(String nome,int cpf){
        this.codigo = new Random().nextInt();
        this.nome = nome;
        this.cpf = cpf;
        this.limiteDisp = 1000.0;
    }
    public boolean alteraLimite(float novoLimite){
        if((novoLimite + this.limiteDisp) > 0){
            this.limiteDisp = novoLimite; 
            return true;
        }
        return false;
    }
}

public class Venda{
    private int codigo;
    private String data;
    private String valorTotal;

    public Venda(Cliente cliente){
        this.codigo = new Random().nextInt();
        this.data = "12/10/2020";
        cliente.alteraLimite(-this.valorTotal);
    }
}
