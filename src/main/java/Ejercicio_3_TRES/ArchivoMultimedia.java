package Ejercicio_3_TRES;

/**
 *
 * @author AA2020
 */
public class ArchivoMultimedia{
    private String _formato;
    private String _fechaCreacion;
    
    
    public ArchivoMultimedia(){
    
    }

    
    public ArchivoMultimedia(String formato, String fechaCreacion){
        this._formato = formato;
        this._fechaCreacion = fechaCreacion;
    }
    
    
    public String Play(){
        return "Se está reproduciendo de fondo";
    }

    
    public String GetFormato(){
        return _formato;
    }
    public void SetFormato(String formato){
        this._formato = formato;
    }

    
    public String GetFechaCreacion(){
        return _fechaCreacion;
    }
    public void SetFechaCreacion(String fechaCreacion){
        this._fechaCreacion = fechaCreacion;
    }
}
