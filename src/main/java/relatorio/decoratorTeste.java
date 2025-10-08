package relatorio;

public class decoratorTeste {
    public static void main(String[] args) {

        Relatorio relatorio = new Relatorio();

        relatorio.addGraph();
        relatorio.addStatistics();

        relatorio.printStructure();
    }
}
