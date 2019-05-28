/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parquediversiones;

import java.util.ArrayList;

/**
 *
 * @author Guille
 */
public class Rusa extends Chicago{
    
    public Rusa(){        
        super();
    }
    
    public Rusa(double precioR, int carritosR, int personas) {
    super();
    this.precio=precioR;
    precioR=5.00;
    carritosR=24;
    this.personas=personas;
    this.asientos=new ArrayList<>(2);
    this.carritos=new ArrayList<>(24);
    }
   
    
    @Override
    public void agregarPersonas(ArrayList <Integer> carritos, ArrayList <Boolean> asientos){
        
        
    }
    
    @Override
     public void mostrarAsientos(ArrayList <Integer> carritos, ArrayList <Boolean> asientos){
        
        
    }
     
     @Override
     public void mostrarGanancia(ArrayList <Integer> carritos, ArrayList <Boolean> asientos){
        
        
    }
    
}
