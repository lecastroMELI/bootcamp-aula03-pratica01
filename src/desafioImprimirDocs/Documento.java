package desafioImprimirDocs;

public abstract class Documento {
    private String tipoDocumento;

    // CONSTRUTOR
    public Documento(String tipoDocumento){
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public String toString() {
        return "Documento{" +
            "tipoDocumento='" + tipoDocumento + '\'' +
            '}';
    }

    public void teste(){};
}
