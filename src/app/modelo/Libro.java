package app.modelo;

public class Libro {
	private int ID;
	private String titulo;
	private String autor;
	private String editorial;
	private String isbn;
	private int publicacion;
	private double precio;
	private String descripcion;
	
	/*
	 * Constructor sin argumentos
	 * 
	 */
	public Libro(){
		ID = 0;
		this.titulo = "";
		this.autor = "";
		this.editorial = "";
		this.isbn = "";
		this.publicacion = 0;
		this.precio = 0.0;
		this.descripcion = "";
	}
	
	/*
	 * Contructor con argumentos de libro
	 * 
	 */
	public Libro(int iD, String titulo, String autor, String editorial,
			String isbn, int publicacion, double precio, String descripcion) {
		ID = iD;
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.isbn = isbn;
		this.publicacion = publicacion;
		this.precio = precio;
		this.descripcion = descripcion;
	}
	
    /************** Getters and Setters ***********/
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(int publicacion) {
		this.publicacion = publicacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * toString method
	 */
	@Override 
	public String toString() {
		return "Libro [ID=" + ID + ", titulo=" + titulo + ", autor=" + autor
				+ ", editorial=" + editorial + ", isbn=" + isbn
				+ ", publicacion=" + publicacion + ", precio=" + precio
				+ ", descripcion=" + descripcion + "]";
	}
	/**
	 * Metodo para comparar si 2 libros son iguales. Para ello solo compara el ISBN del libro
	 * @param libro
	 * @return boolean.
	 * true: Si dos libros son iguales
	 * false: Si no lo son
	 */
	public boolean equals(Libro libro) {
		// TODO Auto-generated method stub
		return (libro.getIsbn()==this.getIsbn());
	}
	
	
	
}
