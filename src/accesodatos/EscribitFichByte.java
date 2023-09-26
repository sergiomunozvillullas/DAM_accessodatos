/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package accesodatos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class EscribitFichByte {
        public static void main(String[] args) throws IOException {
        File fichero = new File("C:\\prueba\\FichBytes.dat");
        FileOutputStream fileout = new FileOutputStream(fichero);
        
        FileInputStream filein = new FileInputStream(fichero);
int i;
for (i=1; i<100; i++)
    fileout.write(i);
fileout.close();

while((i = filein.read()) !=-1)
    System.out.println(i);
    filein.close();
        }
}
