/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmepps.sesion3;

/**
 *
 * @author clopq
 */

public class Movimiento {
    private double importe;
    public enum Signo{D,H};
    private final Signo signo;
    private String detalle;
    
    public Movimiento(double importe, Signo signo){
        this.importe = importe;
        this.signo = signo;
        this.detalle = (signo == Signo.D)?"Ingreso":"Reintegro";
    }
    
    public double getImporte() {
        return importe;
    }

    public Signo getSigno() {
        return signo;
    }

    public String getDetalle() {
        return detalle;
    }
    
}
