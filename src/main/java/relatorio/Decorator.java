package relatorio;

public abstract class Decorator implements iFeature {
    protected iFeature feature;
    public Decorator(iFeature feature) {
        this.feature = feature;
    }
}
