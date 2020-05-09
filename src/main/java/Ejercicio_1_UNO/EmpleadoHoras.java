package Ejercicio_1_UNO;

/**
 *
 * @author WIN10
 */
public class EmpleadoHoras extends Empleado{
    private int _horas;

    
    public EmpleadoHoras(int horas, String nombre, int edad, String DUI) {
        super(nombre, edad, DUI);
        this._horas = horas;
    }
    
    
    @Override
    public String SayHi(){
        return "Soy un empleado por horas y he trabado : " + this.GetHoras()+ " horas en esta empresa. (Metodo de instancia redefinido)";
    }
    
    
    public static String SayHiStaticMethod(){
        return "Soy un empleado por horas. (Metodo de clase)";
    }

    
    public int GetHoras() {
        return _horas;
    }
    public void SetHoras(int horas) {
        this._horas = horas;
    }
}
