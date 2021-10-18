
package test;

import static ManejoArchivos.ManejoArchivos.agregarArchivo;
import static ManejoArchivos.ManejoArchivos.crearArchivo;
import static ManejoArchivos.ManejoArchivos.escribirArchivo;
import static ManejoArchivos.ManejoArchivos.leerArchivo;


public class Test {
    
    
    public static void main(String[] args) {
        
       //CREAR
        var nombreArchivo = "Asignaturas.txt";
        crearArchivo(nombreArchivo); //Llamamos al método, 
        /*lo vemos en la pestaña "Files". Importante tener 
        permisois de escritura en este lugar*/
         var nombreArchivo2 = "Asignaturas2.txt";
        crearArchivo(nombreArchivo2);
        
        
       // ESCRIBIR
       var contenido1= "Holaaaa";
        escribirArchivo(nombreArchivo, "Hola mira como escribo");
        escribirArchivo(nombreArchivo2, contenido1);
        escribirArchivo(nombreArchivo, "Añado más texto a mi archivo"); //lo reemplaza
        
        
        //AGREGAR 
        agregarArchivo(nombreArchivo2, contenido1);
        agregarArchivo(nombreArchivo2, "Empresas");
        
        //LEER, primero vamos a agregar varias
        agregarArchivo(nombreArchivo, "SGE");
        agregarArchivo(nombreArchivo, "PSMD");
        agregarArchivo(nombreArchivo, "EMPRESAS");
        leerArchivo(nombreArchivo);
        
        
    }
}
