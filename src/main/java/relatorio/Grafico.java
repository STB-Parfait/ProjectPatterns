package relatorio;

public class Grafico extends Decorator implements iFeature {
    public Grafico(iFeature feature) {
        super(feature);
    }
    @Override
    public String descricao() {
        return feature.descricao() + "-Gráfico\n";
    }
}
