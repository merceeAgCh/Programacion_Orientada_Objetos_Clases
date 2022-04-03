## Clases de Coursera.
## Programación Orientada a Objetos (POO).

### Temario del módulo 1:
	- Clases.
	- Atributos.
	- Asociaciones.
	- Métodos e instrucciones.
	- Objetos.
	- Métodos constructores.
	- Llamado de métodos.
	- Creación de objetos.
	- Revisión de caso de estudio: "Líneas telefónicas".

#### ¿Qué es una clase?
	Es una abstracción del mundo real.
	Su declaración es:
	```
	public class Pizza
	{
		//Contenido de la clase
	}
	```
#### ¿Qué es un atributo?	
	Nos permiten definir las características o propiedades de una clase. 
	Los atributos 
	```
	public class Pizza
	{
		//Contenido de la clase
	}
	```
#### ¿Qué es una asociación?
	Para establecer las relaciones existentes entre clases,
	se usan las asociaciones.	
	```
	//pizza_1 y pizza_2 son las asociaciones entre la clase cocinero y la clase pizza.
	public class Cocinero{
		private Pizza pizza_1;
		private Pizza pizza_2;
		private String nombre;
	}
	```
#### ¿Qué es un método e instrucción?
	MÉTODO: Permiten definir el comportamiento de una clase, es decir la forma de recibir, manipular y entregar la información.
	Si queremos que el método nos retorne información se pone el tipo de dato, en caso contrario se pone el tipo de retorno "VOID"
	```
	public class Pizza{
		private String nombre;
		private double costoProduccion;
		private int cantidadProducida;
		private double precioVenta;
	}
	//metodos
	public int cantidadProducida_()
	{
		return cantidadProducida;
	}
	public void precioVenta_(double newPrecio){
		precioVenta = newPrecio;
	}
	public double gananciaUnitaria_()
	{
		double ganancia = precioVenta - costoProduccion;
		return ganancia;
	}
	```
#### ¿Qué es un objeto?
	Son instancias de las clases, es decir que tienen valores asignados para sus atributos.	
#### ¿Métodos contructores?
	Es un método que nos permite crear un objeto con las características de una clase. Todas las clases tienen un metodo constructos por defecto.Una clase puede tener tantos constructores como queramos. Tiene la posibilidad de inicializar los atributos del objeto.
	```
	public class Pizza{
		private String nombre;
		private double costoProduccion;
		private int cantidadProducida;
		private double precioVenta;
	}
	//metodo constructor
	public Pizza(string nNombre, double nCosto, double nPrecio){
		nombre = nNombre;
		costoProduccion = nCosto;
		precioVenta = nPrecio;
		cantidadProducida = 0;
	}
	```
#### Llamado de métodos.
	¿Cuándo urilizar (llamar) un método?
	Una clase requere un calculo
	realizado en otro método de la misma clase.
	Tambien puede realizarse mediante otra clase.	
	```
	public class Pizza{
		private String nombre;
		private double costoProduccion;
		private int cantidadProducida;
		private double precioVenta;
	}
	//metodo creado previamente
	public double gananciaUnitaria_()
	{
		double ganancia = precioVenta - costoProduccion;
		return ganancia;
	}
	//creamos un metodo nuevo que de la ganancia total
	//llamado de metodos en la misma clase.
	public double gananciaTotal(){
		double total = gananciaUnitaria_();
		return total * cantidadProducida;
	}
	```
	```
	//llamado demetodos desde otra clase.
	//EL operador (.) nos permite el acceso a miembros de una clase (atributos y métodos de otra clase), esto es solo si los metodos son de tipo publico.

	public class Pizza{
		private String nombre;
		private double costoProduccion;
		private int cantidadProducida;
		private double precioVenta;
	}
	Public class Cocinero{
		private Pizza pizza1;
		private Pizza pizza2;
		public int unidadesProducidas(){
			return pizza1.cantidadProducida_()
				 + pizza2.cantidadProducida();	
		}
	}
	```
#### Creación de objetos.
	¿Como creamos un objeto nuevo?
	con una instruccion "new"
	```
	Public class Cocinero{
		private Pizza pizza1;
	  public Cocinero(){
	  	pizza1 = new Pizza("Carnes", 12000.0, 25000.0);
	  }
	}	
	```