package desafioAnimais;

public abstract class Animal {
    public void emitirSom(String tipoAnimal) {
        System.out.print("Emite o som: ");
        switch (tipoAnimal) {
            case "dog": System.out.println("Au au");
                break;
            case "cat": System.out.println("Miau");
                break;
            case "vaca": System.out.println("Mu");
                break;
            default: System.out.println("Animal não mapeado");
        }
    }

}
