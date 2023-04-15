package aula3_1;

/* Classe de exemplo para o exercício da Aula 3 de OO */

// Nessa classe e métodos não existem declarações dos modificadores: public/private/protected.
// Para saber mais: https://stackoverflow.com/questions/32447678/omitting-public-modifier-in-java-methods

class Carro {

    // atributos da classe
    String cor;
    String modelo;
    int capacidadeTanque;

    // contrutores
    Carro() {
    }

    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque; // em litros
    }

    // getters & setters
    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    // método - total em R$ para enchimento do tanque
    double totalValorTanque(double valorLitroCombustivel) {

        return (capacidadeTanque * valorLitroCombustivel);
    }
}