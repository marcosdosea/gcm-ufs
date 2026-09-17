package ViniciusMeneses;

public class Venda {
    private String id;
    private String status; // "PENDENTE", "FINALIZADA", "CANCELADA"

    public Venda(String id) {
        this.id = id;
        this.status = "PENDENTE";
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}