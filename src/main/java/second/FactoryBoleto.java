package second;

public class FactoryBoleto extends PagamentoFactory {
    private double saldo;
    public FactoryBoleto(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoBoleto(this.saldo);
    }
}
