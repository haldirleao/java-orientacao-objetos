package aula4_2;

public class Main {
    public static void main(String[] args) {

        System.out.println("-- TESTES: Upcasting & Downcasting --");

        // Sem DOWNCAST nem UPCAST
        Funcionario funcionario = new Funcionario();

        // UPCAST
        // instanciando uma subclasse Gerente à um objeto da superclasse Funcionario.
        Funcionario gerente = new Gerente();
        // instanciando uma subclasse Vendedor à um objeto da superclasse Funcionario.
        Funcionario vendedor = new Vendedor();
        // instanciando uma subclasse Faxineiro à um objeto da superclasse Funcionario.
        Funcionario faxineiro = new Faxineiro();

        // Tentando fazer um DOWNCAST não explícito. Não permite compilar.
        // Gerente gerente_ = new Funcionario(); // Type mismatch: cannot convert from
        // Funcionario to GerenteJava(16777233)

        // Tentando fazer um DOWNCAST explícito.
        // Permite compilar, mas dá erro de ClassCastException em tempo de execução.
        // Downcast. MUITO CUIDADO ao usar.
        // Vendedor vendedor_ = (Vendedor) new Funcionario();

        System.out.println("--- imprimindo <objeto>.getclass() ---");
        System.out.println(funcionario.getClass());
        System.out.println(gerente.getClass());
        System.out.println(vendedor.getClass());
        System.out.println(faxineiro.getClass());

        System.out.println("--- imprimindo os objetos ---");
        System.out.println(funcionario);
        System.out.println(gerente);
        System.out.println(vendedor);
        System.out.println(faxineiro);

        System.out.println("--- imprimindo as superclasses dos objetos ---");
        System.out.println(funcionario.getClass().getSuperclass());
        System.out.println(gerente.getClass().getSuperclass());
        System.out.println(vendedor.getClass().getSuperclass());
        System.out.println(faxineiro.getClass().getSuperclass());

    }

}
