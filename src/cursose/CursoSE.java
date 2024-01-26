package cursose;


import com.sun.source.doctree.TextTree;

import javax.annotation.processing.Filer;
import java.io.*;
import java.util.*;

public class CursoSE { //clase
    ///////////////
    //21 y 22
    private String nombre; //atributo
    private int edad; //atributo
    ///////////////
    //23
    int edad1 = 24; //variable global
    ///////////////
    ///////////////////////////////////////////////////////////////
    //21
    public void saludar0(){ //metodo
        nombre ="Mitocode";
        edad = 24;

        System.out.println("Hola " + nombre);
        System.out.println("Edad " + edad);
    }
    ////////////////////////////////////////////////////////////////
    //22- metodos
    public void saludar(String nombre){
        System.out.println("Hola " + nombre);
    }
    public String despedir(String nombre, int edad){
        return nombre + edad;
    }
    ////////////////////////////////////////////////////////////////
    //23-alcance de las variables
    public void mostrarEdad(){
        // int edad1=23; //variable local
        //System.out.println(edad1);

        System.out.println(edad1);
    }
    ////////////////////////////////////////////////////////////////
    //41 Excepciones
    private void proceso1(){//con esto estamos diciendo que la divicion con cero es imposible,por lo
        //tanto estamos manejando en el comportamiento del programa el "error"
        int a = 7,b = 0;
        int division = a/b;
        System.out.println(division);
    }

