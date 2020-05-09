package Ejercicio_1_UNO;

/**
 *
 * @author AA2020
 */
public class EmpleadoAsalariado extends Empleado{
    private double _salario;

    
    public EmpleadoAsalariado(double salario, String nombre, int edad, String DUI) {
        super(nombre, edad, DUI);
        this._salario = salario;
    }
    
    
    @Override
    public String SayHi(){
     return "Soy un empleado Asalariado y mi salario es de : $"+ this.GetSalario() + ". (Metodo de instancia redefinido)";
    }
    
    
    public static String SayHiStaticMethod(){
        return "Hola, soy un empleado asalariado. (Metodo de clase)";
    }
    
    
    public double GetSalario() {
        return _salario;
    }
    public void SetSalario(double salario) {
        this._salario = salario;
    }
}
