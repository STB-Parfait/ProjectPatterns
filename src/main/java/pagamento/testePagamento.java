package pagamento;

public class testePagamento {
    public static void main(String[] args) {
        PagamentoService pagamento = new PagamentoService();

        pagamento.processarPagamento(new PagamentoCartaoCredito("1111222233334444"), 150.00);

        pagamento.processarPagamento(new PagamentoBoleto(500.00),300.00);

        pagamento.processarPagamento(new PagamentoPix("chave"),50.00);
    }
}
