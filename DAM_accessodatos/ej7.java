/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DAM_accessodatos;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

public class ej7 {
    public static void main(String[] args) throws IOException {
        int articulos[] = {1, 2, 3};       // artículo
        int precios[] = {10, 20, 30};      // precio
        String filePath = "C:\\misArchivos\\archivo\\articuloPrecio.dat";

        escribirArchivoPrecios(filePath, articulos, precios);
        leerArchivoPrecios(filePath);
    }

    public static void escribirArchivoPrecios(String filePath, int[] articulos, int[] precios) {
        try (RandomAccessFile file = new RandomAccessFile(filePath, "rw")) {
            for (int i = 0; i < articulos.length; i++) {
                String texto1 = "Este es el artículo número ";
                byte[] bytesTexto1 = texto1.getBytes(StandardCharsets.UTF_8);
                file.writeInt(bytesTexto1.length);
                file.write(bytesTexto1);
                
                file.writeInt(articulos[i]); // artículo número

                //forma de hacerlo añadiendo en el texto el entero
                String texto2 = " que cuesta: " + precios[i];
                byte[] bytesTexto2 = texto2.getBytes(StandardCharsets.UTF_8);
                file.writeInt(bytesTexto2.length);
                file.write(bytesTexto2);
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
                // Lee la longitud de la primera cadena y la cadena en sí
                int length1 = file.readInt();
                byte[] bytesTexto1 = new byte[length1];
                file.readFully(bytesTexto1);
                String texto1 = new String(bytesTexto1, StandardCharsets.UTF_8);
                // Lee el entero (artículo)
                int articulo = file.readInt();
                // Lee la longitud de la segunda cadena y la cadena en sí que contiene el entero
                int length2 = file.readInt();
                byte[] bytesTexto2 = new byte[length2];
                file.readFully(bytesTexto2);
                String texto2 = new String(bytesTexto2, StandardCharsets.UTF_8);

                System.out.println(texto1+articulo+texto2);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
