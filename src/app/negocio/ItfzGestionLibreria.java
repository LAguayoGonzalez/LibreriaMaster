package app.negocio;

import java.util.List;

import app.modelo.Libro;

public interface ItfzGestionLibreria {
	public boolean altaLibro(Libro libro);
	public boolean eliminarLibro(int id);
	public List<Libro> consultarTodos();
	public Libro consultarISBN(String titulo);
	public List<Libro> consultarTitulo(String titulo);
	public boolean modificarPrecio(String isbn, double precio);
}
