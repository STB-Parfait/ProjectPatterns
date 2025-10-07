package frete;

public class Aereo implements iTransporte {

    private double peso;

    protected Aereo(double peso) {
        this.peso = peso;
    }

    @Override
    public void calcularFrete() {
        System.out.printf("[valor do frete]: R$%.2f\n", peso*2.75);
    }
}
