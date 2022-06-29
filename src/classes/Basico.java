package classes;

import interfaces.ConsultarSaldo;
import interfaces.PagarServico;
import interfaces.Sacar;

public class Basico implements Sacar, PagarServico, ConsultarSaldo {
    @Override
    public void transacaoOk() {
        System.out.println("- Operação realizada com sucesso.");
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
    public void pagarServico(String tipoServico) {
        System.out.println("Pagamento do serviço: " + tipoServico);
        // simulando que o pagamento ocorreu
        transacaoOk();
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Consultando saldo...");
    }
}
