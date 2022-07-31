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
            return mensagem;
        }
        else if (cpf == null && login != null && login.equals(getLogin())) {
                mensagem += getNome()+"\n";
                mensagem += getLogin()+"\n";
                return mensagem;
        }
        else {
            mensagem += "Não foi encontrado nenhum cliente a partir das informações inseridas!";
            System.out.println(mensagem);
            return null;
        }
    }

    /**
     * Remover um determinado cliente do sistema
     * @param cpf
     * @param login
     */
    public void removerCliente(String cpf, String login){
        if(consultarCliente(cpf, login) != null){
            setNome(null);
            setCpf(null);
            setLogin(null);
            setSenha(null);
        }
        else{
            System.out.println("Não foi encontrado nenhum cliente a partir das informações inseridas!");
        }
    }

    /**
     * Alterar um determinado cliente do sistema
     * @param nome
     * @param cpf
     * @param login
     * @param senha
     */
    public void alterarCliente(String nome, String cpf, String login, String senha){
        if(nome.isEmpty()){
            getNome();
        } else {
            setNome(nome);
        }
        if (cpf.isEmpty()) {
            getCpf();
        } else {
            setCpf(cpf);
        }
        if(login.isEmpty()){
            getLogin();
        } else {
            setLogin(login);
        }
        if(senha.isEmpty()){
            getSenha();
        } else {
            setSenha(senha);
        }
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
