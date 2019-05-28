package parquediversiones;

import java.util.ArrayList;

public class Rueda {
    protected double precio;
    protected ArrayList <boolean[]> carritos;
    protected boolean[] asientos = new boolean[] {true, true};
    protected int ncarritos;
    
    
    public void meterAsientos(int personas, boolean[] asientos, ArrayList<boolean[]> carritos){
        for (int i = 0; i < personas; i++){
            carritos.add(asientos);
        }
    }
    
    /*if(carrito.get(12).getasientos[0]==false && carrito.get(12).getasientos[1]==false){
    throw new AtraccionLLenaException();
    */
    public void agregarPersonas(int personas, boolean[] asientos, ArrayList<boolean[]> carritos){
        try{
            int cantAsientos = carritos.size();
            for (int i = 0; i < carritos.size(); i++){
                for (int j = 0; j < 2; j++){
                    if(asientos[j] == true && personas == 1){
                        asientos[j] = false;
                    }else if(asientos[0] == true && asientos[1] == true && personas == 2){
                        asientos[0] = false;
                        asientos[1] = false;
                    }else if(asientos[0] == false && asientos[1] == true){
                        throw new ParejaNoJuntaExcepcion();
                    }else if(asientos[0]== false && asientos[1] ==false){
                        cantAsientos ++;
                    }
                }
            }
            if(cantAsientos == 12){
                throw new AtraccionLLenaExcepcion();
            }
        } catch(ParejaNoJuntaExcepcion | AtraccionLLenaExcepcion pnj){
            System.out.println(pnj.getMessage());
        }
    }
    
    public void mostrarCarritos(boolean[] asientos, ArrayList<boolean[]> carritos){
        for(int i=0; i<carritos.size();i++){
            for (int j = 0; j < 2; j++) {
                System.out.println("Vagon #" + i + "[" + asientos[0] + asientos[1]+ "]");
            }
            
        }
    }
}
