public class Cuadrado{

    private double lado;

    public Cuadrado(){
    }

    public Cuadrado(double lado){
        this.lado =lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return this.lado;
    }

    @Override public boolean equals(Object objeto){
        if (!(objeto instanceof Cuadrado))
            return false;
        Cuadrado cuadrado = (Cuadrado) objeto;
        if(cuadrado == null)
            return false;
        if(cuadrado.lado == this.lado)
            return true;
        return false;
    }
    @Override public String toString(){
        String cadena = String.format("Lado : %d",
                                      lado);
        return cadena;
    }

    public double calculaArea(){
        return this.lado * 2
    }
    public double calculaPerimetro(){
        return this.lado*4
    }
}
