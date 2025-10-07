package second;

public class PagamentoPix implements Pagamento {
    public final String chave;
    public PagamentoPix(String chave) {
        this.chave = chave;
    }
    public boolean validar(){
        if(this.chave==null){
            return false;
        } else {
            return !this.chave.equals("invalid");
        }
    }

    @Override
    public void processarPagamento(double valor){
        System.out.println("Processando...");
        if(validar()){
            System.out.println("Pagamento realizado com sucesso!");
        } else{
            System.out.println("ID inválido!");
        }
    }
}
