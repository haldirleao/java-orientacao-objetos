package aula4_5;

/* exercício da aula 4 de OO */

class Calculadora implements OperacaoMatematica {

    @Override
    public void dividir(double operando1, double operando2) {
        System.out.println(operando1 + " / " + operando2 + " = " + (operando1 / operando2));

    }

    @Override
    public void multiplicar(double operando1, double operando2) {
        System.out.println(operando1 + " x " + operando2 + " = " + (operando1 * operando2));

    }

    @Override
    public void somar(double operando1, double operando2) {
        System.out.println(operando1 + " + " + operando2 + " = " + (operando1 + operando2));

    }

    @Override
    public void subtrair(double operando1, double operando2) {
        System.out.println(operando1 + " - " + operando2 + " = " + (operando1 - operando2));

    }

}
