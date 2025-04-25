package modelo;

public class Compania_Discografica {

int ID_Compania;
String Nombre_Compania;
String Ubicacion;
String Anio_Fundacion;

    public Compania_Discografica(int ID_Compania, String Nombre_Compania, String Ubicacion, String Anio_Fundacion) {
        this.ID_Compania = ID_Compania;
        this.Nombre_Compania = Nombre_Compania;
        this.Ubicacion = Ubicacion;
        this.Anio_Fundacion = Anio_Fundacion;
    }

    @Override
    public String toString() {
        return "Compania_Discografica{" + "ID_Compania=" + ID_Compania + ", Nombre_Compania=" + Nombre_Compania + ", Ubicacion=" + Ubicacion + ", Anio_Fundacion=" + Anio_Fundacion + '}';
    }

    public int getID_Compania() {
        return ID_Compania;
    }

    public void setID_Compania(int ID_Compania) {
        this.ID_Compania = ID_Compania;
    }

    public String getNombre_Compania() {
        return Nombre_Compania;
    }

    public void setNombre_Compania(String Nombre_Compania) {
        this.Nombre_Compania = Nombre_Compania;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getAnio_Fundacion() {
        return Anio_Fundacion;
    }

    public void setAnio_Fundacion(String Anio_Fundacion) {
        this.Anio_Fundacion = Anio_Fundacion;
    }

    
    
}
