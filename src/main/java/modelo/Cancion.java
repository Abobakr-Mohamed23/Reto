package modelo;

public class Cancion {

    int ID_Cancion;
    String Nombre_Cancion;
    String Fecha_Lanzamiento;
    Double Duracion;
    int ID_Artista;

    public Cancion(int ID_Cancion, String Nombre_Cancion, String Fecha_Lanzamiento, Double Duracion, int ID_Artista) {
        this.ID_Cancion = ID_Cancion;
        this.Nombre_Cancion = Nombre_Cancion;
        this.Fecha_Lanzamiento = Fecha_Lanzamiento;
        this.Duracion = Duracion;
        this.ID_Artista = ID_Artista;
    }

    @Override
    public String toString() {
        return "Cancion{" + "ID_Cancion=" + ID_Cancion + ", Nombre_Cancion=" + Nombre_Cancion + ", Fecha_Lanzamiento=" + Fecha_Lanzamiento + ", Duracion=" + Duracion + ", ID_Artista=" + ID_Artista + '}';
    }

    public int getID_Cancion() {
        return ID_Cancion;
    }

    public void setID_Cancion(int ID_Cancion) {
        this.ID_Cancion = ID_Cancion;
    }

    public String getNombre_Cancion() {
        return Nombre_Cancion;
    }

    public void setNombre_Cancion(String Nombre_Cancion) {
        this.Nombre_Cancion = Nombre_Cancion;
    }

    public String getFecha_Lanzamiento() {
        return Fecha_Lanzamiento;
    }

    public void setFecha_Lanzamiento(String Fecha_Lanzamiento) {
        this.Fecha_Lanzamiento = Fecha_Lanzamiento;
    }

    public Double getDuracion() {
        return Duracion;
    }

    public void setDuracion(Double Duracion) {
        this.Duracion = Duracion;
    }

    public int getID_Artista() {
        return ID_Artista;
    }

    public void setID_Artista(int ID_Artista) {
        this.ID_Artista = ID_Artista;
    }



  

   

}
