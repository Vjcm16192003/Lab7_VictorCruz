
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
public class AdminAstronauta {
    private ArrayList<Astronautas> listaAstronautas = new ArrayList();
    private File archivo = null;
    
    public AdminAstronauta(String path) {
        archivo = new File(path);
    }

    public ArrayList<Astronautas> getListaAstronautas() {
        return listaAstronautas;
    }

    public void setListaAstronautas(ArrayList<Astronautas> listaAstronautas) {
        this.listaAstronautas= listaAstronautas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    //extra mutador
    public void setAstronautas(Astronautas p) {
        this.listaAstronautas.add(p);
    }
    
    public void cargarArchivo() {
        try {            
            listaAstronautas = new ArrayList();
            Astronautas temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Astronautas) objeto.readObject()) != null) {
                        listaAstronautas.add(temp);
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
            for (Astronautas t : listaAstronautas) {
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
