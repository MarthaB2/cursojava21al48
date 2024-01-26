package cursose;

///33

public class PerroEjInterf implements Animalinterf, SerVivoIn{

    @Override
    public void mostrarTipoDeAnimal() {
        System.out.println("Soy un mamifero, perro");
    }

    @Override
    public String mostrarNombre() {
        return "Kaiser";
    }


    @Override
    public void mostrarVida() {
        System.out.println("Estoy 100% vivo aprendiendo JAVA con Mitocode");
    }
}
