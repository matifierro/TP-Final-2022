package TP_Final;

public class Bronze extends Avion{

    private final static String nombre = "Bronze";
    private final static int tarifaFija = 3000;

    public String tipoAvion;
    public String codigoAvion;

    public Bronze() {
    }

    public Bronze(String codigoAvion) {

        super.combustible_capacidad=2000;
        super.costoXkm=150;
        super.numero_pasajeros=7;
        super.velocidadMaxima=268;
        super.propulsion=Tipo_Motor.MOTOR_HELICE;
        super.diaDeReserva=null;
        super.disponible = true;

        this.tipoAvion = nombre;
        this.codigoAvion = codigoAvion;

    }

    public static String getNombre() {
        return nombre;
    }

    public String getCodigoAvion() {
        return codigoAvion;
    }

    public void setCodigoAvion(String codigoAvion) {
        this.codigoAvion = codigoAvion;
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
    public void calcularCostoVuelo() {

    }

    @Override
    public String toString() {
        return
                "Tipo de Avion: " + tipoAvion + "\n" +
                "Capacidad de combustible: " + combustible_capacidad +"\n" +
                "Costo por km: " + costoXkm +"\n" +
                "Capacidad de pasajeros: " + numero_pasajeros +"\n"+
                "Velocidad Maxima: " + velocidadMaxima +"\n" +
                "Tipo de Propulsion: " + propulsion + "\n" +
                "Codigo Avion: " + codigoAvion +"\n" +
                '.';
    }
}
