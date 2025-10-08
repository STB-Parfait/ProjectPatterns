package pagamento;

public class PagamentoService {
    public void processarPagamento(PagamentoFactory tipo, double transacao) {
        Pagamento produto = tipo.criarPagamento();
        produto.processarPagamento(transacao);
    }
}
