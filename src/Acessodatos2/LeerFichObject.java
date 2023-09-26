/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acessodatos2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;

public class LeerFichObject {
 public static void main(String[] args) throws IOException, ClassNotFoundException{   
   Persona persona;   //defino la variable persona
   File fichero = new File("C:\\prueba\\FichPersona.dat");//declara el fichero
   FileInputStream filein = new FileInputStream(fichero);//crea el flujo de entrada   
   //conecta el flujo de bytes al flujo de datos
   ObjectInputStream dataIS = new ObjectInputStream(filein);
      int i=1;
   try {
    while (true) { //lectura del fichero
	  persona= (Persona) dataIS.readObject(); //leer una Persona              
      System.out.println("Nombre: " + persona.getNombre() + ", edad: " + persona.getEdad());  
      System.out.println(i);i++;
    }
    }
catch ( EOFException | StreamCorruptedException eo) {}
   dataIS.close();  //cerrar stream de entrada      
  }
   
} 