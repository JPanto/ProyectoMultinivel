/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Conexion {

    public static String alquilerDocName = "Alquiler";
    public static String clientDocName = "Cliente";
    public static String machineDocName = "Maquina";

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

    public String leerArchivo(String nombre) throws FileNotFoundException, IOException {
        String linea, acum = "";
        this.leer = new FileReader(nombre + ".txt");
        this.canal = new BufferedReader(leer);
        linea = this.canal.readLine();
        while (linea != null) {
            acum += linea + "\n";
            linea = this.canal.readLine();
        }

        canal.close();
        return acum;
    }

    public void escribirArchivo(String acum, String nombre) throws IOException {
        this.escribir = new FileWriter(nombre + ".txt", true);
        PrintWriter canalE = new PrintWriter(escribir);
        canalE.println(acum);
        canalE.close();
    }

    public ArrayList<Persona> getClientsArray() {
        String clients[] = null;
        ArrayList<Persona> clientes = new ArrayList<Persona>();
        try {
            clients = this.leerArchivo(clientDocName).split("\n");
            for (String acum : clients) {
                String datos[] = acum.split(";");
                clientes.add(new Persona(datos[0], datos[1], datos[2]));
            }
        } catch (IOException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(" *** Error al Cargar *** ");
        }
        return clientes;
    }

    public ArrayList<Pesada> getPesadaMachineArray() {
        String machine[];
        ArrayList<Pesada> machines = new ArrayList();
        try {
            machine = this.leerArchivo(machineDocName).split("\n");
            for (String acum : machine) {
                String datos[] = acum.split(";");
                if (acum.contains("Pesada")) {
                   machines.add(new Pesada(datos[0], datos[1], datos[2], Integer.parseInt(datos[3])));
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(" *** Error al Cargar *** ");
        }
        return machines;
    }
    
     public ArrayList<General> getGeneralMachineArray() {
        String clients[];
        ArrayList<General> machines = new ArrayList();
        try {
            clients = this.leerArchivo(machineDocName).split("\n");
            for (String acum : clients) {
                String datos[] = acum.split(";");
                if (acum.contains("General")) {
                 machines.add(new General(datos[0], datos[1], datos[2], Integer.parseInt(datos[3])));
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(" *** Error al Cargar *** ");
        }
        return machines;
    }
    
    public void escribirArchivo(General temp, String machineDocName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
