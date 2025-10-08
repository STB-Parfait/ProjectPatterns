package pagamento;

public class testePagamento {
    public static void main(String[] args) {
        PagamentoService pagamento = new PagamentoService();

        pagamento.processarPagamento(new FactoryCartaoCredito("1111222233334444"), 150.00);

        pagamento.processarPagamento(new FactoryBoleto(500.00),300.00);

        pagamento.processarPagamento(new FactoryPix("chave"),50.00);
    }
}
