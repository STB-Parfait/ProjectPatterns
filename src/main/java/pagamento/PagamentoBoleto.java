package pagamento;

public class PagamentoBoleto implements Pagamento{
    private double saldo;
    public PagamentoBoleto(double saldo){
        this.saldo = saldo;
    }
    public boolean validar(double valor){
        return valor <= saldo;
    }
    @Override
    public void processarPagamento(double valor){
        System.out.println("Processando...");
        if(this.validar(valor)){
            System.out.println("Pagamento aprovado!");
        } else{
            System.out.println("Saldo insuficiente!");
        }
    }
}
