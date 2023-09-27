/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DAM_accessodatos;


import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.EOFException;

public class ej6 {
 public static void main(String[] args) throws IOException, ClassNotFoundException{      
   File fichero = new File("C:\\misArchivos\\archivo\\escribir.dat");
   //declara el fichero de acceso aleatorio
   RandomAccessFile file = new RandomAccessFile(fichero, "rw");
        for (int i = 0; i < 4; i++) {
            file.writeInt(1); 
        
        }
        for (int i = 0; i < 5; i++) {
            file.writeInt(2); 

        }
        file.seek(0);//posición 0
        System.out.println("longitud de los numeros del archivo: "+file.length()/4);
        System.out.println("------------------");
        
        for (int i = 0; i <file.length()/4 ; i++) {
            System.out.println(file.readInt());
         }
        
        //Cada entero ocupa 4 bits entonces 4x4=16         
        file.seek(16);

        for (int i = 0; i <5 ; i++) {
            file.writeInt(3); 
         }
        
        System.out.println("------------------");
        System.out.println("longitud de los numeros del archivo: "+file.length()/4);
        System.out.println("------------------");
        
        file.seek(0);//posición 0
        
        for (int i = 0; i <file.length()/4 ; i++) {
            System.out.println(file.readInt());
        }
                

        
       
   file.close();  //cerrar fichero 
   }
   
} 