package relatorio;

public class Estatisticas extends Decorator implements iFeature {

    public Estatisticas(iFeature feature) {
        super(feature);
    }

    @Override
    public String descricao() {
        return feature.descricao() + ", estatisticas";
    }
}
