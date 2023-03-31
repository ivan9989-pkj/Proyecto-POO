/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.poo1;

/**
 *El apartado que guardara los datos de la persona
 * @author Ivan
 */
public class Persona {
    
  
    
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;
    
    /**
     * 
     * @param dni es el dni de la persona
     * @param nombre es el nombre de la persona
     * @param apellido  es el apellido de la persona
     * @param telefono es el telefono de la persona
     * @param mail es el mail de la persona
     */
    public Persona(String dni, String nombre, String apellido, String telefono, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }
    
      
     /**
      * 
      * @return nombreCompleto de la persona
      */
    public String nombreCompleto() {
      return nombre+" "+apellido;
     
    
    }
    
}
