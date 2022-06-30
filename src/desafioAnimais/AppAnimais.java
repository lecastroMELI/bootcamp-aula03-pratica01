package desafioAnimais;

public class AppAnimais {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        Vaca malhada = new Vaca();
        Gato felino = new Gato();

        System.out.println("CACHORRO");
        dog.emitirSom("dog");
        dog.comerCarne();

        System.out.println(" ");

        System.out.println("VACA");
        malhada.emitirSom("vaca");
        malhada.comerPasto();

        System.out.println(" ");

        System.out.println("GATO");
        felino.emitirSom("cat");
        felino.comerCarne();

        // Esta chamada refere-se a implementação comentada presente na classe Cachorro.
        // dog.emitirSom();
    }
}
