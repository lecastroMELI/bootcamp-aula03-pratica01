package desafioImprimirDocs;

import desafioImprimirDocs.interfaces.Imprimir;

public class AppDocumento {
    public static void main(String[] args) {
        Livro livro = new Livro(
            "LIVRO PDF",
            398,
            "J.K. Rolling",
            "Harry Potter e o Cálice de Fogo",
            "Fantasia");

        Imprimir.imprimirDocumento(livro);
    }
}
