
package proyectofinalretocinco;

public class Tutor extends UsuarioBase implements IUsuario{
    
   Tutor(double iD, String nombre, String apellido, String correoElectrónico,  String nombreAlumno, String apellidoAlumno, double calificacion ){
       super(iD, nombre, apellido, correoElectrónico, nombreAlumno, apellidoAlumno, calificacion);       
    }
    
    @Override
    public void imprimirPerfil(){
        System.out.println("ID: " + this.iD + " - El tutor " + this.nombre + " " +  this.apellido + ", cuyo correo es: " + this.correoElectrónico);

    }
    
    @Override
    public void mostrarCalificaciones(){
        System.out.println("La calificación del alumno " + this.nombreAlumno + " " + this.apellidoAlumno + " es: " + this.calificacion);  
    }
       @Override
    public void guardarCalificaciones(double calificacion){}   
}
