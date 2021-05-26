public class Escuela{
    String nombre;
    String direccion;
    int numAlumnos;

    public Escuela(String nombre,String direccion, int numAlumnos){
        if(!(numAlumnos<= 50 && numAlumnos >=1))
           System.out.println("Error, el número de alumnos es incorrecto");
        this.nombre = nombre;
        this.direccion = direccion;
        this.numAlumnos = numAlumnos;
    }

}
