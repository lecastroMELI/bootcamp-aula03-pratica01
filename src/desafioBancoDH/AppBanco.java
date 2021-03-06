package desafioBancoDH;//OUTRA FORMA DE FAZER https://github.com/MauriKlein/com.dh.meli.bancoInterfaces/tree/main/src/com/company

import desafioBancoDH.classes.Basico;
import desafioBancoDH.classes.Cobrador;
import desafioBancoDH.classes.Executivo;

public class AppBanco {
    public static void main(String[] args) {
        Executivo executivo1 = new Executivo();
        Basico clienteBasico1 = new Basico();
        Cobrador clienteCobrador = new Cobrador();

        System.out.println("\n\n---------Executivo---------");
        executivo1.depositar(0);
        executivo1.fazerTransferencia(3502);
        executivo1.depositar(6927);

        System.out.println("\n\n---------Básico---------");
        clienteBasico1.consultarSaldo();
        clienteBasico1.sacar(15000.00);
        clienteBasico1.pagarServico("Aluguel");

        System.out.println("\n\n---------Cobrador---------");
        clienteCobrador.consultarSaldo();
        clienteCobrador.sacar(20000);
        clienteCobrador.sacar(-10);
    }
}
