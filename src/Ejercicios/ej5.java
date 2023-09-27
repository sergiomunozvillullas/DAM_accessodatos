/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class ej5 {

    public static void clasificarDirectorio(String rutaDirectorio, String extension) {
       //se crea un file con la ruta de la carpeta
        File directorio = new File(rutaDirectorio);

        //si no es un directorio
        if (!directorio.isDirectory()) {
            System.err.println("La ruta no corresponde a un directorio.");
            return;
        }

        //creamos un array listando los archivos del direcorio
        File[] archivos = directorio.listFiles();
        //si hay archivos
        if (archivos != null) {
            //recorremos el el array
        for (int i = 0; i < archivos.length; i++) {
         File archivo = archivos[i];
            System.out.println(archivos[i]);
            String nombreArchivo = archivo.getName().toLowerCase();
            System.out.println(nombreArchivo);
            String rutaCompleta = rutaDirectorio + File.separator + nombreArchivo;

        // Crear un nuevo objeto File con la ruta en minúsculas
        File archivoEnMinusculas = new File(rutaCompleta);
         //si es un archivo y si el nombre del archivo termina con la extension dicha
            if (archivoEnMinusculas.isFile() && archivo.getName().endsWith(extension.toLowerCase())) {
            moverArchivo(archivoEnMinusculas, rutaDirectorio, extension.toLowerCase());
             }
        }
        } else {
            System.out.println("La carpeta está vacía.");
        }
    }

    private static void moverArchivo(File archivo, String rutaDirectorio, String extension) {
        File subdirectorio = new File(rutaDirectorio + File.separator + extension);
       
        if (!subdirectorio.exists()) {
            subdirectorio.mkdir();
        }
        //la ruta + // + extension
        File nuevoArchivo = new File(subdirectorio.getAbsolutePath() + File.separator + archivo.getName());

        try {
            Files.move(archivo.toPath(), nuevoArchivo.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Movido " + archivo.getName() + " a " + subdirectorio.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error al mover el archivo " + archivo.getName() + ": " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String rutaDirectorio = "C:\\misArchivos\\archivosjava"; //
        String extension = ".java"; // Cambia por la extensión que deseas clasificar

        clasificarDirectorio(rutaDirectorio, extension);
    }
}


