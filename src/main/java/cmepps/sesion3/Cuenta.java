/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmepps.sesion3;

/**
 *
 * @author clopq
 */
public class Cuenta {
    
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
