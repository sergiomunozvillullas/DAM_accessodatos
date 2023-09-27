/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAM_accessodatos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FilenameFilter;
/**
 *
 * @author alumno
 */
public class ej2 {
 public static void main(String[] args) {
//decimos donde está el directorio
        File directorio = new File("C:\\misArchivos");
       //convertimos los archivos en una lista de strings
         String[] archivos = directorio.list();
         //si existe alguno
    if (archivos != null) {
        //recorremos el array y los enseñamos
        for (int i = 0; i < archivos.length; i++) {
           if(archivos[i].contains(".java".toLowerCase())==true){
               System.out.println("Archivo " + i + ": " + archivos[i]);
           }
                    }
    }
 }
}
//        
//        // Filtrar los archivos por su extensión (.java)
//        FilenameFilter filter = (dir, name) -> name.toLowerCase().endsWith(".java");
//
//        if (directorio.exists() && directorio.isDirectory()) {
//            String[] archivosJava = directorio.list(filter);
//
//            if (archivosJava != null && archivosJava.length > 0) {
//                System.out.println("Archivos con extensión .java:");
//        for (int i = 0; i < archivosJava.length; i++) {
//            System.out.println("Archivo " + i + ": " + archivosJava[i]);
//        }
//            } else {
//                System.out.println("No se encontraron archivos con extensión .java en el directorio.");
//            }
//        } else {
//            System.out.println("La ruta no es un directorio válido.");
//        }
//    }

    
    