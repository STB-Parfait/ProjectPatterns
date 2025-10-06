package first;

public class FabricaMaritimo extends Fabrica{
    @Override
    iTransporte criarFrete(double volume) {
        return new Maritimo(volume);
    }
}