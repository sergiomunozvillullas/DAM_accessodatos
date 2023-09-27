/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;


import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ej6 {
 public static void main(String[] args) throws IOException {      
   File fichero = new File("C:\\misArchivos\\archivo\\escribir.dat");
   //declara el fichero de acceso aleatorio
   RandomAccessFile file = new RandomAccessFile(fichero, "rw");
        for (int i = 0; i < 4; i++) {
            file.writeInt(1); 
        
        }
        for (int i = 0; i < 5; i++) {
            file.writeInt(2); 

        }
        file.seek(0);
        for (int i = 0; i <9 ; i++) {
            System.out.println(file.readInt());

         }

        
       
   file.close();  //cerrar fichero 
   }
   
} 