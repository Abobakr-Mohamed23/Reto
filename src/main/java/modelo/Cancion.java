package modelo;

import java.sql.Date;

public class Cancion {

    private int idCancion;
    private String nombreCancion;
    private Date fechaLanzamiento;
    private double duracion;
    private Artista Artista;   
    

    public Cancion(int idCancion, String nombreCancion, Date fechaLanzamiento, double duracion, Artista idArtista) {
        this.idCancion = idCancion;
        this.nombreCancion = nombreCancion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracion = duracion;
        this.Artista = idArtista;
       
    }
    
     public Cancion( String nombreCancion, Date fechaLanzamiento, double duracion, Artista idArtista) {
        
        this.nombreCancion = nombreCancion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracion = duracion;
        this.Artista = idArtista;
       
    }

    @Override
    public String toString() {
        return "Cancion{"
                + "idCancion=" + idCancion
                + ", nombreCancion='" + nombreCancion + '\''
                + ", fechaLanzamiento='" + fechaLanzamiento + '\''
                + ", duracion=" + duracion
                + ", idArtista=" + Artista               
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

    public Artista getIdArtista() {
        return Artista;
    }

    public void setIdArtista(Artista idArtista) {
        this.Artista = idArtista;
    }
}
