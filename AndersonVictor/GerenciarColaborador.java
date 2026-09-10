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

    public List<String> listar() {
        return Collections.unmodifiableList(colaboradores);
    }

    public int quantidade() {
        return colaboradores.size();
    }
}