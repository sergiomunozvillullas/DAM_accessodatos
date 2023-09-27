package com.mycompany.DAM_accessodatos;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ej3 {

    public static void moverArchivo(String rutaOrigen, String rutaDestino, boolean reemplazarExistente) {
        Path origenPath = Paths.get(rutaOrigen);
        Path destinoPath = Paths.get(rutaDestino);

        try {
            // Si la ruta destino especifica un archivo existente y no se permite reemplazar, terminar la operación
            if (Files.exists(destinoPath) && !reemplazarExistente) {
                System.out.println("No se puede mover el archivo. El archivo destino ya existe y no se permite reemplazar.");
                return;
            }

            // Mover o renombrar el archivo
            Files.move(origenPath, destinoPath);
            //con ficheros
            //f1.renameTo(f2);

            System.out.println("Archivo movido correctamente.");
        } catch (FileAlreadyExistsException e) {
            System.err.println("Error: El archivo destino ya existe.");
        } catch (IOException e) {
            System.err.println("Error al mover el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String rutaOrigen = "C:\\misArchivos\\Hola";
        String rutaDestino = "C:\\misArchivos\\Hola.txt";
        boolean reemplazarExistente = true;  // Cambiar a false si no se desea reemplazar

        moverArchivo(rutaOrigen, rutaDestino, reemplazarExistente);
    }
}