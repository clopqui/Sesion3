/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmepps.sesion3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author clopq
 */
public class Cuenta {
    private String numero;
    private String titular;
    List <Movimiento> mMovimientos = new ArrayList<>();
    private double saldo;
    public Cuenta(double saldo){
        super();
        this.saldo=saldo;
        mMovimientos.add(new Movimiento(saldo,Movimiento.Signo.D));
    }

    public void ingresar(double cantidad) {
        this.saldo = this.saldo + cantidad;
        mMovimientos.add(new Movimiento(cantidad,Movimiento.Signo.D));
    }

    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void retirar(double cantidad){
        double operacion = this.saldo - cantidad;
        if(operacion > 0){
            this.saldo = operacion;
            mMovimientos.add(new Movimiento(cantidad,Movimiento.Signo.H));
        }
    }
    
}
