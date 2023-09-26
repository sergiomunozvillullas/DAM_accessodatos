/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author alumno
 */
public class EscribirFichData {
            public static void main(String[] args) throws IOException {
File fichero = new File("C:\\prueba\\Fichdata.dat");
FileOutputStream fileout = new FileOutputStream(fichero);
DataOutputStream dataOS = new DataOutputStream(fileout);

String nombres[] = {"Ana","Luis Miguel"};
int edades[] = {14,15};
for (int i=0; i<edades.length; i++){
dataOS.writeUTF(nombres[i]);
dataOS.writeInt(edades[i]);

            }
dataOS.close();
}
}
