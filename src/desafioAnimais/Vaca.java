package desafioAnimais;

public class Vaca extends Animal implements Herbivoro{
    @Override
    public void comerPasto() {
        System.out.println("Alimentação: Pasto");
    }
}
