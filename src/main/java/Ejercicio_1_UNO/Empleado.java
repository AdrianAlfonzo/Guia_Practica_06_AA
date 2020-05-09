package Ejercicio_1_UNO;

/**
 *
 * @author AA2020
 */
public class Empleado {
    private String _nombre;
    private int _edad;
    private String _DUI;

    
    public Empleado(){
    
    }
    
    
    public Empleado(String nombre, int edad, String DUI) {
        this._nombre = nombre;
        this._edad = edad;
        this._DUI = DUI;
    }
    
    
    public String SayHi(){
    return "Buenos días, buenas tardes y buenas noches.";
    }
    
    
    public static String SayHiStaticMethod(){
        return "Buenos días, buenas tardes y buenas noches. (Metodo de clase)";
    
    }

    
    public String GetNombre() {
        return _nombre;
    }
    public void SetNombre(String nombre) {
        this._nombre = nombre;
    }
    
    
    public int GetEdad() {
        return _edad;
    }
    public void SetEdad(int edad) {
        this._edad = edad;
    }
    
    
    public String GetDUI() {
        return _DUI;
    }
    public void SetDUI(String dui) {
        this._DUI = dui;
    }
}
