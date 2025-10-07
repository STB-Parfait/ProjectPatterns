package frete;

public class FabricaAereo extends Fabrica {
    @Override
    iTransporte criarFrete(double peso) {
        return new Aereo(peso);
    }
}
