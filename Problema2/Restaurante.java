public class Restaurante{
    String nombre;
    int numMesas;
    Cuadrado cuadrado;

    public Restaurante(String nombre, int numMesas, Cuadrado cuadrado){
        if(!(numMesas<=1 && numMesas>=25))
            System.out.println("Error, el número de mesas es incorrecto");
        else
            this.numMesas = numMesas;
        this.nombre = nombre;
        this.cuadrado = cuadrado;
    }

    public double metrosManteles(){
        return cuadrado.calculaArea()*numMesas;
    }

     public double metrosPuntilla(){
        return cuadrado.calculaPerimetro()*numMesas;
    }
}
