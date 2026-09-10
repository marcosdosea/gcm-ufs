public class GerenciadorEmprestimo {
	
	public void inserir(Emprestimo emprestimo) {
		context.Save(emprestimo);
	}
		
	public void alterar(Emprestimo emprestimo) {
		context.Save(emprestimo);
	}
}