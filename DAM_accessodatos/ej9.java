/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DAM_accessodatos;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
//el ejercicio es igual porque anteriormente ya los mostraba
public class ej9 {
    public static void main(String[] args) throws IOException {
        int articulos[] = {1, 2, 3};       // artículo
        int precios[] = {102, 20, 30};      // precio
        String filePath = "C:\\misArchivos\\archivo\\articuloPrecio2.dat";

        escribirArchivoPrecios(filePath, articulos, precios);
        leerArchivoPrecios(filePath);
        System.out.println("---------------------------");
        actualizarArchivoPrecios(filePath, articulos, precios);
        leerArchivoPrecios(filePath);
    }

    public static void escribirArchivoPrecios(String filePath, int[] articulos, int[] precios) {
        try (RandomAccessFile file = new RandomAccessFile(filePath, "rw")) {
            //recorro el for en articulos lenght porque tienen la lisma longitud por eso no creo 2 fors
            for (int i = 0; i < articulos.length; i++) {
                file.writeInt(articulos[i]); // artículo número
                file.writeInt(precios[i]); // artículo número
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerArchivoPrecios(String filePath) {
        try (RandomAccessFile file = new RandomAccessFile(filePath, "r")) {
            //ponglo el puntero al inicio (en este caso da igual porque no lo he movido en ningún lado)
            file.seek(0);
            // mientras la posición actual del puntero sea menor que la longitud total del archivo
            while (file.getFilePointer() < file.length()) {
                // Lee el entero (artículo)
                int articulo = file.readInt();
                // Lee el entero (precio)
                int precio = file.readInt();

                System.out.println("articulo: "+articulo+" precio: "+precio);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
       public static void actualizarArchivoPrecios(String filePath, int[] articulos, int[] precios) {
        try (RandomAccessFile file = new RandomAccessFile(filePath, "rw")) {
            //recorro el for en articulos lenght porque tienen la lisma longitud por eso no creo 2 fors
            for (int i = 0; i < articulos.length; i++) {
                //se divide el precio
                if(precios[i]>100){
                file.writeInt(articulos[i]); // artículo número
                file.writeInt(precios[i]/2); // artículo número
                }
                //se multiplica el precio
                if(precios[i]<100){
                file.writeInt(articulos[i]); // artículo número
                file.writeInt(precios[i]*2); // artículo número
                }
               // file.writeInt(articulos[i]); // artículo número
               // file.writeInt(precios[i]); // artículo número
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
