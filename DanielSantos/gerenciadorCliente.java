public class Cliente {
    private String nome;
    private String CPF;

    public int inserir(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF        
    }

    public boolean remover(int cod) {
        // metodo remover
        if(cod == 1) {
            return true;
        } else {
            return false;
        }
    }
}