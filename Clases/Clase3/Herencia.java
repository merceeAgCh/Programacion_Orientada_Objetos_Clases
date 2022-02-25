public class Herencia{
// crear objeto del main.
	public static void main(String... args) {
		Herencia hijaHereda = new Herencia();
		hijaHereda.describirHerencia();
	}
}

//por cada archivo .java se permite una clase publica.
class Abuelito{
	protected String colorOjos;
	protected double altura;
}

class Madre extends Abuelito{
	void bailar(){
		
	}
}

class Hija extends Madre{
	/*crear metodo describir, mostrara en pantalla
	las propiedades que hereda del abuelo y cuales de la madre*/
	public String describirHerencia(String abuelo, String mama){
		abuelo = "Nada, las variables son unicas del abuelo";
		System.out.println("Lo que la hija hereda del abuelo es: " + abuelo);
		mama = "Hereda el bailar";
		System.out.println("Lo que la hija hereda del abuelo es: " + mama);
	}
}

class Padre{
	void bailar(){

	}
}