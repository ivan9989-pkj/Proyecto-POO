/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto.poo1;

/**
 * Ejercicio de integración POO
 * @author Ivan
 */
public class ProyectoPOO1 {

    
        public static void main(String[] args) {
        /**
        *Nos generara todo los datos 
        * @author Ivan Santana
        */
        
        posnet posnet=new posnet();
        
        Persona p= new Persona("45231478T","Ivan","Gomez","8541478","santanaquitanai@gmail.com");
        Tarjetadecredito t=new Tarjetadecredito("FakeBank","1222222",15000,p, EntidadFinanciera.BIRZA);
        System.out.println("Tarjeta antes del pago...");
        System.out.println(t);
        
       ticket ticketgenerado=posnet.efectuarPago(t,10000,5);
       System.out.println("Ticket generado...");
       System.out.print(ticketgenerado);
       
       System.out.println("Tarjeta después del pago...");
       System.out.println(t);
       
    }
    
}
