import interfaces.Depositar;

public class Executivos implements Depositar {
    @Override
    public void transacaoOk() {
        System.out.println("Depósito realizado");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Erro: Depósito não realizado");
    }

    @Override
    public void depositar(int valor) {
        System.out.println("Depositando dinheiro");
        if(valor > 0){
            transacaoOk();
        } else {
            transacaoNaoOk();
        }
    }
}
