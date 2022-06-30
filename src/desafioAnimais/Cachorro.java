package desafioAnimais;

public class Cachorro extends Animal implements Carnivoro {
    @Override
    public void comerCarne() {
        System.out.println("Alimentação: Carne");
    }

    // Esta função refere-se a implementeção comentada na classe Animal
    //    @Override
    //    public void emitirSom() {
    //        System.out.println("Au - Au !");
    //    }
}
