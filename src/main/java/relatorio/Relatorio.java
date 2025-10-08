//---
//
//  O único propósito desta classe é servir a função de service e,
//  principalmente, organizar o comportamento das classes, quase
//  como um menu.
//
//---
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
