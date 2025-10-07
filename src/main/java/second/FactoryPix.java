package second;

public class FactoryPix extends PagamentoFactory{
    private String chave;
    public FactoryPix(String chave){
        this.chave = chave;
    }
    @Override
    Pagamento criarPagamento() {
        return new PagamentoPix(this.chave);
    }
}
