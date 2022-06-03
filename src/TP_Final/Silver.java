package TP_Final;

public class Silver extends Avion{

    private final static String nombre = "Silver";

    public String tipoAvion;
    public boolean catering = false;
    public String codigoAvion;

    public Silver() {
    }

    public Silver(boolean catering, String codigoAvion) {
        super.combustible_capacidad=0;
        super.costoXkm=0;
        super.numero_pasajeros=0;
        super.velocidadMaxima=0;
        super.propulsion=null;
        super.diaDeReserva=null;

        this.tipoAvion = nombre;
        this.catering = catering;
        this.codigoAvion = codigoAvion;
    }

    public boolean isCatering() {
        return catering;
    }

    public void setCatering(boolean catering) {
        this.catering = catering;
    }

    public String getCodigoAvion() {
        return codigoAvion;
    }

    public void setCodigoAvion(String codigoAvion) {
        this.codigoAvion = codigoAvion;
    }

    @Override
    public String toString() {
        return
                "Tipo de Avion: " + tipoAvion + "\n" +
                        "Catering: " + catering +"\n" +
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
}
