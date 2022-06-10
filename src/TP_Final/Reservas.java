package TP_Final;

import java.time.LocalDate;
import java.util.Date;

public class Reservas {

    public Usuario user;
    public String origen;
    public String destino;
    public String codigoAvion;
    public LocalDate fechaIda;
    public LocalDate fechaVuelta;
    public int cantidadPasajeros;
    public int costoVuelo;

    public Reservas() {
    }

    //constructor ida y vuelta
    public Reservas(Usuario user, String origen, String destino, String codigoAvion, LocalDate fechaIda, LocalDate fechaVuelta,int cantidadPasajeros) {
        this.user = user;
        this.origen = origen;
        this.destino = destino;
        this.codigoAvion = codigoAvion;
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
        this.cantidadPasajeros = cantidadPasajeros;
        this.costoVuelo = calcularCostoVuelo();
    }
    //constructor solo ida
    public Reservas(Usuario user, String origen, String destino, String codigoAvion, LocalDate fechaIda, int cantidadPasajeros) {
        this.user = user;
        this.origen = origen;
        this.destino = destino;
        this.codigoAvion = codigoAvion;
        this.fechaIda = fechaIda;
        this.cantidadPasajeros = cantidadPasajeros;
        this.costoVuelo = calcularCostoVuelo();
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCodigoAvion() {
        return codigoAvion;
    }

    public void setCodigoAvion(String codigoAvion) {
        this.codigoAvion = codigoAvion;
    }

    public LocalDate getFechaIda() {
        return fechaIda;
    }

    public void setFechaIda(LocalDate fechaIda) {
        this.fechaIda = fechaIda;
    }

    public LocalDate getFechaVuelta() {
        return fechaVuelta;
    }

    public void setFechaVuelta(LocalDate fechaVuelta) {
        this.fechaVuelta = fechaVuelta;
    }

    public int calcularCostoVuelo(){
        int i=0;

        return i;
    };

    @Override
    public String toString() {
        return "Reserva Confirmada: "+"\n" +
                "Usuario: " + user +"\n" +
                "Ciudad Origen:" + origen +"\n" +
                "Ciudad Destino:" + destino +"\n" +
                "Cantidad de pasajeros :" + cantidadPasajeros +"\n" +
                "Avion:" + codigoAvion +"\n" +
                "Fecha de ida: " + fechaIda +"\n" +

               // (DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n"+
                "FechaVuelta: " + fechaVuelta+ "\n"+
                "Costo del vuelo: " + costoVuelo;

    }
}
