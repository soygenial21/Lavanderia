package upc.com.lavanderiaproyec.Objects;

/**
 * Created by julieta on 02/12/2017.
 */

public class Reserva {

    String DATOS, nameRV, apeRV, direRV;

    public String getDATOS() {
        return DATOS;
    }

    public void setDATOS(String DATOS) {
        this.DATOS = DATOS;
    }

    public String getNameRV() {
        return nameRV;
    }

    public void setNameRV(String nameRV) {
        this.nameRV = nameRV;
    }

    public String getApeRV() {
        return apeRV;
    }

    public void setApeRV(String apeRV) {
        this.apeRV = apeRV;
    }

    public String getDireRV() {
        return direRV;
    }

    public void setDireRV(String direRV) {
        this.direRV = direRV;
    }

    public Reserva(String DATOS, String nameRV, String apeRV, String direRV){
        this.DATOS = DATOS;
        this.nameRV = nameRV;
        this.apeRV = apeRV;
        this.direRV= direRV;




    }

}