    //43 throw y throws
    private void metodo1(){
        try{
            metodo2();
        }catch(Exception e){

        }
    }
    private void metodo2() {
        try {
            metodo3();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private void metodo3() throws Exception{ //throws viene acompaÃ±ado de una definicion de clase
        try{
            int division = 1/0;
        }catch(Exception e){
            //throw new Exception("Enviando exception");////throws viene acompaÃ±ado de una instancia de clase, es decir un objeto
            throw e;//forma 1
        }
    }
    ////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////
    //para 46 u 45 throws EdadExcepcion, Exception
    //para 47 throws IOException

    public static void main(String... mitocode) throws IOException { //main principal
        //21
        System.out.println("-----------------21 Clases-----------------");

        CursoSE se = new CursoSE();
        se.saludar0();
        ////////////////
        //22
        System.out.println("-----------------22 Metodos-----------------");
        se.saludar("Mitocode");

        String recepcionado = se.despedir("Code",24);
        System.out.println(recepcionado);
        ////////////////
        //23: Alcance de las variables
        System.out.println("-----------------23 Alcance de las variables-----------------");

        se.mostrarEdad();

        //24: POO
        System.out.println("-----------------24 POO-----------------");
        Celular ce = new Celular("LG","NEGRO");
        ce.llamar();

        Celular ce2 = new Celular("SAMSUNG","BLANCO");
        ce2.llamar();

        //ejemplo de como pasar objetos a metodos
        //Celular ce2 = new Celular("SAMSUNG","BLANCO");
        //ce2.llamarEspecial(ce2);

        //25: Constructores
        System.out.println("-----------------24 Constructores-----------------");

        Celular celular1 = new Celular(); //creo un objeto llamado celular 1 y lo instancio( con new)
        Celular celular2 = new Celular("LG");
        Celular celular3 = new Celular("LG","NEGRO");

        celular2.llamar();
        celular3.llamar();


        //27: get y set
        System.out.println("-----------------27 get y set-----------------");

        CelularX celular4 = new CelularX();
        celular4.setNombre("LG");
        celular4.setColor("NEGRO");


        celular4.setSerie("1234");

        //String nombrem = celular4.getNombre();
        //System.out.println(nombrem);
        //System.out.println(celular4.getNombre()); otra forma


        //celular4.mostrar();

        //28 : Herencia
        System.out.println("-----------------28 Herencia-----------------");

        Perro p= new Perro("Kaiser","Carnivoro",3,"Pastor alemnan");
        /*
        p.setEdad(3);
        p.setNombre("Kaiser");
        p.setRaza("Pastor alemnan");
        p.setTipo_alimentacion("Carnivoro");
         */
        p.mostrar();

        //29: Polimorfismo
        System.out.println("-----------------29 Polimorfismo-----------------");


        Animal a = new Perro("Kaiser","Carnivoro",3,"Pastor alemnan");
        a.alimentarse();

        Animal c= new Caballo("Pluto","Hierva",3);
        c.alimentarse();

        a.moverse();

        //30
        System.out.println("-----------------30 Encapsulamiento-----------------");
        String texto = "hola , mito";
        String[] vector = texto.split(","); //parte el texto

        //31
        System.out.println("-----------------31 Metodos de instancia y Metodos de clase-----------------");

        Persona per_1= new Persona();
        per_1.setNombre("Mitocode");
        per_1.setEdad(24);
        per_1.mostrarDeInstancia();

        Persona per_2 = new Persona();
        per_2.setNombre("Martha");
        per_2.setEdad(24);
        per_2.mostrarDeInstancia();

        Persona.mostrarDeClase();


        //32: Fecha (Date y Calendar(
        System.out.println("-----------------32 Fecha (Date y Calendar)-----------------");
        //Date

        Date fecha = new Date();
        int anio1 = fecha.getYear();
        System.out.println(anio1+1900);

        //Calendar

        Calendar calendario = Calendar.getInstance(); // metodo
        int anio2 = calendario.get(Calendar.YEAR); // year es una variable static asi que puedo acceder por ella por medio de una clase

        //calendario.algo

        System.out.println(anio2);

        //33: Interfaces
        System.out.println("-----------------33 Interfaces-----------------");
        //vamos a crear un nueva instancia de perro


        PerroEjInterf per =  new PerroEjInterf();

        per.mostrarTipoDeAnimal();

        String nombre = per.mostrarNombre();
        System.out.println(nombre);

        per.mostrarVida();


        //34 esta en otro archivo

        //35:StringBuilder
        System.out.println("-----------------35 StringBuilder-----------------");
        //ej: con +
        String texto1 = "Hola soy Mitocode";
        texto1 += " Suscribete " + " al canal";

        System.out.println(texto1);

        //ej : con la clase StringBuilder

        StringBuilder textoBuiler = new StringBuilder();
        textoBuiler.append("Hola soy Mitocode").append(" Suscribete ").append(" al canal");

        //toString : para obtener la cadena de texto que esta dentro de este objeto
        System.out.println(textoBuiler.toString());


        ///ejemplo en relacion al rendimiento:

        //nanoTime(); : este metedo es para obtener la hora en formato de nanosegundos

        long tiempo_inicio = System.nanoTime();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 1000; i++) {
            builder.append(i);
        }
        long tiempo_fin = System.nanoTime();

        double diferencia = (tiempo_fin - tiempo_inicio);

        System.out.println(diferencia);
        ////////////////////////////////////////////////////////////////////

        long tiempo_inicio2 = System.nanoTime();
        String texto2 = "";

        for (int i = 0; i < 1000; i++) {
            texto2 += i;
        }
        long tiempo_fin2 = System.nanoTime();

        double diferencia2 = (tiempo_fin2 - tiempo_inicio2);

        System.out.println(diferencia2);


        ///36:  Colecciones + Iterador


        System.out.println("-----------------36:Colecciones + Iterador-----------------");
        //Estamos declarando que el objeto lista,pertenece a la interfaz List de este tipo de dato
        // String pero que asu vez estoy generando una instancia de la clase ArrayList()
        //En la teoria: no puedo hacer una instancia de mi propia interfaz(List) es por eso que me
        // apoyo en la clase ( ArrayList )
        ///ej 1:
        System.out.println("EJEMPLO 1: Lista con String");
        List<String> lista = new ArrayList(); //
        //vamos a llenar nuestra lista con algunos elementos
        lista.add("Mitocode");
        lista.add("Suscribete");
        lista.add("Aprende facil");
        //vamos a recorerlo : vamos poner el tipo de dato, el apodo y la lista(objeto).
        /*
        for(String s : lista){
            System.out.println(s);
        }*/
        //observamos que nos muestra lo mismo que arriba
        //
        Iterator<String> iterador = lista.iterator();
        while (iterador.hasNext()) {//hasNext simplemente comprueba si el valor de la variable estÃ¡ dentro del rango.
            System.out.println(iterador.next()); //, se imprime en la consola el elemento actual de la lista utilizando el mÃ©todo next() del iterador. Este mÃ©todo tambiÃ©n mueve el iterador al siguiente elemento en la lista.
        }

        System.out.println("EJEMPLO 2: Lista con Persona");
        Persona per1 = new Persona();
        per1.setNombre("Mitocode");
        per1.setMonto(1000);
        per1.setCuenta(1);

        Persona per2 = new Persona();
        per2.setNombre("Code");
        per2.setMonto(2000);
        per2.setCuenta(2);

        Persona per3 = new Persona();
        per3.setNombre("Mito");
        per3.setMonto(3000);
        per3.setCuenta(3);

        List<Persona> lista2 = new ArrayList(); //
        //vamos a llenar nuestra lista con algunos elementos
        lista2.add(per1);
        lista2.add(per2);
        lista2.add(per3);

        Iterator<Persona> iterador2 = lista2.iterator();
        while (iterador2.hasNext()) {//hasNext simplemente comprueba si el valor de la variable estÃ¡ dentro del rango.
            System.out.println(iterador2.next().getNombre()); //, se imprime en la consola el elemento actual de la lista utilizando el mÃ©todo next() del iterador. Este mÃ©todo tambiÃ©n mueve el iterador al siguiente elemento en la lista.
        }


        //37 ArrayList
        System.out.println("-----------------37:ArrayList-----------------");
        System.out.println("ejemplo 1: no es tiene buen rendimiento");
        long inicio1 = System.currentTimeMillis();
        List<Integer> lista3 = new ArrayList();
        lista3.add(1); //1 procesador 1 bloque
        lista3.add(2); //1 procesador 1 bloque
        lista3.add(3); //1 procesador 1 bloque
        lista3.add(4); //1 procesador 1 bloque
        lista3.add(5); //1 procesador 1 bloque
        //usandose asi 5 veces el bloque para procesar 5bloques.
        //Pero si le indico la capacidad a mi ArrayList();
        long fin1 = System.currentTimeMillis();
        System.out.println(fin1-inicio1);

        long inicio2 = System.currentTimeMillis();
        System.out.println("ejemplo 2: tiene buen rendimiento");
        List<Integer> lista4 = new ArrayList(5);
        //Al momento de instancias actuo 1 sola vez y separo 5 bloques de memoria
        //1 procesador 5 bloques
        //esta forma de hacer es muy recomendables debido a que el rendiemiento es mejor
        lista4.add(1); //a cada bloque
        lista4.add(2);
        lista4.add(3);
        lista4.add(4);
        lista4.add(5);
        long fin2 = System.currentTimeMillis();
        System.out.println(fin2-inicio2);

        //38 LinkedList
        System.out.println("-----------------38 LinkedList-----------------");
        //formas de declarar una lista LinkedList:
        //forma 1:
        List<Integer> lista5 = new LinkedList(); //pero usamos esta
        //forma 2: apoyandonos en la clase y no la interfaz
        LinkedList lista6 = new LinkedList();
        //vamos a agregar elementos a la lista
        lista5.add(1);
        lista5.add(2);
        System.out.println(lista5.size()); //podemos ver el tamaÃ±o de la lista con la ayuda de size()
        System.out.println(lista5.get(0));

        System.out.println("---Ejemplo en funcion al rendimiento entre LinkedList y ArrayList---");
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        //nicio y fin es para poder ver cuanto demora operar este prosesamiento( de la opercion add)
        //operaciones add es agregar, get es obtener, remove es remover
        ////////////add/////////////
        System.out.println("---Ejemplo con la operacion add---");
        //ArrayList add
        long inicio3 = System.currentTimeMillis();

        for(int i = 0; i<100000; i++){
            arrayList.add(i);
        }
        long fin3 = System.currentTimeMillis();
        long duracion  = fin3 -inicio3;
        System.out.println("ArrayList add: " + duracion);

        //LinkedList add //oper
        inicio3 = System.currentTimeMillis();
        for(int i = 0; i<100000; i++){
            linkedList.add(i);
        }
        fin3 = System.currentTimeMillis();
        duracion  = fin3 -inicio3;
        System.out.println("LinkedList add: " + duracion);
        ////////////get/////////////
        System.out.println("---Ejemmplo con la operacion get---");
        //ArrayList get
        inicio3 = System.currentTimeMillis();
        for(int i = 0; i<100000; i++){
            arrayList.get(i);
        }
        fin3 = System.currentTimeMillis();
        duracion  = fin3 -inicio3;
        System.out.println("ArrayList get: " + duracion);

        //LinkedList get
        inicio3 = System.currentTimeMillis();
        for(int i = 0; i<100000; i++){
            linkedList.get(i);
        }
        fin3 = System.currentTimeMillis();
        duracion  = fin3 -inicio3;
        System.out.println("LinkedList get: " + duracion);

        ////////////remove/////////////
        System.out.println("---Ejemmplo con la operacion remove---");
        //ArrayList remove
        inicio3 = System.currentTimeMillis();
        for(int i = 9999; i>=0; i--){
            arrayList.remove(i);
        }
        fin3 = System.currentTimeMillis();
        duracion  = fin3 -inicio3;
        System.out.println("ArrayList remove: " + duracion);

        //LinkedList remove
        inicio3 = System.currentTimeMillis();
        for(int i = 9999; i>=0; i--){
            linkedList.remove(i);
        }
        fin3 = System.currentTimeMillis();
        duracion  = fin3 -inicio3;
        System.out.println("LinkedList remove: " + duracion);

        //39 HashMap (diccionario)
        System.out.println("-----------------39 HashMap (diccionario)-----------------");
        //Map dicccionario = new HashMap(); // por medio de la interfaz
        HashMap dicccionario = new HashMap(); // por medio de la clase
        dicccionario.put("user","Mitocode");
        dicccionario.put("youtube","www.youtube.com/mitocode");
        dicccionario.put("facebook","www.facebook.com/mitocode");

        String contenido = dicccionario.get("user").toString();
        boolean respuesta = dicccionario.containsKey("user");
        System.out.println(contenido);
        System.out.println(respuesta);

        //40 HashSet
        System.out.println("-----------------40 HashSet-----------------");
        Set<String> lista7 = new HashSet<String>();
        lista7.add("a");
        lista7.add("b");
        lista7.add("c");
        for(String dato : lista7){
            System.out.println(dato);
        }

        //41 Excepciones
        System.out.println("-----------------41 Excepciones-----------------");
        try{
            CursoSE curso =new CursoSE();
            curso.proceso1();
        }catch(Exception ex){
            System.out.println(ex.getMessage()); //aca me apoyo en ex de Exception asi obtengo ese mensaje
        }finally {
            System.out.println("bloque finally");
        }

        //42 JerarquÃ­a de Excepciones
        System.out.println("-----------------42 JerarquÃ­a de Excepciones-----------------");
        try{
            CursoSE curso =null;
            curso.proceso1();
        }catch(NullPointerException ex){
            System.out.println(ex.getMessage()); //aca me apoyo en ex de Exception asi obtengo ese mensaje
        }catch(ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("bloque finally");
        }

        //43 throw y throws
        System.out.println("-----------------43 throw y throws-----------------");
        CursoSE se2= new CursoSE();
        se.metodo1();

        //44 Excepciones Personalizadas
        System.out.println("-----------------44 Excepciones Personalizadas-----------------");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = sc1.nextInt();
        final int EDAD_MAXIMA = 100;

        try{
            if(edad < EDAD_MAXIMA){
                System.out.println("Bienvenido");
            }else{
                throw new EdadExcepcion("edad no permitida, edad no correcta");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //45 File
        System.out.println("-----------------45  File-----------------");

        //para verificar si existe el archivo
        /*
        File archivo = new File("C:\\Users\\Usuario\\Desktop\\java_martha barra\\Curso java_ 50 videos\\mitocode.txt");
        boolean respuestaA= archivo.exists();
        System.out.println(respuestaA);


         */

        //para renombrar el archivo
        //boolean renombrar= archivo.renameTo("algo....");

        //para eliminar el archivo
        //boolean eliminado= archivo.delete();
        //System.out.println(eliminado);

        //46 Lectura de Archivos
        System.out.println("-----------------46 Lectura de Archivos-----------------");
/*
        FileReader archivo = new FileReader("C:\\Users\\Usuario\\Desktop\\java_martha barra\\Curso java_ 50 videos\\mitocode.txt");
        BufferedReader buffer = new BufferedReader(archivo);

        String texto3;

        while((texto3 = buffer.readLine()) != null){
            System.out.println(texto3);
        }*/
        //System.out.println("otra forma");
        /*
        FileInputStream in = new FileInputStream("C:\\Userio\\Usuario\\Desktop\\java_martha barra\\Curso java_ 50 videos\\mitocode.txt");
        Scanner scanner = new Scanner(in,"UTF-8");
        String texto3 = scanner.next();
        System.out.println(texto3);*/// no me funciona

        //47 Escritura de Archivos
        System.out.println("----------------- 47 Escritura de Archivos-----------------");
        //FileWriter archivo3 = null; //lo comente porque en 48 la declare
        PrintWriter printer = null;
        //para sobrescribir el archivo
        /*
        try{
            archivo3 = new FileWriter("C:\\Users\\Usuario\\Desktop\\java_martha barra\\Curso java_ 50 videos\\mitocode.txt");
            printer = new PrintWriter(archivo3);

            printer.println("Escrito desde java por mitocode");
        }catch (Exception e){
            //exception
        }finally {
            if(archivo3 != null){
                archivo3.close();
            }
        }
         */
        //ahora si no queremos sobrescribir el archivo y queremos escrbir a continuacion
        /*
        try{
            archivo3 = new FileWriter("C:\\Users\\Usuario\\Desktop\\java_martha barra\\Curso java_ 50 videos\\mitocode.txt",true);
            printer = new PrintWriter(archivo3);

            printer.println("Suscribete al canal!");
        }catch (Exception e){
            //exception
        }finally {
            if(archivo3 != null){
                archivo3.close();
            }
        }
        */

        //cuando ejecutamos esto vemos que se podruce la modificacion y pisa cualquier cosa del archivo
        //con lo que pusimos "Escrito desde java por mitocode"

        //48 try with resources
        System.out.println("----------------- 48 try with resources-----------------");
        try(FileWriter archivo3 = new FileWriter("C:\\Users\\Usuario\\Desktop\\java_martha barra\\Curso java_ 50 videos\\mitocode.txt",true);){
            printer = new PrintWriter(archivo3);

            printer.println("Suscribete al canal!");
        }catch (Exception e){
            //exception
        }
        //observamos que volvi a escribir una nueva linea simplemente asignandole a try que gestione los recursos



    }



}
