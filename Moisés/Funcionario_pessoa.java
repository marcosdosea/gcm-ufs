public class Funcionario extends Pessoa{
    private int id;
    private float salario;
    private String funcao;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
    public float getSalario(){
        return salario;
    }
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
    public String getFuncao(){
        return funcao;
    }
}
