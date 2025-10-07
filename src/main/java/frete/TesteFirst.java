package frete;

public class TesteFirst {
    public static void main(String[] args) {

        FabricaTerrestre t = new FabricaTerrestre();
        FabricaAereo a = new FabricaAereo();
        FabricaMaritimo m = new FabricaMaritimo();

        iTransporte freteTerrestre = t.criarFrete(27.45); //coloca a distância em km
        iTransporte freteAereo = a.criarFrete(77.00);//coloca o peso em kg
        iTransporte freteMaritimo = m.criarFrete(127.05);//coloca o volume em m³

        freteTerrestre.calcularFrete();
        freteAereo.calcularFrete();
        freteMaritimo.calcularFrete();

    }
}
