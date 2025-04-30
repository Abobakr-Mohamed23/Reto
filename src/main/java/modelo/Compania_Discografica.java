
package modelo;


import java.sql.Date;


public class Compania_Discografica {

    private int idCompania;
    private String nombreCompania;
    private String ubicacion;

    private Date anioFundacion; 

    public Compania_Discografica(int idCompania, String nombreCompania, String ubicacion, Date anioFundacion) {

        this.idCompania = idCompania;
        this.nombreCompania = nombreCompania;
        this.ubicacion = ubicacion;
        this.anioFundacion = anioFundacion;
    }


    public Compania_Discografica(String nombreCompania, String ubicacion, Date anioFundacion) {
        this.nombreCompania = nombreCompania;
        this.ubicacion = ubicacion;
        this.anioFundacion = anioFundacion;
    }

    @Override
    public String toString() {
        return "Compania_Discografica{"
                + "idCompania=" + idCompania
                + ", nombreCompania='" + nombreCompania + '\''
                + ", ubicacion='" + ubicacion + '\''
                + ", anioFundacion=" + anioFundacion

                + '}';
    }

    public int getIdCompania() {
        return idCompania;
    }

    public void setIdCompania(int idCompania) {
        this.idCompania = idCompania;
    }

    public String getNombreCompania() {
        return nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


    public Date getAnioFundacion() { 
        return anioFundacion;
    }

    public void setAnioFundacion(Date anioFundacion) { 

        this.anioFundacion = anioFundacion;
    }
}
