public class Venda {
    private int id;
    private StatusVenda status;

    public Venda(int id) {
        this.id = id;
        this.status = StatusVenda.PENDENTE; 
    }

    public int getId() {
        return id;
    }

    public StatusVenda getStatus() {
        return status;
    }

    public void finalizar() {
        if (this.status == StatusVenda.PENDENTE) {
            this.status = StatusVenda.FINALIZADA;
            System.out.println("Venda " + id + " finalizada com sucesso.");
        } else {
            System.err.println("Erro: Venda " + id + " não pode ser finalizada. Status atual: " + status);
        }
    }

    public void cancelar() {
        if (this.status == StatusVenda.PENDENTE) {
            this.status = StatusVenda.CANCELADA;
            System.out.println("Venda " + id + " cancelada.");
        } else {
            System.err.println("Erro: Venda " + id + " não pode ser cancelada. Status atual: " + status);
        }
    }
}