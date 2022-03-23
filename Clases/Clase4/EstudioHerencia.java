//Crear 4 clases, la clase primera heredara, debe representar todo lo de herencia


/*
Este ejemplo es para grabar canciones utilizando la herencia y sobrescritura de metodos.
*/
public class EstudioHerencia{

	//Aqui se encuentra el metodo main.
	public static void main(String... args) {
		Estudio miestudio = new Estudio();
		miestudio.mostrarHerencia();
	}
}

class Guitarra{
	//variables o propiedades del tipo protected que podran ser heredadas a otra clase.
	protected String tipoGuitarra = "Acustica";
	protected String color = "Natural";
}
//por jerarquia este debe ser la ultima clase hijo
class Fabricante extends Guitarra{
	private String marcaGuitarra = "Epiphone";
	private int cantidadFabricadas;
	//metodo
	protected void venderGuitarra(){
		System.out.println("Se han vendido guitarras");
	}
}

class Artista extends Guitarra{
	protected String nombre = "Guns n Roses";
	//metodos de la clase Artista
	protected void cantar(String cancion){
		System.out.println("Estas cantando.");
	}
	public void tocarGuitarra(){
	System.out.println("Estas tocando una guitarra.");	
	}
}	

class Estudio extends Artista{
	//private String nombre = "Slash";
	//metodos de la clase Estudio
	void grabarVoz(){
		System.out.println("Se grabo con exito la voz");
	}
	void grabarGuitarra(){
		System.out.println("La guitarra se ha grabado.");
	}
	public void cantar(String cancion){
		System.out.println("Estas cantando desde el estudio " + nombre); //sobre-escritura de metodos
	}
	public void mostrarHerencia(){
		System.out.println("El tipo de guitarra es: " + tipoGuitarra);
		System.out.println("El color de la guitarra es: " + color);
		cantar("Aca entre nos");
		tocarGuitarra();
		grabarGuitarra();
		grabarVoz();
	}
}