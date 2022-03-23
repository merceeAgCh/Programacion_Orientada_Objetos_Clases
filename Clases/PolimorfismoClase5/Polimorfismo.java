public class Polimorfismo{
	public static void main(String... args){
		Padre persona = new Hermano1("Jose"); //objeto
		persona.castigar();//llamar al metodo
		persona = new Padre("Pepito");
		persona.castigar();
	}
}
class Padre{
	public Padre(){}
	//variable
	private String nom;
	//constructor
	public Padre(String nombre){
		nom = nombre;
	}
	//metodo
	public void castigar(){
		System.out.println("El padre esta castigando " + nom);
	}
}
class Hermano1 extends Padre{
	public Hermano1(){}
	private String nom;
	public Hermano1(String nombre){
		nom = nombre;
	}
	public void castigar(){
		System.out.println("El hermano1 esta castigando " + nom);
	}
}