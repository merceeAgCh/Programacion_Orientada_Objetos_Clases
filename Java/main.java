import java.util.*;
public class main{
	public static void main(String... args){
		/*
		lista convencional de java
		nombre lista[] = new nombre[4];
		lista[0] = new nombre("mi nombre", 2);
		
		Si lo que queremos es ingresar elementos de diversos tipos,
		sera necesario usar la clase ArrayList
		https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
		*/

		//creamos la lista
		ArrayList<Alumno> alumnoL = new ArrayList<Alumno>();

		//ingresamos datos a la lista
		alumnoL.add(new Alumno("Mercedes", "Ingenieria Sistemas Computacionales", 25103354, "450BA", "Matutino B"));
		alumnoL.add(new Alumno("Ana", "Artes", 15105463, "420AA", "Matutino A"));
		alumnoL.add(new Alumno("Xuxa", "Veterinaria", 25102290, "450BA", "Matutino B"));

		//impresion de la lista
		for(Alumno x: alumnoL){
			System.out.println("Los datos de la lista son: \n");
			System.out.println(x.data());
		}
	}
	
class Alumno{
	//clase alumno con sus respectivos atributos
	public Alumno(String name, String carrera, int matricula, String grupo, String turno){
		this.name = name;
		this.carrera = carrera;
		this.matricula = matricula;
		this.grupo = grupo;
		this.turno = turno;
	}
	public String data(){
		return "Nombre del alumno: "+ name + "\nCarrera:" + carrera + "\nMatricula: " + matricula
		+ "\nGrupo: " + grupo + "\nTurno: " + turno;
	}
	private static String name;
	private static String carrera;
	private static int matricula;
	private static String grupo;
	private static String turno;
}
}