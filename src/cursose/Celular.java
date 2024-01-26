package cursose;

public class Celular {
    //String nombre; //atributos
    //String color;
    //26: Modificadores de alcance
    //////////////////////
    public String nombre;
    private String color;
    protected String serie;
    String fecha;
    //////////////////////////
//EJEMPLO DEL 25
    public Celular(String nombre, String color){ //metodo contructor
        this.nombre = nombre;
        this.color = color;
    }

    public Celular(String nombre){ //metodo contructor
        this.nombre = nombre;
    }
    public Celular(){//metodo contructor
        System.out.println("Hola Soy un Constructor ");
    }


    public void llamar(){
        System.out.println(nombre + "-" + color + " esta llamando...");
    }

    public void llamarEspecial(Celular ce){
        System.out.println(ce.nombre + "-" + ce.color + " esta llamando...");
    }
}
