
package proyectofinalretocinco;


public class UsuarioBase {
 //Creamos  las variables
    double iD;
    String nombre;
    String apellido;
    String nombreAlumno;
    String apellidoAlumno;
    String correoElectrónico;
    double calificacion;
    
    //crearemos tres constructores para cada clase
    //Constructor de Maestro
    UsuarioBase(double iD, String nombre, String apellido, String correoElectrónico){
        this.iD = iD;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectrónico = correoElectrónico;        
    }
    //Constructor de Alumno
    UsuarioBase(double iD, String nombreAlumno, String apellidoAlumno, double calificacion, String correoElectrónico){
        this.iD = iD;
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.calificacion = calificacion;
        this.correoElectrónico = correoElectrónico;        
    }    
    //Constructor del tutor
    
    UsuarioBase(double iD, String nombre, String apellido, String correoElectrónico,  String nombreAlumno, String apellidoAlumno, double calificacion){
       this.iD = iD;
       this.nombre = nombre;
       this.apellido = apellido;
       this.correoElectrónico = correoElectrónico;
       this.nombreAlumno = nombreAlumno;  
       this.apellidoAlumno = apellidoAlumno; 
       this.calificacion = calificacion;
    }
    
}
