
package proyectofinalretocinco;


public class Alumno extends UsuarioBase implements IUsuario{
    
    Alumno(double iD, String nombreAlumno, String apellidoAlumno, double calificacion, String correoElectrónico){
        super(iD, nombreAlumno, apellidoAlumno, calificacion, correoElectrónico);        
    }    
     
    
    @Override   
    public void imprimirPerfil(){        
       System.out.println("ID: " + this.iD + " - El alumno " + this.nombreAlumno + " " +  this.apellidoAlumno + ", cuyo correo es: " + this.correoElectrónico);
    }
    @Override
    public void mostrarCalificaciones(){
        System.out.println("La calificación del alumno: " + this.nombreAlumno + " es de: " + this.calificacion);
    }
    @Override
    public void guardarCalificaciones(double calificacion){
        System.out.println("Se guardó la siguiente calificación: " + this.calificacion);
        
    }
   
    
}
