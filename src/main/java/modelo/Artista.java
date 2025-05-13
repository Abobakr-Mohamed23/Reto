
package modelo;

import java.sql.Date;

public class Artista {

    private int idArtista;
    private String nombreCompleto;
    private String paisOrigen;
    private Date fechaNacimiento;
    private Compania_Discografica compania; 

    public Artista(int idArtista, String nombreCompleto, String paisOrigen, Date fechaNacimiento, Compania_Discografica compania) {
        this.idArtista = idArtista;
        this.nombreCompleto = nombreCompleto;
        this.paisOrigen = paisOrigen;
        this.fechaNacimiento = fechaNacimiento;
        this.compania = compania;
    }

    public Artista(String nombreCompleto, String paisOrigen, Date fechaNacimiento, Compania_Discografica compania) {
        this.nombreCompleto = nombreCompleto;
        this.paisOrigen = paisOrigen;
        this.fechaNacimiento = fechaNacimiento;
        this.compania = compania;
    }

    @Override
    public String toString() {
        return nombreCompleto;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Compania_Discografica getCompania() {
        return compania;
    }

    public void setCompania(Compania_Discografica compania) {
        this.compania = compania;
    }

  

    
}
