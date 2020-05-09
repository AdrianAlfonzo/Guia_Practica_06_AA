package Ejercicio_3_TRES;

/**
 *
 * @author AA2020
 */
public class Audio extends ArchivoMultimedia{
    private String _nombre;
    private String _duracion;

    
    public Audio(){
    
    }
    
    
    public Audio(String nombre, String duracion, String formato, String fechaCreacion) {
        super(formato, fechaCreacion);
        this._nombre = nombre;
        this._duracion = duracion;
    }
    
    
    @Override
     public String Play(){
        return "Se está reproduciendo " + this.GetNombre() + ".mp3";
    }
     

    public String GetNombre(){
        return _nombre;
    }
    public void SetNombre(String nombre){
        this._nombre = nombre;
    }

    public String GetDuracion() {
        return _duracion;
    }
    public void SetDuracion(String duracion){
        this._duracion = duracion;
    }
}
