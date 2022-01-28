public class Casa{
//atributos
	private double areaTerreno;
	private String direccion;
	private int numeroHabitaciones;
	private double precio;

	public static void main(String... args){
		System.out.println("Hola Casa.");

		Casa casaJuanito = new Casa();//objeto
		//referenciamos instancia
		double resultado = casaJuanito.obtenerPrecioTotal(50.5, 120.8);
		System.out.println("El precio es: " + resultado);
	}
	//metodo
	public double obtenerPrecioTotal(double precioMetroC, double area){
		precio = precioMetroC * area;
		return precio;
	}
}