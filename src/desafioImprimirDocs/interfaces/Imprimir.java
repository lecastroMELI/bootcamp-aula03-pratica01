package desafioImprimirDocs.interfaces;

import desafioImprimirDocs.Documento;

public interface Imprimir {
    // IMPLEMENTANDO UM MÉTODO ESTÁTICO
    public static void imprimirDocumento(Documento documento){
        System.out.println(documento.toString());
    }
}
