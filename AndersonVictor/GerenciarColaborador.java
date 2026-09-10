import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Gerencia o cadastro básico de colaboradores. */
public class GerenciarColaborador {
    private final List<String> colaboradores = new ArrayList<>();

    public void adicionar(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do colaborador é obrigatório.");
        }
        colaboradores.add(nome.trim());
    }

    public boolean remover(String nome) {
        return colaboradores.remove(nome);
    }

    public boolean alterar(String nomeAtual, String novoNome) {
        if (novoNome == null || novoNome.isBlank()) {
            throw new IllegalArgumentException("O nome do colaborador é obrigatório.");
        }

        int indice = colaboradores.indexOf(nomeAtual);
        if (indice == -1) {
            return false;
        }

        colaboradores.set(indice, novoNome.trim());
        return true;
    }

    public List<String> listar() {
        return Collections.unmodifiableList(colaboradores);
    }

    public int quantidade() {
        return colaboradores.size();
    }
}