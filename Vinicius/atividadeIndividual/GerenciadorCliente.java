package atividadeIndividual;

/**
 * Gerenciador utilizado para realizar a inserção e consulta de um cliente
 * @author Vinícius
 */
public class GerenciadorCliente {
    
    private String nome;
    private String cpf;
    private String login;
    private String senha;

    /**
     * Inserir um novo cliente no sistema
     * @param nome
     * @param cpf
     * @param login
     * @param senha
     */
    public void inserirCliente(String nome, String cpf, String login, String senha){
        setNome(nome);
        setCpf(cpf);
        setLogin(login);
        setSenha(senha);
    }
    
    /**
     * Consultar um determiado cliente já existente no sistema 
     * @param cpf
     * @param login
     * @return 
     */
    public String consultarCliente(String cpf, String login){
        String mensagem = "";
        if (cpf != null && cpf.equals(getCpf())) {
            mensagem += getNome()+"\n";
            mensagem += getCpf()+"\n";
            mensagem += getLogin()+"\n";
        }
        else if (cpf == null && login != null && login.equals(getLogin())) {
                mensagem += getNome()+"\n";
                mensagem += getLogin()+"\n";
        }
        else {
            mensagem += "Não foi encontrado nenhum cliente a partir das informações inseridas!";
        }
        return mensagem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getSenha() {
        return senha;
    }
}
