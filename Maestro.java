
package proyectofinalretocinco;


public class Maestro extends UsuarioBase implements IUsuario{
    //esta clase, su interfáz es de IUsuario y es heredada de UsuarioBase
    Maestro(double iD, String nombre, String apellido, String correoElectrónico){
        super(iD, nombre, apellido, correoElectrónico);    
    }
    
    
    @Override   
    public void imprimirPerfil(){        
       System.out.println("ID: " + this.iD + "- El maestro " + this.nombre + " " +  this.apellido + ", cuyo correo es: " + this.correoElectrónico);
    }
    
    @Override
    public void mostrarCalificaciones(){
        
    }
       @Override
    public void guardarCalificaciones(double calificacion){
       
    }   
}
