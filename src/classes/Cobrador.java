package classes;

import interfaces.ConsultarSaldo;
import interfaces.Sacar;

public class Cobrador implements Sacar, ConsultarSaldo {
    @Override
    public void transacaoOk() {
        System.out.println("- Operação realizada com sucesso");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("- Erro: Operação não realizada");
    }

    @Override
    public void sacar(double valor) {
        System.out.println("Sacando R$" + valor);
        if(valor > 0){
            transacaoOk();
        } else {
            transacaoNaoOk();
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Consultando Saldo");
    }
}
