/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.poo1;

/**
 *Este apartado es el quese encargara de generar el ticket del pago con la tarjetadecredito
 * @author Ivan
 */
public class posnet {
    
    
    
    public static final double RECARGO_POR_CUOTA=0.03;
    
    
    public static final int MIN_CANT_CUOTAS=1;
   
    public static final int MAX_CANT_CUOTAS=12;
    
    /**
     * 
     * @param tarjeta  hace referencia a los datos de la clase tarjetadecredito
     * @param montoAbonar es la cantidad de dinero que hay que pagar
     * @param cantCuotas  es la cantidad de cuotas que vas a  realizar 
     * @return 
     */
    
    /*
    *Crea una instancia donde efectura a la creacion del ticket
    */
       public ticket efectuarPago(Tarjetadecredito tarjeta, double montoAbonar , int cantCuotas){
          
           /*
           *Se encarga de crear el ticket mediante varios datos.
           * @author Ivan
           *
           */
            ticket ticket=null;
            if(datosValidos(tarjeta, montoAbonar , cantCuotas)){
                double montoFinal=montoAbonar+montoAbonar*recargoSegunCuotas(cantCuotas);
                if (tarjeta.tieneSaldoDisponible(montoFinal)){
                    tarjeta.descontar(montoFinal);
                    String nomApe=tarjeta.nombreCompletoDelTitular();
                    double montoPorCuota=montoFinal/cantCuotas;
                    ticket=new ticket(nomApe,montoFinal,montoPorCuota);
                    
                }
                
            
            }
           return ticket;
       }
       /**
        * 
        * @param tarjeta  hace referencia a los datos de la clase tarjetadecredito
        * @param monto es el dinero que se va a pagar
        * @param cant hace referencia la cantidad de cuotas .
        * @return 
        */
       
       private boolean datosValidos(Tarjetadecredito tarjeta , double monto , int cant){
           /**
            *
            * @author Ivan Santana
            * @return devolvera un boolean true si la tarjeta es valida
            * @return devolvera un boolean true si el monto es valido
            * @return devolvera un boolean true si cantidad de cuotas esta entre validas
            * 
            */
           boolean esTarjetaValida=tarjeta != null;
           boolean esMontoValido = monto>0;
           boolean cantCuotaValida= cant>=MIN_CANT_CUOTAS && cant<=MAX_CANT_CUOTAS;
           return esTarjetaValida&&esMontoValido&&cantCuotaValida;
       }
       
       /**
        * 
        * @param cantCuotas Es la cantidad de coutas que vas a introducir 
        * @return 
        */
       
       private double recargoSegunCuotas(int cantCuotas){
           return (cantCuotas-1)* RECARGO_POR_CUOTA;
           
           /**
            * @return nos devolvera la cantidad de dinero a pagar por cuota dependiendo de cuantas haya 
            */
           
       }
}
