

        
package proyectofinalretocinco;
import java.util.Scanner;


public class ProyectoFinalRetoCinco {

    
    public static void main(String[] args) {
        int opcionSeleccionada;
        
        //Se crean los objetos maestro, alumno y tutor
        Maestro maestro = new Maestro(22, "Uriel", "Heredia", "heredia-uveg@uveg.com");
        Alumno alumno = new Alumno(12, "Jessyca", "Landa", 9.8, "Jessy-uveg@uveg.com");
        Tutor tutor = new Tutor(72, "Rodolfo", "Gomez", "Rodo-uveg@uveg.com", alumno.nombreAlumno, alumno.apellidoAlumno, alumno.calificacion);
        //creamos un menú con ayuda del comando
        System.out.println("Bienvenido a la base de datos de la Universidad Virtual de Guanajuato!");
        do{
           System.out.println("------¿Qué usuario desea consultar?------------------ "); 
           System.out.println("----------Elija una opción-----------------");
           System.out.println("           1)Consultar Maestro.");
           System.out.println("           2)Consultar Alumno.");
           System.out.println("           3)Consultar Tutor.");
           System.out.println("-----Para salir, escriba cualquier otro número-------");
           
           //Creamos un objeto de tipo Scanner para asignarle la opción
           Scanner scanner = new Scanner(System.in);
           opcionSeleccionada = scanner.nextInt();
           
           switch(opcionSeleccionada){
               case 1:
                   maestro.imprimirPerfil();
                   break;
               case 2:
                   alumno.imprimirPerfil();
                   alumno.mostrarCalificaciones();
                   alumno.guardarCalificaciones(alumno.calificacion);
                   break;
               case 3:
                   tutor.imprimirPerfil();
                   tutor.mostrarCalificaciones();
                   break;
               default:
                   System.out.println("!Hasta pronto!");
                   System.out.println("Developed by Carlos Esquivel D");                   
           }           
        }while(opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 );
        
        
        
    }
    
}
