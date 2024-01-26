package cursose;

public class EdadExcepcion extends Exception{ // con extends heradaremos de la clase Exception, de la clase padre
    public EdadExcepcion(String mensaje){
        super(mensaje); //al constructor que esta heredando
    }
}
