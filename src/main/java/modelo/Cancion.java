package modelo;

public class Cancion {

    private int idCancion;
    private String nombreCancion;
    private String fechaLanzamiento;
    private double duracion;
    private int idArtista;   // FK
    private int idCompania;  // FK

    public Cancion(int idCancion, String nombreCancion, String fechaLanzamiento, double duracion, int idArtista, int idCompania) {
        this.idCancion = idCancion;
        this.nombreCancion = nombreCancion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracion = duracion;
        this.idArtista = idArtista;
        this.idCompania = idCompania;
    }

    @Override
    public String toString() {
        return "Cancion{"
                + "idCancion=" + idCancion
                + ", nombreCancion='" + nombreCancion + '\''
                + ", fechaLanzamiento='" + fechaLanzamiento + '\''
                + ", duracion=" + duracion
                + ", idArtista=" + idArtista
                + ", idCompania=" + idCompania
                + '}';
    }

    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public int getIdCompania() {
        return idCompania;
    }

    public void setIdCompania(int idCompania) {
        this.idCompania = idCompania;
    }
}
