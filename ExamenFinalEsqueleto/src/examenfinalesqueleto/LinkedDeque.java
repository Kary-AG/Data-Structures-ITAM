/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinalesqueleto;

/**
 *
 * @author agomezdg
 */
public class LinkedDeque<T> implements DequeADT<T> {
    private LinearNode<T> inicio;
    private LinearNode<T> fin;
//Problema 1 a)
    public LinkedDeque(){}
    public LinkedDeque(LinearNode<T> fin){
        this.fin.setSig(fin);
        fin = this.fin;
    }

    // Agrega el dato por el frente de la cola.
    public void enqueueFront(T dato){
        if(dato == null)
            return;
        LinearNode<T> nodo = new LinearNode<T>(dato);
        if(fin == null){
            inicio = fin = nodo;
        }else{
            inicio.setSig(inicio.getSig().getSig());
            nodo.setSig(inicio);
            inicio = nodo;

        }
    }

    // Agrega el dato al final de la cola.
    public void enqueueRear(T dato){
        if(dato == null)
            return;
        LinearNode<T> node = new LinearNode<T>(dato);
        if(fin == null){
            inicio = fin = node;
        }else{
            fin.setSig(node);
            node.setSig(null);
            fin = node;
        }

    }
    // Quita el elemento del frente de la colai.
    public T dequeueFront(){
        if(isEmpty())
            return null;
        T t = inicio.getDato();
        eliminaNode(inicio);
        return t;
    }

 // Quita el elemento del final de la cola.
    public T dequeueRear(){
        if(isEmpty())
            return null ;
        T t = fin.getDato();
        eliminaNode(fin);
        return t;
    }

    public T first(){
        return inicio.getDato();
    }

    public T last(){
        return fin.getDato();
    }
    public boolean isEmpty(){
        return inicio == null;
    }

    private void eliminaNode(LinearNode<T> n){
	  if(n == null)
	      return;
	  else if(inicio == fin){
	      inicio = fin = null;
	      return;
	  }else if(n==inicio){
	      n.setSig(inicio);
          inicio = n.getSig();
	      return;
	  }else if(n == fin){
          LinearNode<T> node = new LinearNode<T>;
          node = inicio;
          while(node.getSig() != fin){
              node = node.getSig();
          }
	      node.setSig(null);
	      fin = node;
	  }
    }
}
