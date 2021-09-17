
package domain;

import java.util.Date;

public class Cliente extends Persona{


    
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip = false;
    private static int contadorCliente;

    public Cliente(boolean vip,Date fechaRegistro, String nombre, char genero, int edad, String direccion) {
        super(nombre,genero,edad,direccion);
        this.vip = vip;
        this.idCliente = ++contadorCliente;
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

        public static int getContadorCliente() {
        return contadorCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip +", Nombre"+super.toString()+ '}';
    }
    
}
