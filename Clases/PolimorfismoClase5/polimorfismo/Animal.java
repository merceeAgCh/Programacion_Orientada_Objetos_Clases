package polimorfismo;
//clase abstracta
public abstract class Animal {

    //variables
    protected String nombre;
    protected int edad;
    protected int tamanio;

    //aplicamos nuestro polimorfismo
    public Animal(String nombre, int edad, int tamanio){
        this.nombre = nombre;
        this.edad = edad;
        this.tamanio = tamanio;
    }
    //metodo abstracto
    public abstract void realizarSonido();

}

class Perro extends Animal{

    public Perro(String nombre, int edad, int tamanio) {
        super(nombre, edad, tamanio);
    }

    @Override
    public void realizarSonido() {
        System.out.println("\nUn perro hace gua gua gua!! ");
    }
}

class Pez extends Animal {
    public Pez(String nombre, int edad, int tamanio){
        super(nombre,edad,tamanio);
    }

    @Override
    public void realizarSonido() {
        System.out.println("\nHola soy " + nombre + " el pez, tengo" + edad + "anios" + " y hago glup glup!! ");
    }
}

class Gato extends Animal {
    public Gato(String nombre, int edad, int tamanio){
        super(nombre,edad,tamanio);
    }

    @Override
    public void realizarSonido() {
        System.out.println("\nHola soy " + nombre + " el gatito \n" + "tengo" + edad + "anios" + " y hago miau miau!! ");
    }
}