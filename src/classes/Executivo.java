package classes;

import interfaces.Depositar;
import interfaces.Transferir;

public class Executivo implements Depositar, Transferir {
    @Override
    public void transacaoOk() {
        System.out.println("- Operação realizada com sucesso.");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("- Erro: Operação não realizada");
    }

    @Override
    public void depositar(int valor) {
        System.out.println("Depositando R$" + valor);
        if(valor > 0){
            transacaoOk();
        } else {
            transacaoNaoOk();
        }
    }

    @Override
    public void fazerTransferencia(int valor) {
        System.out.println("Transferindo R$" + valor);
        if(valor > 0){
            transacaoOk();
        } else {
            transacaoNaoOk();
        }
    }
}
