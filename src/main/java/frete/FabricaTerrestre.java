package frete;

public class FabricaTerrestre extends Fabrica {
    @Override
    iTransporte criarFrete(double distancia) {
        return new Terrestre(distancia);
    }
}
