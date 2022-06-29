package desafioImprimirDocs;

public class Livro extends Documento{
    private int numPaginas;
    private String nomeAutor, titulo, genero;

    // CONSTRUTOR
    public Livro(String tipoDocumento, int numPaginas, String nomeAutor, String titulo, String genero){
        super(tipoDocumento);
        this.numPaginas = numPaginas;
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.genero = genero;
    }

    // ESSE MÉTODO SOBRESCREVE O MÉTODO DA CLASSE ABSTRATA, PORTANTO É ESSE QUE SERÁ CHAMADO NA IMPRESSÃO DO DOCUMENTO.
    // PORQUE? PQ A INTERFACE IMPLEMENTA UM MÉTODO ESTÁTICO QUE ACIONA O MÉTODO toString() DA CLASSE ABSTRATA.
    // LOGO, SE ESSE toString AQUI DO LIVRO SUBSTITUI O toString da CLASSE ABSTRATA DOCUMENTO (que é herdada por livro),
    // É ELE QUE SERÁ USADO QUANDO HOUVER A IMPRESSÃO, OU SEJA, QUANDO A INTERFACE Imprimir FOR USADA EM AppDocumento.
    // SE COMENTAR ESSE TRECO E RODAR, VERÁ QUE O toString QUE ESTÁ SENDO CHAMADO É O DA CLASSE ABSTRATA.
    @Override
    public String toString() {
        return "Livro {" +
            "numPaginas=" + numPaginas +
            ", nomeAutor='" + nomeAutor + '\'' +
            ", titulo='" + titulo + '\'' +
            ", genero='" + genero + '\'' +
            '}';
    }
}
