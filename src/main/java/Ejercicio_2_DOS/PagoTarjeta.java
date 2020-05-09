package Ejercicio_2_DOS;
import javax.swing.JOptionPane;

/**
 *
 * @author AA2020
 */
public class PagoTarjeta extends Pago{
    private String _numeroTarjeta;
    private double _montoTarjeta = 2000;

    
    public PagoTarjeta(String nTarjeta, String nombre, String banco) {
        super(nombre, banco);
        this._numeroTarjeta = nTarjeta;
    }

    
    @Override
    public double pago(double monto){
       double sub;
       double total;
       sub = monto * 0.13;
       total = monto + sub;
        this._montoTarjeta = _montoTarjeta - monto;
        if (this._montoTarjeta <= 0) {
            JOptionPane.showMessageDialog(null, "¡Lo siento, se ha quedado sin fondos!");
        }
       return total;
    }
    
    
    public String MostrarMensaje(){
        return "Debe pagar al banco: $";
    }

    
    public String GetNumeroTarjeta() {
        return _numeroTarjeta;
    }
    public void SetNumeroTarjeta(String nTarjeta) {
        this._numeroTarjeta = nTarjeta;
    }
}
