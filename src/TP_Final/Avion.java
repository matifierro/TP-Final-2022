package TP_Final;


import java.util.Date;

public abstract class Avion {

    public int combustible_capacidad;
    public float costoXkm;
    public int numero_pasajeros;
    public int velocidadMaxima;
    public String propulsion;
    public Date diaDeReserva;

    public abstract void calcularCostoVuelo();


}
