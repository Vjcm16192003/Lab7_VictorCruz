
package lab7_victorcruz;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Victor Jafet Cruz
 */
public class AdminNave  {
    private ArrayList<Nave> listaNave = new ArrayList();
    private File archivo = null;
    
    public AdminNave(String path) {
        archivo = new File(path);
    }

    public ArrayList<Nave> getListaNave() {
        return listaNave;
    }

    public void setListaNave(ArrayList<Nave> listaNave) {
        this.listaNave= listaNave;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    //extra mutador
    public void setNave(Nave p) {
        this.listaNave.add(p);
    }
    
    public void cargarArchivo() {
        try {            
            listaNave = new ArrayList();
            Nave temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Nave) objeto.readObject()) != null) {
                        listaNave.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Nave t : listaNave) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
