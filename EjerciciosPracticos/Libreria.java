/*
Ejercicio practico para reforzar los conocimientos.
ToDo:
Crear 4 clases que representen una libreria, tomar en cuenta la herencia,
sobre-escritura de metodos y polimorfismo
*/
public class Libreria{
	public static void main(String... args){
		System.out.println("=========================");
		System.out.println("Bienvenido a la libreria !Libritos!");
		System.out.println("=========================");
		Piso pisoA = new Piso("A");
		pisoA.subir();
		Libro libro1 = new Libro("Harry Potter", 1995);
		libro1.publicar();
		Autor autor1 = new Autor("JK Rowling.");
		autor1.publicar();
	}
}
class Piso{
	//variable a nivel clase
	private String pasillo;
	//constructor
	public Piso(String pas){
		pasillo = pas;
	}
	//metodo de la clase
	public void subir(){
		System.out.println("Subiendo al piso: " + pasillo);
	}
}
class Autor{
	private String name;
	//private int edad;
	public Autor(String nameA){
		name = nameA;
		//edad = edadA;
	}
	protected void escribir(){
		System.out.println("El autor ha escrito un libro: ");
	}
	protected void publicar(){
		System.out.println("El autor" + name + "ha publicado un libro.");
	}
	public void vender(){
		System.out.println("El autor ha vendido libros.");
	}
}
class Libro{
	private String name;
	private int anioPublicacion;
	public Libro(String nameA, int anioP){
		name = nameA;
		anioPublicacion = anioP;
	}
	protected void publicar(){
		System.out.println("Se ha publicado un libro desde clase Libro " + name + "Publicado en: " + anioPublicacion);
	}
}