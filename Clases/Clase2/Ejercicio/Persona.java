/*
ToDo
Hacer un programa que calcule el imc y grasa corporal de una persona.
Clase 2 Fecha 27-01-2022
*/
public class Persona{
	//atributos
	private double imc;
	private double gc;

	//metodo principal
	public static void main(String... args){
		//objeto 1
		Persona calculoIMC = new Persona();
		double resimc = calculoIMC.obtenerIMC(70, 1.65);
		System.out.println("El imc es: " + resimc);
		//objeto 2
		Persona calculoGC = new Persona();
		double resgc = calculoGC.obtenerGC(26, null);
		System.out.println("Su grassa corporal es: " + resgc);
	}
	//Metodo para calculo de imc
	public double obtenerIMC(double peso, double estatura){
		imc = peso / (estatura * estatura);
		return imc;
	}
	//metodo para calculo de la grasa corporal
	public double obtenerGC(int edad, String sexo){
		if("hombre".equals(sexo)){
			gc=1.2*imc+0.23*edad-10.8*1-5.4;
			return gc;
		}else{
			gc=1.2*imc+0.23*edad-10.8*0-5.4;
			return gc;
		}
	}
}