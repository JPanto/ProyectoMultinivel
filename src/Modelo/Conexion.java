/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.*;

/**
 *
 * @author Estudiante
 */
public class Conexion {
    
    private FileReader leer;
    private FileWriter escribir;
    private BufferedReader canal;

    public Conexion() {
        this.leer = null;
        this.escribir = null;
        this.canal = null;
    }
    
    public Conexion(FileReader leer, FileWriter escribir, BufferedReader canal) {
        this.leer = leer;
        this.escribir = escribir;
        this.canal = canal;
    }
    
    public String leerArchivo(String nombre)  throws FileNotFoundException, IOException{    
        String linea, acum = "";
        this.leer = new FileReader(nombre + ".txt");
        this.canal = new BufferedReader(leer);
        linea = this.canal.readLine();
        while (linea != null){
            acum += linea + "\n";
            linea = this.canal.readLine(); 
        }
        
        canal.close();
        return acum;
    }
    
    public void escribirArchivo(String acum, String nombre) throws IOException{
        this.escribir = new FileWriter( nombre + ".txt", true);
        PrintWriter canalE = new PrintWriter(escribir); 
        canalE.println(acum);
        canalE.close();
    } 
    
}
