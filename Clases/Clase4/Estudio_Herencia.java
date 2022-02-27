//Crear 4 clases, la clase primera heredara, debe representar todo lo de herencia


/*
Este ejemplo es para grabar canciones utilizando la herencia y sobrescritura de metodos.
*/


class Guitarra{
	//variables o propiedades del tipo protected que podran ser heredadas a otra clase.
	protected String color = "Natural";
	protected String tipoMadera = "Caoba";
	//protected String tipoGuitarra;
	protected void tocar(){
		System.out.println("Tocas guitarra.");
	}
}

class Cancion extends Guitarra{
	//metodo que pertenece a la clase cancion.
	protected void grabar(){
		System.out.println("Estas grabando una cancion con guitarra \n");
	}

class Artista extends Cancion{
	public void cantar(){
		System.out.println("Estas cantando.");
		grabar();
		tocar();
	}
}	
public class Estudio_Herencia{

	//Aqui se encuentra el metodo main.
	public static void main(String ... args){
		Artista charlie = new Artista();
		charlie.cantar();
	}
}
}