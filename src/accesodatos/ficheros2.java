/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author alumno
 */
public class ficheros2 {
    public static void main(String[] args) {
    //información fichero
System.out.println("INFORMACIÓN SOBRE EL FICHERO:");
//File f = new File("\\prueba\\FichData.txt");
     File f = new File("NUEVODIR/FICHERO3.TXT");
  try { 

     f.createNewFile();
   } catch (IOException ioe) {}  
  
if(f.exists()){

 System.out.println("Nombre del fichero: " +f.getName() );
 System.out.println("Ruta: "+f.getPath() );
 System.out.println("Ruta absoluta: "+f.getAbsolutePath() );
 System.out.println("Se puede esribir: "+f.canRead() );
 System.out.println("Se puede leer: "+f.canWrite() );
 System.out.println("Tamaño: "+f.length() );
 System.out.println("Es un fichero: "+f.isFile() );
 System.out.println("Es un directorio: "+f.isDirectory() );

}
    }
}