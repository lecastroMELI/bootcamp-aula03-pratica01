import interfaces.Depositar;
import interfaces.Transferir;

public class Executivos implements Depositar, Transferir {
    @Override
    public void transacaoOk() {
        System.out.println("- Operação realizada");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("- Erro: Operação não realizada");
    }

    @Override
    public void depositar(int valor) {
        System.out.println("Depositando dinheiro...");
        if(valor > 0){
            transacaoOk();
        } else {
            transacaoNaoOk();
        }
    }

    @Override
    public void fazerTransferencia(int valor) {
        System.out.println("Fazendo transferência...");
        if(valor > 0){
            transacaoOk();
        } else {
            transacaoNaoOk();
        }
    }
}
