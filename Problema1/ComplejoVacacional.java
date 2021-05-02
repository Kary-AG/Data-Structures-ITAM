public class ComplejoVacacional{
    String nombre;
    int numAlb;
    Rectangulo forma;

    public ComplejoVacacional(String nombre, int numAlb, Rectangulo forma){
        if (!(numAlb>= 1 && numAlb<=10))
            System.out.println("Error el número de albercas no es correcto");
        else
            this.numAlb = numAlb;
        this.nombre = nombre;
        this.forma = forma;
    }

    public double cubrirSuperficie(){
        return forma.calculaArea() * numAlb;
    }

    public double cercarAlbercas(){
        return forma.calculaPerimetro()*numAlb;
    }
}
