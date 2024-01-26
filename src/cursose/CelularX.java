package cursose;
////////////27
public class CelularX {
    ///27
    //regla principal, definir a los atributos en privado
    private String nombre;
    private String color;
    private String serie;
    //creamos nuestro metodos set y get

    public void mostrar() {
        System.out.println(getNombre() + " - " + getColor() +" - " + getSerie());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    ///pero tambien hay una forma mas facil y rapida de acceder a estos metodos
    // con alt + ins
    //o tambien clic derecho, insert code, set y get
    // o con alt +insert, clic en set y get, selecionamos todos, y ya tendremos todos nuestros metodos accesores


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerie() {
        if( serie == null){
            serie = "sin serie";
        }
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
