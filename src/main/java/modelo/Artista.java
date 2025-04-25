package modelo;

public class Artista {

    int ID_Artista;
    String NombreCompleto;
    String Pais_Origen;
    String Fecha_Nacimiento;
    int ID_Compania;

    public Artista(int ID_Artista, String NombreCompleto, String Pais_Origen, String Fecha_Nacimiento, int ID_Compania) {
        this.ID_Artista = ID_Artista;
        this.NombreCompleto = NombreCompleto;
        this.Pais_Origen = Pais_Origen;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.ID_Compania = ID_Compania;
    }

    @Override
    public String toString() {
        return "Artista{" + "ID_Artista=" + ID_Artista + ", NombreCompleto=" + NombreCompleto + ", Pais_Origen=" + Pais_Origen + ", Fecha_Nacimiento=" + Fecha_Nacimiento + ", ID_Compania=" + ID_Compania + '}';
    }

    public int getID_Artista() {
        return ID_Artista;
    }

    public void setID_Artista(int ID_Artista) {
        this.ID_Artista = ID_Artista;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getPais_Origen() {
        return Pais_Origen;
    }

    public void setPais_Origen(String Pais_Origen) {
        this.Pais_Origen = Pais_Origen;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public int getID_Compania() {
        return ID_Compania;
    }

    public void setID_Compania(int ID_Compania) {
        this.ID_Compania = ID_Compania;
    }

   

}
