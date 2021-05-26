public class Alumno{
    private static int serie = 100;
    private int claveUnica;
    private String nombreAlum;
    private double[] califMateriasAprob;
    private int totalCalif;
    private int MAX_CALIF =50;

    public Alumno(string nomAlum){
        this.nomAlum = nomAlum;
    }

    public boolean altaCalificacion(double calif){
    }
    public String getNombreAlum(){
        return nombreAlum;
    }

    @Override public boolean equals(Object object){
        if(!(object instanceof Alumno))
            return false;
        Alumno alumno = (Alumno) object;
        if(alumno == null)
            return false;
        if((alumno.claveUnica == this.claveUnica) && (alumno.nombreAlum.equals(this.nombreAlum))
           && (alumno.califMateriasAprob.equals(this.califMateriasAprob))&&(alumno.totalCalif == this.totalCalif))
    }

    @Override public String toString(){
        String cadena = String.format("Nombre       : %s\n"+
                                      "Clave Única  : %d\n"+
                                      "Total Calif  : %d\n",
                                      nombreAlum, claveUnica,totalCalif);
    }

    public double calculaPromedio(){
        double promedio = 0;
        for (int i = 0; i< califMateriasAprob.length; i++){
            promedio = califMateriasAprob[i];
        }
    }
    
}
