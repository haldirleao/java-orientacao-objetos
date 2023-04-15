package polimorfismo_exemplo;

// exemplo da wikipedia
// https://pt.wikipedia.org/wiki/Polimorfismo_(ci%C3%AAncia_da_computa%C3%A7%C3%A3o)

public class MainContas {
    
    public static void mostrarCalculo(OperacaoMatematica operacao, double x, double y) {
        System.out.println("O resultado é: " + operacao.calcular(x, y));
    }

    public static void main(String args[]) {
        // Primeiro calculamos uma soma
        MainContas.mostrarCalculo(new Soma(), 5, 5); // Imprime o resultado é: 10

        // Depois uma subtração
        MainContas.mostrarCalculo(new Subtracao(), 5, 5); // Imprime o resultado é: 0
    }
}