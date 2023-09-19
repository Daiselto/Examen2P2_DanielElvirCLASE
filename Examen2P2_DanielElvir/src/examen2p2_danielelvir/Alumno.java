/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_danielelvir;

/**
 *
 * @author HP
 */
public class Alumno {
    private String Nombre;
    private int Cuenta;
    private String DNI;
    private String Correo;
    private int ID_Clase;
    private String Clase;
    private String Campus;
    private String Tipo;
    private String Ciudad;
    private String Facultad;

    public Alumno() {
    }

    public Alumno(String Nombre, int Cuenta, String DNI, String Correo, int ID_Clase, String Clase, String Campus, String Tipo, String Ciudad, String Facultad) {
        this.Nombre = Nombre;
        this.Cuenta = Cuenta;
        this.DNI = DNI;
        this.Correo = Correo;
        this.ID_Clase = ID_Clase;
        this.Clase = Clase;
        this.Campus = Campus;
        this.Tipo = Tipo;
        this.Ciudad = Ciudad;
        this.Facultad = Facultad;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCuenta() {
        return Cuenta;
    }

    public void setCuenta(int Cuenta) {
        this.Cuenta = Cuenta;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getID_Clase() {
        return ID_Clase;
    }

    public void setID_Clase(int ID_Clase) {
        this.ID_Clase = ID_Clase;
    }

    public String getCampus() {
        return Campus;
    }

    public void setCampus(String Campus) {
        this.Campus = Campus;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
