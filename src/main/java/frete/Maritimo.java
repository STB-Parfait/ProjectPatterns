package frete;

public class Maritimo implements iTransporte {

    private double volume;

    protected Maritimo(double volume) {
        this.volume = volume;
    }

    @Override
    public void calcularFrete() {
        System.out.printf("[valor do frete]: R$%.2f\n", volume*0.75);
    }
}
