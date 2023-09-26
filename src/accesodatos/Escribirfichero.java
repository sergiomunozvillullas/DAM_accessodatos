/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author alumno
 */
public class Escribirfichero
{
    public static void main(String[] args) throws IOException {
        File fichero = new File("C:\\prueba\\FICHERO.TXT"); //Declara fichero texto
            FileWriter fic = new FileWriter(fichero); //Crear el flujo
            String cadena ="Esto es una prueba con FileWriter";
            
            
            char [] cad= cadena.toCharArray(); //convierte string en array
            for(int i=0; i<cad.length; i++)
                fic.write(cad[i]); //se va escribiendo un caracter
                fic.append('*'); //añade al final un *
                fic.close(); //cierra fichero
    }

}
