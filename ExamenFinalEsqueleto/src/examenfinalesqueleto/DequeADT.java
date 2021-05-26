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
public interface DequeADT<T> {
    public void enqueueFront(T dato);  // Agrega el dato por el frente de la cola.
    public void enqueueRear(T dato);   // Agrega el dato al final de la cola.
    public T dequeueFront();           // Quita el elemento del frente de la cola.
    public T dequeueRear();            // Quita el elemento del final de la cola.
    public T first();
    public T last();
    public boolean isEmpty();

}
