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

    // Foi sugerido que implementasse a classe emitirSom aqui, de forma abstrata, para ser implementada por cada
    // uma das classe animal: Cachorro, Gato e Vaca. (Tem um exemplo na classe Cachorro)
    // SOURCE https://github.com/MauriKlein/com.dh.meli.animais/tree/main/src/model

    // public abstract void emitirSom();
}
