public class GerenciadorCliente {
    public void inserir(Cliente c) {
        _context.Add(c);
        _context.SaveChanges();
    }

    public Cliente consultar(int id) {
        return _context.GetById(id);
    }

    public bool remover(int id) {
        Cliente c = _context.GetById(id);
        if (c != null) {
            _context.Remove(c);
            _context.SaveChanges();
            return true;
        }
        return false;
    }

    public void alterar(Cliente c) {
        _context.Update(c);
        _context.SaveChanges();
    }
}