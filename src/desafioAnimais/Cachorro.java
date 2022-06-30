package desafioAnimais;

public class Cachorro extends Animal implements Carnivoro {
    @Override
    public void comerCarne() {
        System.out.println("Alimentação: Carne");
    }
}
