package app.persistencia;

import java.util.ArrayList;
import java.util.List;

import app.modelo.Libro;

public class LibrosDAO implements ItfzLibrosDao {
	
	private List<Libro> libros= new ArrayList<Libro>();
	@Override
	public boolean altaLibro(Libro libro) {
		libros.add(libro);
		return false;
	}

	@Override
	public boolean eliminarLibro(int id) {
		libros.remove(id);
		return false;
	}

	@Override
	public List<Libro> consultarTodos() {
		List<Libro> lista= new ArrayList<Libro>();
		for (Libro libro: libros ){
			lista.add(libro);
		}
		return lista;
	}

	@Override
	public Libro consultarISBN(String isbn) {
		boolean encontrado=false;
		int index=0;
		while(!encontrado){
			if (libros.get(index).getIsbn()==isbn){
				encontrado=true;
			}else{
				index++;
			}
		}
		return libros.get(index);
	}

	@Override
	public List<Libro> consultarTitulo(String titulo) {
		List<Libro> lista= new ArrayList<Libro>();
		for (Libro libro: libros ){
			if (libro.equals(libro)){
				lista.add(libro);
			}
		}
		return lista;
	}

	@Override
	public boolean modificarPrecio(String isbn, double precio) {
		// TODO Auto-generated method stub
		return false;
	}
}
