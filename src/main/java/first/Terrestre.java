package first;

public class Terrestre implements iTransporte {

    private double distancia;

    protected Terrestre(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public void calcularFrete() {
        System.out.printf("[valor do frete]: R$%.2f\n", distancia*1.5);
    }
}
