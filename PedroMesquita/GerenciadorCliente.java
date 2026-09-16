public class GerenciadorCliente {
    public void inserir(Cliente c) {
        _context.Add(c);
        _context.SaveChanges();
    }

    public Cliente consultar(int id) {
        return _context.GetById(id);
    }
}