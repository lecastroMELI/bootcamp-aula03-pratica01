package desafioAnimais;

public class Gato extends Animal implements Carnivoro{
    @Override
    public void comerCarne() {
        System.out.println("Alimentação: Carne");
    }
}
