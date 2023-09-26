/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.*;

public class ej4 {

    public static void copiarDirectorioRecursivo(String rutaOrigen, String rutaDestino) {
        File directorioOrigen = new File(rutaOrigen);
        File directorioDestino = new File(rutaDestino);

        try {
        //copiar el origen al destino
        copiarContenido(directorioOrigen, directorioDestino);
         System.out.println("Directorio copiado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al copiar el directorio: " + e.getMessage());
           
            //Hola
            System.out.println(directorioOrigen);
            //Adios
            System.out.println(directorioDestino);
            
            String[] archivos = directorioOrigen.list();    
            //recorremos el array y decimos como se llaman
             for (int i = 0; i < archivos.length; i++) {
             System.out.println("Archivo " + i + ": " + archivos[i]);
            }


        }
    }

private static void copiarContenido(File origen, File destino) throws IOException {
    if (origen.isDirectory()) {
                           // Si es un directorio, crearlo en el destino y copiar su contenido
        destino.mkdirs();
        String[] archivos = origen.list();
        

        
        for (int i = 0; i < archivos.length; i++) {
            String nombreArchivo = archivos[i];
            System.out.println(nombreArchivo);
            copiarContenido(new File(origen, nombreArchivo), new File(destino, nombreArchivo));
        }
        
    } else {

         // Si es un archivo, copiarlo al destino
        Path origenPath = origen.toPath();
        Path destinoPath = destino.toPath();
        Files.copy(origenPath, destinoPath.resolve(origen.getName()), StandardCopyOption.REPLACE_EXISTING);

    }
}

    public static void main(String[] args) {
        String rutaOrigen = "C:\\misArchivos\\Hola";
        String rutaDestino = "C:\\misArchivos\\Adios";

        copiarDirectorioRecursivo(rutaOrigen, rutaDestino);
    }
}