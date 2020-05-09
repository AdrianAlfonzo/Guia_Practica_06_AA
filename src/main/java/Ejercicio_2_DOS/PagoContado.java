package Ejercicio_2_DOS;

/**
 *
 * @author AA2020
 */
public class PagoContado extends Pago{
    public PagoContado(String nombre, String banco) {
        super(nombre, banco);
    }
    
    
    @Override
    public double pago(double monto){
       double sub;
       double total;
       sub = monto * 0.13;
       total = monto + sub;
       return total;   
    }
    
    
    public String MostrarMensaje(){
        return "Debe pagar al banco: $";
    }
}
