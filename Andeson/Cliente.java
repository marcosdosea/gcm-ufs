import java.util.Random;
import java.util.Date;

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
    public Cliente alterarCliente(String nome,int cpf){
        this.nome = cliente.nome;
        this.cpf = cliente.cpf;
    }
}

public class Venda{
    private int codigo;
    private Date data;
    private String valorTotal;

    public Venda(Cliente cliente){
        this.codigo = new Random().nextInt();
        this.data = new Date();
        cliente.alteraLimite(-this.valorTotal);
    }
}