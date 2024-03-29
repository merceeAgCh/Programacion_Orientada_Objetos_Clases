package Calculadora;

public class Calculadora {
    public static void main(String... args){

        Suma suma = new Suma();
        realizarElCalculo(suma, 3, 4);
    }

    static void realizarElCalculo(CalculadoraBase calculadoraBase, double valor1, double valor2){
        calculadoraBase.setValor1(valor1);
        calculadoraBase.setValor2(valor2);
        calculadoraBase.calcular();
        System.out.println(calculadoraBase.getResultado());
    }
}
class Suma extends CalculadoraBase{
    @Override
    public void calcular(){
        this.setResultado(getValor1() + getValor2());
    }
}
class CalculadoraBase {
    //variables
    private double valor1;
    private double valor2;
    private double resultado;
    //metodos
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void calcular(){}
}