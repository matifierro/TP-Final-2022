package TP_Final;

import java.util.Date;

public class Gold extends Avion implements Servicios{

     private final static String nombre = "Gold";
     private final static int tarifaFija = 6000;

     public String tipoAvion;
     public boolean catering = false;
     public boolean wifi = true;
     public String codigoAvion;

    public Gold() {
    }


    public Gold(boolean catering, boolean wifi, String codigoAvion) {

        super.combustible_capacidad=4000;
        super.costoXkm=300;
        super.numero_pasajeros=15;
        super.velocidadMaxima=475;
        super.propulsion=Tipo_Motor.REACCION;
        super.diaDeReserva=null;
        this.disponible = true;

        this.tipoAvion = nombre;
        this.catering = catering;
        this.wifi = wifi;
        this.codigoAvion = codigoAvion;
    }


    public boolean isCatering() {
        return catering;
    }

    public void setCatering(boolean catering) {
        this.catering = catering;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public String getCodigoAvion() {
        return codigoAvion;
    }

    public void setCodigoAvion(String codigoAvion) {
        this.codigoAvion = codigoAvion;
    }

    public static String getNombre() {
        return nombre;
    }

    public static int getTarifaFija() {
        return tarifaFija;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    @Override
    public String toString() {
        return
                "Tipo de Avion: " + tipoAvion + "\n" +
                "Catering: " + catering +"\n" +
                "Wifi: " + wifi +"\n" +
                "Capacidad de combustible: " + combustible_capacidad +"\n" +
                "Costo por km: " + costoXkm +"\n" +
                "Capacidad de pasajeros: " + numero_pasajeros +"\n"+
                "Velocidad Maxima: " + velocidadMaxima +"\n" +
                "Tipo de Propulsion: " + propulsion + "\n" +
                "Codigo Avion: " + codigoAvion +"\n" +
                '.';
    }

    @Override
    public void calcularCostoVuelo() {

    }

    @Override
    public void servicioDeCatering() {
        System.out.println("Disponible");
    }

    @Override
    public void servicioDeWifi() {
        System.out.println("Disponible");
    }
}
