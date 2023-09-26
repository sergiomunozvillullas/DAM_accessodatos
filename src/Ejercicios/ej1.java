/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author alumno
 */
public class ej1 {
    public static void main(String[] args) {
//indicamos donde está la carpeta
 File carpeta = new File("C:\\misArchivos");
 //si la capeta existe
 if(carpeta.exists()){
     //y es un directorio
     if(carpeta.isDirectory()){
         //convertimos los archivos en una lista de strings
    String[] archivos = carpeta.list();
    
    //si existen los archivos
    if (archivos != null) {
        //recorremos el array y decimos como se llaman
        for (int i = 0; i < archivos.length; i++) {
            System.out.println("Archivo " + i + ": " + archivos[i]);
        }
        
        
    }
    }else{
    System.out.println("No es una carpeta");     
     }   
 }else{
     System.out.println("No existe esta archivo");
 }
         

         
//        String ruta = "C:\\misArchivos";
//
//        File directorio = new File(ruta);
//
//        if (directorio.exists() && directorio.isDirectory()) {
//            File[] archivos = directorio.listFiles();
//
//            if (archivos != null) {
//         for (File archivo : archivos) {
//            if (archivo.isFile()) {
//        System.out.println("Archivo: " + archivo.getName());
//             } else if (archivo.isDirectory()) {
//        System.out.println("Directorio: " + archivo.getName());
//           }
//        }
//            } else {
//       System.out.println("El directorio está vacío.");
//            }
//        } else {
//            System.out.println("La ruta no es un directorio válido.");
//        }
    }
}