public class Cliente {
    public int Id { get; set; }
    public string Nome { get; set; }
    public string Endereco { get; set; }
    public string Cpf { get; set; }

    public Cliente () {}

    public Cliente (int id, string nome, string endereco, string cpf) {
        Id = id;
        Nome = nome;
        Endereco = endereco;
        Cpf = cpf;
    }
}