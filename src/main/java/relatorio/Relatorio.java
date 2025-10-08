package relatorio;

public class Relatorio {
    private iFeature estrutura;

    public Relatorio(){
        estrutura = new BaseDeRelatorio();
    }
    public void addGraph(){
        Grafico novaEstrutura = new Grafico(estrutura);
        estrutura =  novaEstrutura;
    }
    public void addStatistics(){
        Estatisticas novaEstrutura = new Estatisticas(estrutura);
        estrutura =  novaEstrutura;
    }

    public void printStructure(){
        System.out.println(estrutura.descricao());
    }
}
