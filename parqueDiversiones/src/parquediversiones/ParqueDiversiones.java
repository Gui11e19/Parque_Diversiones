package parquediversiones;


import java.util.Scanner;

public class ParqueDiversiones {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){    
        boolean valido = true;
        boolean cont = true;
        
        while(cont){
            int opc;
            System.out.println("Bienvenido al parque de diversiones.  \r\n\t Que tipo de atraccion desea? \r\n\t 1. Gusanito \r\n\t 2. Chicago \r\n\t 3. Montania Rusa \r\n\t 0. Salir \r\n\t Elija una opcion:");
            opc=in.nextInt(); in.nextLine();
            
                switch(opc){
                    case 1:
                        gusanito();
                        break;
                    case 2:
                        chicago();
                        break;
                    case 3:
                        rusa();
                        break;
                    case 0:
                        cont=false;
                        break;
                }
        }
    }
    
    
    public static void gusanito(){
        
        Gusanito g= new Gusanito();
    
        boolean cont=true;
        
        while(cont){
          int opc;
          menu_atracciones();
          opc= in.nextInt(); in.nextLine();

           switch(opc){
                    case 1:
                        g.agregarPersonas(2, null, null);
                        break;
                    case 2:
                        g.mostrarAsientos(null, null);
                        break;
                    case 3:
                        g.mostrarGanancia(null, null);
                        break;
                    case 4:
                        Rueda rueda = new Rueda();
                        rueda.meterAsientos(5, null, null);
                        break;
                    case 0:
                        cont=false;
                        break;
                }
        }
        
    }
    
    public static void chicago(){

        Chicago c= new Chicago();
        
        boolean cont=true;
        
        while(cont){
            int opc;
            menu_atracciones();
            opc= in.nextInt(); in.nextLine();
      
            switch(opc){
                    case 1:
                        c.agregarPersonas(null, null);
                        
                        break;
                    case 2:
                        c.mostrarAsientos(null, null);
                        break;
                    case 3:
                        c.mostrarGanancia(null, null);
                        break;
                    case 0:
                        cont=false;
                        break;
                }
        }
    }
    
    public static void rusa(){
              
        Rusa r= new Rusa();
        
        boolean cont=true;
        
        while(cont){
        int opc;
            menu_atracciones();
            opc= in.nextInt(); in.nextLine();
            switch(opc){
                    case 1:
                        r.agregarPersonas(null, null);
                        break;
                    case 2:
                        r.mostrarAsientos(null, null);
                        break;
                    case 3:
                        r.mostrarGanancia(null, null);
                        break;
                    case 0:
                        cont=false;
                        break;
                }
        }
    }
    
    public static void menu_atracciones(){
        
        System.out.println("Acciones: \r\n\t 1. Agregar persona: \r\n\t 2. Mostrar asientos. \r\n\t 3. Mostrar ganancia de la empresa. \r\n\t 0.Regresar al menu principal. \r\n\t Ingrese opcion:" );
    
    }
}
