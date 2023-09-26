/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author alumno
 */
public class LeerFicheroDat {
        private static int i;

                public static void main(String[] args) throws FileNotFoundException,IOException {
File fichero = new File("C:\\prueba\\Fichdata.dat");
/*
FileInputStream filein = new FileInputStream(fichero);
DataInputStream dataOS = new DataInputStream(filein);

            char b[]=new char[150];
           // while ((i = fic.read(b)) !=-1)
            while ((i = filein.read()) !=-1)
   System.out.println(i);
            filein.close();
             dataOS.close();
*/
  try (FileInputStream filein = new FileInputStream(fichero);
              DataInputStream dataIS = new DataInputStream(filein)) 
         {

            for(int i =0;i<fichero.length();i++) 
            {
                try 
                {
                    System.out.println(dataIS.readUTF());
                    System.out.println(dataIS.readInt());
                } catch (EOFException e) 
                {
                    break;
                }
            }
         }

    }
    
} 