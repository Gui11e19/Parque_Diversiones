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
public class Gusanito {
    protected double precio;
    protected int personas;
    protected ArrayList <Integer> carritos;
    protected ArrayList <Boolean> asientos;
    

    public Gusanito(){
        
    }
    
    public Gusanito(double precio, int personas) {
        this.precio = precio;
        this.personas = personas;
        precio=3.00;
        carritos = new ArrayList<>();
        asientos = new ArrayList<>();
    }
    
    public void agregarPersonas(ArrayList <Integer> carritos, ArrayList <Boolean> asientos){
        carritos= new ArrayList <> (12);
        asientos= new ArrayList <> (2);
        for (int i = 0; i < carritos.size(); i++) {
                carritos.get(i);
                System.out.println("Vagon #" + (i+1));
            for (int j = 0; j < asientos.size(); j++) {
                asientos.set(i, Boolean.TRUE);
            }
        }
        
    }
    
        public void mostrarAsientos(ArrayList <Integer> carritos, ArrayList <Boolean> asientos){
          for (int i = 0; i < carritos.size(); i++) {
                carritos.get(i);
                System.out.println("Vagon #" + (i+1));
            for (int j = 0; j < asientos.size(); j++) {
               asientos.get(i);
            }
        }
        
    }
        
       public void mostrarGanancia(ArrayList <Integer> carritos, ArrayList <Boolean> asientos){
        
        
    }
    
    
}
