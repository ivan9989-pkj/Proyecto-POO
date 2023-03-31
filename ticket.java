/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.poo1;

/**
 *Este se encarga de guardar los dartos del ticket.
 * @author 1daw
 */
public class ticket {
    
    
     private String nombreApellido;
    private double Montonporpagar;
    private double montonPorcuota;
    
    /**
     * 
     * @param nombreApellido el nombre y apellido del cliente
     * @param Montonporpagar  el dinero total que debe de pagar 
     * @param montondecuota  el dinero a pagar por cuota 
     */

    public ticket(String nombreApellido, double Montonporpagar, double montondecuota) {
        this.nombreApellido = nombreApellido;
        this.Montonporpagar = Montonporpagar;
        this.montonPorcuota = montondecuota;
    }

    @Override
    public String toString() {
        return "ticket{" + "nombreApellido=" + nombreApellido + ", Montonporpagar=" + Montonporpagar + ", montonPorcuota=" + montonPorcuota + '}';
    }
}
