
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

import java.sql.Date;

public class Artista {

    private int idArtista;
    private String nombreCompleto;
    private String paisOrigen;
    private Date fechaNacimiento;
    private Compania_Discografica Compania; // FK: Compañía a la que pertenece

    public Artista(int idArtista, String nombreCompleto, String paisOrigen, Date fechaNacimiento, Compania_Discografica Compania) {
        this.idArtista = idArtista;
        this.nombreCompleto = nombreCompleto;
        this.paisOrigen = paisOrigen;
        this.fechaNacimiento = fechaNacimiento;
        this.Compania = Compania;
    }
    
    public Artista( String nombreCompleto, String paisOrigen, Date fechaNacimiento, Compania_Discografica Compania) {
        this.nombreCompleto = nombreCompleto;
        this.paisOrigen = paisOrigen;
        this.fechaNacimiento = fechaNacimiento;
        this.Compania = Compania;
    }

    @Override
    public String toString() {
        return "Artista{"
                + "idArtista=" + idArtista
                + ", nombreCompleto='" + nombreCompleto + '\''
                + ", paisOrigen='" + paisOrigen + '\''
                + ", fechaNacimiento='" + fechaNacimiento + '\''
                + ", idCompania=" + Compania
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Compania_Discografica getCompania() {
        return Compania;
    }

    public void setCompania(Compania_Discografica idCompania) {
        this.Compania = idCompania;
    }
}

