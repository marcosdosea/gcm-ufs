
import java.util.Date;

public class GerenciadorVenda {
    
    public int Id;
    public Date data;
    public double total;

    public void inserir(int id, Date data, double total)
    {
        this.Id = id;
        this.data = data;
        this.total = total;
    }
    
}
