public class Rectangulo{
    double lado1;
    double lado2;

    public Rectangulo(){}

    public Rectangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void setLado1(double lado1){
        this.lado1 = lado1;
    }

    public void setLado2(double lado2){
        this.lado2 = lado2;
    }

    public double getLado1(){
        return lado1;
    }

    public double getLado2(){
        return lado2;
    }

    @Override public boolean equals(Object objeto){
        if(!(objeto instanceof Rectangulo))
            return false;
        Rectangulo rectangulo = (Rectangulo) objeto;
        if(rectangulo== null)
            return false;
        if((rectangulo.lado1 == this.lado1) && (rectangulo.lado2 == this.lado2))
            return true;
        return false;
    }

    @Override public String toString(){
        String cadena = String.format("Lado1   : %d\n" +
                                      "Lado2   : %d'n",
                                      lado1,lado2);
        return cadena;
    }

    public double calculaArea(){
        return lado2*lado1;
    }

    public double calculaPerimetro(){
        return lado2*2 + lado1*2;
    }
}
