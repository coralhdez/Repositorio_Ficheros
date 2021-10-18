package ManejoArchivos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/* MÉTODOS PARA CRUD */
public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {
        //Declaro un objeto de tipo File
        var archivo = new File(nombreArchivo);
        // PrintWriter clase que me permite escribir sobre el archivo

        try {
            var salida = new PrintWriter(archivo);
            //Ya esta creado el archivo
            salida.close(); //cerrar el archivo
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException e) { //excepcion por si no está el fichero
            e.printStackTrace(System.out);
        }

    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {  // recibe nombre de archivo y contenido
        //Declaro objeto de tipo File
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo); //quiero escribir en archivo
            salida.println(contenido); //escribo el parametro contenido
            salida.close(); //no dejo el fichero abierto, lo cierro
            System.out.println("Se ha escrito el contenido del archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }

    }

    public static void agregarArchivo(String nombreArchivo, String contenido) {
        //declarar objeto 
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(nombreArchivo, true)); //para que no sobreescriba la informacion la agrega
            salida.println(contenido); //agregar contenido
            salida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) { //excepciones de lectura/escritura
            e.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);

        try {
            //ENTRADA ES EL DESCRIPTOR DE LECTURA
            var entrada = new BufferedReader(new FileReader(archivo)); //clase para leer archivos y filereader leer todo
            //DEVUELVE UNA LÍNEA DEL ARCHIVO
            var linea = entrada.readLine(); //me devuelve la primera linea
            while (linea != null) { // HASTA NULL
                System.out.println("linea = " + linea);
                //AVANZAMOS EN LA LECTURA
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
