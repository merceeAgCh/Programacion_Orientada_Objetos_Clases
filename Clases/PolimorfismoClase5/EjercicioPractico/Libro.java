//crear 4 clases referenciadas a un libro, aplicando la herencia, polimorfismo y sobreescritura de metodos.

//clase principal
public class Libro{
	//metodo principal
	public static void main(String... args){
		Autor escritor = new Editora("Jose Luis Lara");
		escritor.venderLibro();
		escritor = new Autor("Luis Lara");
		escritor.venderLibro();
	}
}

class Autor{
	//variables protected que van a poder ser heredadas a otra clase
	protected String name;
	protected int edad = 30;
	protected String tipoLiteratura = "Hisoria";

	//metodo constructor
	public Autor(String nom){
		name = nom;
	}
	public void venderLibro(){
		System.out.println("El autor: " + name + "vendio su libro");
	}
}

class Editora extends Autor{
	private String nombreEditora = "Editoial Porrua";
	private String nombreLibro = "Tenoch un heroe de bronce";
	protected String name;
	
	//metodo constructor
	public Editora(String nom){
		name = nom;
	}
	public void venderLibro(){
		System.out.println("El autor: " + name + "vendio su libro desde la editora");
	}
	protected void contratarAutor(){
		System.out.println("EL autor ha sido contratado");
	}
}

class Publicar extends Editora{
	//metodo
	// protected void venderLibro(){
	// 	System.out.println("Se vende el libro desde una libreria, (clase publicar)");
	// }
}