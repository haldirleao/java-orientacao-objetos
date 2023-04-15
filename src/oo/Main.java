package oo;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setModelo("BMW série 3");
        carro1.setCor("Azul");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println("R$ " + String.format("%.2f", carro1.totalValorTanque(6.39)));

        System.out.println("-----------");
        Carro carro2 = new Carro("Cinza", "Mercedez Bens classe C", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println("R$ " + String.format("%.2f", carro2.totalValorTanque(6.39)));
    }
}
