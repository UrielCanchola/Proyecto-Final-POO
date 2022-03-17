
package proyectofinalretocinco;


public interface IUsuario {
    //Declaramos los tres métodos abstractos que serán usados por las clases
    //Maestro, Alumno y Tutor
    public void imprimirPerfil();
    public void mostrarCalificaciones();
    public void guardarCalificaciones(double calificacion);
    
}
