/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author alumno
 */
public class leerfichero {
    private static int i;
    public static void main(String[] args) throws IOExceptions, FileNotFoundException, IOException {
        File fichero = new File("C:\\Users\\alumno\\Documents\\NetBeansProjects\\AccesoDatos\\NUEVODIR\\FICHERO3.TXT");
            FileReader fic = new FileReader(fichero);
            char b[]=new char[150];
            while ((i = fic.read(b)) !=-1)
   System.out.println(b);
            fic.close();
    }

}

