package Ejercicio_1_UNO;

/**
 *
 * @author AA2020
 */
public class EmpleadoComision extends Empleado{
    private double _cantidadVentas;

    
    public EmpleadoComision(double cantidadVentas, String nombre, int edad, String DUI) {
        super(nombre, edad, DUI);
        this._cantidadVentas = cantidadVentas;
    }
    
    
    @Override
    public String SayHi(){
      return "Soy un empleado por comisión y mi número de ventas hechas es : "+ this.GetCantidadVentas()+ ". (Metodo de instancia redefinido)";
    }
    
    
    public static String SayHiStaticMethod(){
        return "Soy un empleado por comisión. (Metodo de clase)";
    }

    
    public double GetCantidadVentas() {
        return _cantidadVentas;
    }
    public void SetCantidadVentas(double cantidadVentas) {
        this._cantidadVentas = cantidadVentas;
    }
}
