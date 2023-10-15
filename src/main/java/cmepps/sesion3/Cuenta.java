/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmepps.sesion3;

import java.util.List;

/**
 *
 * @author clopq
 */
public class Cuenta {
    private String numero;
    private String titular;
    List <Movimiento> mMovimientos;
    private double saldo;
    
    public Cuenta(double saldo){
        super();
        this.saldo=saldo;
    }

    public void ingresar(double cantidad) {
        this.saldo = this.saldo + cantidad;
    }

    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void retirar(double cantidad){
        this.saldo = this.saldo - cantidad;
    }
    
}
