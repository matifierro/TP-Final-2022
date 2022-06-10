package TP_Final;

import java.util.ArrayList;
import java.util.List;

public class Usuario {


    private static int id=0;

    public int idUsuario;
    public String nombre;
    public String apellido;
    public String dni;
    public String password;
    public int edad;
    public boolean logueado=false;
    public List<Reservas> listaDeViajes;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String dni, int edad, String Password) { //crea pass automatico
        this.idUsuario = generarNuevoId();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.password = Password;
        this.edad = edad;
        this.logueado=false;
    }

    public Usuario(String nombre, String apellido, String dni, String password, int edad) {
        this.idUsuario = generarNuevoId();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.password = password;
        this.edad = edad;
        this.logueado=false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isLogueado() {
        return logueado;
    }

    public void setLogueado(boolean logueado) {
        this.logueado = logueado;
    }

    private int generarNuevoId(){
        return ++id;
    }

   /* private StringBuilder generar_password(){

        int longitud = 8;  //crea un password de tamaño 8 caracteres
        String AlphaNumerico = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder new_pass = new StringBuilder(longitud);  //se crea la variable y se le da una longitud

        for (int i = 0; i < longitud; i++) {
            int index = (int)(AlphaNumerico.length() * Math.random());
            new_pass.append(AlphaNumerico.charAt(index));
        }
        return new_pass;
    }*/

    @Override
    public String toString() {
        return
                "Id Usuario: " + idUsuario + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "DNI: " + dni + "\n" +
                "Edad: " + edad +
                '.';
    }
}
