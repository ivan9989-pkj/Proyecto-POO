/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.poo1;

/**
 *Este apartado se encarga de todos los datos de la tarjetadecredito.
 * @author Ivan
 */
public class Tarjetadecredito {
     private String entidadBancaria;
    private String numero;
    private double saldo;
    private EntidadFinanciera entidadFinaciera;
    private Persona titular;
    
    /**
     * 
     * @param entidadBancaria es el banco 
     * @param numero   tu numero de tarjeta
     * @param saldo   El dinero que tienes dentro de ella 
     * @param titular el nombre de la persona a la que le pertenece 
     * @param entidadFinaciera  hace referencia a la clase entidad financiera
     */
    

    public Tarjetadecredito(String entidadBancaria, String numero, double saldo,Persona titular ,EntidadFinanciera entidadFinaciera) {
        this.entidadBancaria = entidadBancaria;
        this.numero = numero;
        this.saldo = saldo;
        this.entidadFinaciera = entidadFinaciera;
        this.titular = titular;
    }

    @Override
    
   
    public String toString() {
        return "Tarjetadecredito{" + "entidadBancaria=" + entidadBancaria + ", numero=" + numero + ", saldo=" + saldo + ", entidadFinaciera=" + entidadFinaciera + ", titular=" + titular + '}';
    }

    /**
     * 
     * @param montoFinal
     * @return 
     */
    public boolean tieneSaldoDisponible(double montoFinal) {
       return saldo>=montoFinal;
       
      
        
    }
/**
 * 
 * @param monto 
 */
     public void descontar(double monto) {
       saldo=saldo-monto;
    }
/**
 * 
 * @return el nombre del titular 
 */
    public String nombreCompletoDelTitular() {
      return titular.nombreCompleto();
    }
    
}
