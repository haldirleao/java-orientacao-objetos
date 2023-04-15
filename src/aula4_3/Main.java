package aula4_3;

// Exercício da aula 4 de ).

public class Main {
    public static void main(String[] args) {

        ClasseMae[] classes = new ClasseMae[] { new ClasseFilha1(), new ClasseFilha2(), new ClasseMae() };

        System.out.println("--- Imprimindo o método 1 dos objetos da array ---");
        for (ClasseMae classe : classes) {
            System.out.print(classe.getClass().getSimpleName() + ": ");
            classe.metodo1();
        }
        
        System.out.println("\n--- Imprimindo o método 2 dos objetos da array ---");
        for (ClasseMae classe : classes) {
            System.out.print(classe.getClass().getSimpleName() + ": ");
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
