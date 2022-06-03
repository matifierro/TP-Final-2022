package TP_Final;

public class Bronze extends Avion{

    private final static String nombre = "Bronze";

    public String tipoAvion;
    public String codigoAvion;

    public Bronze() {
    }

    public Bronze(String codigoAvion) {

        super.combustible_capacidad=0;
        super.costoXkm=0;
        super.numero_pasajeros=0;
        super.velocidadMaxima=0;
        super.propulsion=null;
        super.diaDeReserva=null;

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

    @Override
    public void calcularCostoVuelo() {

    }
}
