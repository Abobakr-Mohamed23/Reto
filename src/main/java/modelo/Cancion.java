package modelo;

import java.sql.Date;
import java.sql.SQLException;

public class Cancion {

    private int idCancion;
    private String nombreCancion;
    private Date fechaLanzamiento;
    private double duracion;
    private Artista artista;

    public Cancion(int idCancion, String nombreCancion, Date fechaLanzamiento, double duracion, Artista artista) {
        this.idCancion = idCancion;
        this.nombreCancion = nombreCancion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracion = duracion;
        this.artista = artista;

    }

    public Cancion(String nombreCancion, Date fechaLanzamiento, double duracion, Artista artista) {

        this.nombreCancion = nombreCancion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracion = duracion;
        this.artista = artista;

    }

    public Cancion(String nombreCancion, Date fechaLanzamiento, double duracion, int artista) throws ClassNotFoundException, SQLException {

        Artista artistAux = acceso.AccesoArtista.consultar(artista);
        this.nombreCancion = nombreCancion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracion = duracion;
        this.artista = artistAux;

    }

    @Override
    public String toString() {
        return "Cancion{"
                + "idCancion=" + idCancion
                + ", nombreCancion='" + nombreCancion + '\''
                + ", fechaLanzamiento='" + fechaLanzamiento + '\''
                + ", duracion=" + duracion
                + ", idArtista=" + artista
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

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setIdArtista(Artista artista) {
        this.artista = artista;
    }
}
