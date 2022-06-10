package TP_Final;

public class Silver extends Avion implements Servicios{

    private final static String nombre = "Silver";
    private final static int tarifaFija = 4000;

    public String tipoAvion;
    public String codigoAvion;

    public Silver() {
    }

    public Silver(String codigoAvion) {
        super.combustible_capacidad=3200;
        super.costoXkm=210;
        super.numero_pasajeros=10;
        super.velocidadMaxima=350;
        super.propulsion=Tipo_Motor.MOTOR_PISTONES;
        super.diaDeReserva=null;
        this.disponible = true;

        this.tipoAvion = nombre;
        this.codigoAvion = codigoAvion;

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
        System.out.println("Inclido");
    }

    @Override
    public void servicioDeWifi() {
        System.out.println("No Disponible");
    }
}
