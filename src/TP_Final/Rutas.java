package TP_Final;

public class Rutas  {

    private Ciudades origen;
    private Ciudades destino;
    private int distancia;

    public Rutas() {
    }

    public Rutas(Ciudades origen, Ciudades destino, int distancia) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return
                "Origen: " + origen +
                ", Destino: " + destino +
                ", Distancia: " + distancia +
                "Km.";
    }
}
