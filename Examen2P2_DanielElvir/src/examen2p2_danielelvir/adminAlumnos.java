/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_danielelvir;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class adminAlumnos {

    private ArrayList<Alumno> listaAlumnos = new ArrayList();
    private File archivo = null;

    public adminAlumnos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaPersonas) {
        this.listaAlumnos = listaPersonas;
    }

    @Override
    public String toString() {
        return "listaAlumno=" + listaAlumnos;
    }

    //extra mutador
    public void setAlumno(Alumno p) {
        this.listaAlumnos.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Alumno t : listaAlumnos) {
                /*bw.write(t.getCodigo() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getedad() + ";");*/
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        /*Scanner sc = null;
        Scanner sc2 = null;
        Scanner sc3 = null;
        Scanner sc4 = null;
        Scanner sc5 = null;*/
        File fcarros = null;
        FileReader fr = null;
        BufferedReader br = null;
        Scanner sc = null;
        listaAlumnos = new ArrayList();
        if (archivo.exists()) {
            try {
                String cadena;
                String nom;
                int cuenta;
                String id;
                String correo;
                int id_clase;
                String Clase;
                String campus;
                String tipo;
                String ciudad;
                String facultad;

                String linea;
                cadena = br.readLine();
                cadena = br.readLine();
                cadena = br.readLine();
                cadena = br.readLine();
                cadena = br.readLine();
                cadena = br.readLine();
                cadena = br.readLine();
                while ((linea = br.readLine()) != null) {
                    cadena = br.readLine();
                    String[] alumnos = cadena.split("|");
                    System.out.println(alumnos);
                    if (alumnos.length != 4) {
                        nom = alumnos[0].substring(0, alumnos[0].length());
                        String[] CuentayID = alumnos[1].split("&");
                        cuenta = Integer.parseInt(CuentayID[0]);
                        id = CuentayID[1];
                        correo = alumnos[2];
                        String[] tercera = alumnos[3].split("#");
                        String[] clases = tercera[0].split(",");
                        String[] infoCamp = tercera[1].split(";");
                        id_clase = Integer.parseInt(clases[0]);
                        Clase = clases[1];
                        campus = infoCamp[0];
                        tipo = infoCamp[1];
                        ciudad = infoCamp[2];
                        facultad = alumnos[4];
                        if (infoCamp[1].equalsIgnoreCase("ALUMNO")) {
                            Alumno x = new Alumno(nom, cuenta, id, correo, id_clase, Clase, campus, tipo, ciudad, facultad);
                            listaAlumnos.add(x);
                        }
                    }


                    /*mar = mar.trim();
                    mar = mar.substring(0, mar.length() - 1);
                    mod = br.readLine();
                    mod = mod.trim();
                    mod = mod.substring(0, mod.length() - 1);
                    anio = br.readLine();
                    anio = anio.trim();
                    anio = anio.substring(0, anio.length() - 1);
                    color = br.readLine();
                    color = color.trim();
                    color = color.substring(0, color.length() - 1);
                    precio = br.readLine();
                    precio = precio.trim();
                    precio = precio.substring(0, precio.length() - 1);
                    id = br.readLine();
                    id = id.trim();
                    id = id.substring(0, id.length() - 1);
                    temporal = br.readLine();
                    Alumno x = new Alumno(mar, mod, id, color, Integer.parseInt(anio), Double.parseDouble(precio));
                    tempAlumno.add(x);*/
                    //modelobox.addElement(x);
                }

                br.close();
                fr.close();
            } catch (Exception ex) {
            }

        }
    }
}
