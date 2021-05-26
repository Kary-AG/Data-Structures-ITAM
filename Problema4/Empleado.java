public class Empleado{

    private static int serie =100;
    private int claveEmpleado;
    private String nombreEmpleado;
    private double sueldoBase;

    public Empleado(){}

    public Empleado(String nombreEmpledo, double sueldoBase){
        this.nombreEmpleado = nombreEmpleado;
        this.sueldoBase = sueldoBase;
    }

    public double getSueldoBase(){
        return sueldoBase;
    }

    public String getNombreEmpleado(){
        return nombreEmpleado;
    }

    @Override public String toString(){
        String cadena = String.format("Nombre del Empleado  : %s\n"+
                                      "Sueldo Base          : %d\n",
                                      nombreEmpleado,sueldoBase);
        return cadena;
    }

    @Override public boolean equals(Object objeto){
        if (!(objeto instanceof Empleado))
            return false;
        Empleado empleado = (Empleado)objeto;
        if(empleado == null)
	     return false;
        if((empleado.claveEmpleado == this.claveEmpleado)&& (empleado.nombreEmpleado == this.nombreEmpleado)
           &&(empleado.sueldoBase == this.suedoBase))
            return true;
        return false;
    }

    public double calculaSalario(double prestac, double deduc){
    }
}
