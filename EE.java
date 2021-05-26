public class EE <T> implements Iterable<T> {
    private Nodo <T> primero; // guarda la direccion de un objeto tipo nodo


    public EE() {
        primero= null; // esta vacia

    }
    public boolean estaVacia(){

        return primero == null;
    }
    public void agregaInicio(T dato){
        Nodo<T> nuevo= new Nodo(dato);

        nuevo.setDireccion(primero);
        primero=nuevo;


    }
    public void agregaUltimo(T dato){// el nodo que ponga pasa a ser el ultimo de la estructura
        if(estaVacia())
            agregaInicio(dato);
        else {
            Nodo<T> auxiliar= primero; //permite navegar a traves de la estructura enlazada
            // se crea una variable apuntador que tiene el valor de primero
            while (auxiliar.getDireccion() != null)// verificamos que no sea el ultimo
                auxiliar= auxiliar.getDireccion();
            Nodo<T> nuevo= new Nodo(dato);
            auxiliar.setDireccion(nuevo);

        }
         }

    public T quitaInicio() {
            if(estaVacia())
                throw new ExcepcionColeccionVacia("No hay datos");
            else{
                Nodo<T>temporal=primero;
                primero=primero.getDireccion();
                temporal.setDireccion(null);
                return temporal.getDato();
            }
        }
    public String toString(){
        StringBuilder sb= new StringBuilder();

        Nodo<T> apuntador=primero;
        while(apuntador!= null){
            sb.append(apuntador.getDato()).append("\n");
            apuntador=apuntador.getDireccion();

        }
        return sb.toString();





    }


    public T quitaUltimo(){
        if (estaVacia())

            throw new ExcepcionColeccionVacia("No hay datos");

        else{
            Nodo<T> actual=primero;
            if(primero.getDireccion()== null)
                primero = null;
            else {
                Nodo<T> ant=primero;
                actual=actual.getDireccion();
                while (actual.getDireccion()!= null){
                    ant=actual;
                    actual.getDireccion();
                }// salindo sel while se esta anuladno la relacion
                ant.setDireccion(null);

            }
            return actual.getDato();  // la variable actual es el ultimo
            // se rompe la relacion con su vecino

        }
}

    public T quitaDatoV2(T dato){
        T resultado=null;

        if(!estaVacia()){
            Nodo<T> act;
        act=primero;
        if(act.getDato().equals(dato))
            primero=primero.getDireccion();
        else{
            while (act.getDireccion() != null)
        }


        }






    }

    // quita un  dato si lo encuentra version regresando nulo, si no esta


    public T quitaDato(T dato ){
        T resultado=null;
        Nodo <T> act, ant;
        ant=null;
        act=primero;



        while(act != null && act.getDato().equals(dato)){
            ant= act;
            act= act.getDireccion();
        }
        if(act != null){// encontramos el dato
            resultado=act.getDato();

            if(ant== null)
                primero=primero.getDireccion();
            else
                ant.setDireccion(act.getDireccion());
            act.setDireccion(null);

        }

        return resultado;

    }
    public boolean eliminaSiguienteDe(T info ){
        boolean resp= false;
        Nodo<T> act, sig;
        act=primero;

        while(act!= null)




        return false;
        return false;

    }

//    public boolean eliminaAnteriorA(T info ){
//        boolean encontre=false;
//        if(!estaVacia()){
//            throw new ExceptionColeccionEstaVAcia("no hay datos");
//
//            Nodo <T> actual;
//            actual = primero;
//            Nodo<T> anterior, antePen;
//            anterior=null;
//            antePen=null ;
//           while(actual != null && !encontre ){
//               if(actual.getDato().equals(info)){
//                   encontre=true;
//                   else {
//                           antePen=anterior;
//                           anterior=actual;
//                           actual=actual.getDireccion();
//
//                           }
//               }
//               if(encontre){
//                   if(antePen!=null){
//                       antePen.setDireccion(actual);
//                       anterior.setDireccion(null);
//
//                   }
//               }
//           }
//
//
//
//        }
//
//    }

//        T resultado=null;
//
//        if(!estaVacia()){
//            Nodo<T> act;
//        act=primero;
//        if(act.getDato().equals(dato))
//            primero=primero.getDireccion();
//        else{
//            while (act.getDireccion() != null)
//        }

//    public boolean eliminaAnteriorA1(T dato){
//        boolean resp=false;
//        if(!estaVacia() && !primero.getDato().equals(dato)){
//            Nodo<T> actual,ante;
//        ante=null;
//        actual=primero;
//        while(actual.getSiguiente())
//
//
//
//    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



public boolean insertaAntesQue(T dato,T nuevo ){
    boolean resp=false;



    if(!estaVacia()){
        Nodo<T> actual;
        Nodo<T> anterior;
        actual=primero;
        anterior=null;


        while(actual.getDireccion() !=null && !actual.getDireccion().getDato().equals(dato) ){
            anterior=actual;
            actual=actual.getDireccion();


        }
        if(actual.getDireccion() != null){


            if(actual.equals(primero)){
                actual.setDato(nuevo);
                actual.setDireccion(primero);
                primero=anterior.getDireccion(); // ya se desplazo

            }
        }
        else{
            Nodo<T> inserta=null;
            inserta.setDato(nuevo);
            anterior.setDireccion(actual);
            inserta.setDireccion(actual);



        }
        resp=true;



    }
    else{
        if(actual.equals(primero)){
                actual.setDato(nuevo);
                actual.setDireccion(primero);
                primero=anterior.getDireccion(); // ya se desplazo

        resp=true;





    }

    return resp;
}

}
    public int cuentaOcurrencias(T dato ){
        int c = 0;
        Nodo indice = primero;
        while (indice!= null){
            if (indice.dato.equals(dato)){
                c++;
               indice = indice.getsiguiente();
            }
        }
        return c;

    }


    public int cuentaOcurrencias(T dato){
        int c =0;
        Nodo indice = primero;
        return cuentaOcurrenciasAux(dato, indice, c);
    }

    public int cuentaOcurrenciasAux(T dato, Nodo nodo, int c){
        if(nodo == null)
            return c;
        if (nodo.dato.equals(dato)){
            c++;
            nodo =  nodo.getsiguiente();
        }

        return cuentaOcurrenciasAux(dato, nodo, c);

}
}
