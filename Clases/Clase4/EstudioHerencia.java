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

class Fabricante extends Guitarra{
	protected String marcaGuitarra = "Epiphone";
	protected int cantidadFabricadas;
	//metodo
	protected void venderGuitarra(){
		System.out.println("Se han vendido guitarras");
	}
}

class Artista extends Guitarra{
	//metodos de la clase Artista
	public void cantar(){
		System.out.println("Estas cantando.");
	}
	public void tocarGuitarra(){
	System.out.println("Estas tocando una guitarra.");	
	}
}	

class Estudio extends Artista{
	//metodos de la clase Estudio
	void grabarVoz(){
		System.out.println("Se grabo con exito la voz");
	}
	void grabarGuitarra(){
		System.out.println("La guitarra se ha grabado.");
	}
	public void mostrarHerencia(){
		System.out.println("El tipo de guitarra es: " + tipoGuitarra);
		System.out.println("El color de la guitarra es: " + color);
		cantar();
		tocarGuitarra();
		grabarGuitarra();
		grabarVoz();
	}
}