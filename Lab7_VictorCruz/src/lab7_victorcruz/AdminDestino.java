/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class AdminDestino {
    private ArrayList<Destino> listaDestino = new ArrayList();
    private File archivo = null;
    
    public AdminDestino(String path) {
        archivo = new File(path);
    }

    public ArrayList<Destino> getListaDestino() {
        return listaDestino;
    }

    public void setListaDestino(ArrayList<Destino> listaDestino) {
        this.listaDestino= listaDestino;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    //extra mutador
    public void setDestino(Destino p) {
        this.listaDestino.add(p);
    }
    
    public void cargarArchivo() {
        try {            
            listaDestino = new ArrayList();
            Destino temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Destino) objeto.readObject()) != null) {
                        listaDestino.add(temp);
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
            for (Destino t : listaDestino) {
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
