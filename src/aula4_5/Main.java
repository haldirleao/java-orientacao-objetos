package aula4_5;

/* exercício da aula 4 de OO */

class Main {
    public static void main(String[] args) {

        Calculadora minhaCalculadora = new Calculadora();

        minhaCalculadora.somar(10.5, 12.33);
        minhaCalculadora.subtrair(23.15, 0.15);
        minhaCalculadora.multiplicar(12345679, 45);
        minhaCalculadora.dividir(Math.PI, 3);

    }

}
