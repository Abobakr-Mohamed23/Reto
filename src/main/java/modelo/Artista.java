package modelo;

public class Artista {

    private int idArtista;
    private String nombreCompleto;
    private String paisOrigen;
    private String fechaNacimiento;
    private int idCompania; // FK: Compañía a la que pertenece

    public Artista(int idArtista, String nombreCompleto, String paisOrigen, String fechaNacimiento, int idCompania) {
        this.idArtista = idArtista;
        this.nombreCompleto = nombreCompleto;
        this.paisOrigen = paisOrigen;
        this.fechaNacimiento = fechaNacimiento;
        this.idCompania = idCompania;
    }

    @Override
    public String toString() {
        return "Artista{"
                + "idArtista=" + idArtista
                + ", nombreCompleto='" + nombreCompleto + '\''
                + ", paisOrigen='" + paisOrigen + '\''
                + ", fechaNacimiento='" + fechaNacimiento + '\''
                + ", idCompania=" + idCompania
                + '}';
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdCompania() {
        return idCompania;
    }

    public void setIdCompania(int idCompania) {
        this.idCompania = idCompania;
    }
}
