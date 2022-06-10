package TP_Final;


import java.util.Date;

public abstract class Avion {

    public static int cargoFijoPasajero= 3500;
    public int combustible_capacidad;
    public float costoXkm;
    public int numero_pasajeros;
    public int velocidadMaxima;
    public Tipo_Motor propulsion;
    public String [] diaDeReserva;
    public boolean disponible= true;

    public abstract void calcularCostoVuelo();


}
