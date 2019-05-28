package parquediversiones;

public class AtraccionLLenaExcepcion extends Exception{
    public AtraccionLLenaExcepcion(){
        super("Atraccion llena, intente comprando en otra atraccion.");
    }
}
