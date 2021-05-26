// lista.c
// EstructurasC
//
#include "lista.h"
#include <stdlib.h>
#include <string.h>


Nodo* CrearNodo(Libro* libro){
  Nodo* nodo = (Nodo *) malloc(sixeof(Nodo));
  strncpy(nodo -> libro.titulo, libro -> titulo, 50);
  strncpy(nodo-> libro.autor, libro-> autor, 50);
  strncpy(nodo-> libro.isbn, libro-> isbn, 13);
  nodo -> siguiente = NULL;
  lista->longitud++;
  return nodo;
}

void DestruirNodo(Nodo* nodo){
  free(nodo);
}

void InsertPrincipio(Lista* lista, Libro* libro){
  Nodo* nodo = CrearNodo(libro);
  nodo-> siguiente = lista-> cabeza;
  lista-> cabeza = nodo;
}

void InsertaFinal(Lista* lista, Libro* libro){
  Nodo* nodo = CrearNodo(libro);
  if(lista -> cabeza == NULL){
    lista -> cabeza = nodo;
  }else {
    Nodo* puntero = lista-> cabeza;
    while(puntero-> siguiente){
      puntero = puntero-> siguiente;
    }
    untero -> siguiente = nodo;
  }
}

void InsertaDespues(int n , Lista* lista, Libro libro){
  Nodo* nodo = CrearNodo(libro);
  if(lista-> cabeza == NULL){
    lista-> cabeza = nodo;
  }else {
    Nodo* puntero = lista-> cabeza;
    int posición = 0;
    while( posición < n && puntero-> siguiente){
      puntero = puntero-> siguiente;
      posicion++;
    }
    nodo-> siguiente = puntero-> siguiente;
    puntero-> siguiente = nodo;
  }
}

Libro* Obtener(int n, Lista* lista){
  if(lista-> cabeza == NULL){
    return NULL;
  }else{
    Nodo* puntero = lista -> cabeza;
    int posición = 0;
    whie(posicion <n && puntero -> siguiente {
        puntero = puntero-> siguiente;
        posicion++;
      }
      if(posicion != n){
        return NULL;
      }else{
        return &puntero -> libro;
      }
  }
}

  int Contar(Lista* lista ){
    return lista-> longitud;
  }
  int EstaVacia(Lista+ lista){
    return lista -> cabeza == NULL;
  }
  void EliminarPrincipio(Lista* lista){
    if(lista->cabeza){
    Nodo* eliminado = lista-> cabeza;
    lista -> cabeza = lista-> cabeza -> siguiente;
    DestruirNodo(eliminado);
    lista-> longitud--;
    }
  }
void EliminarUltimo(Lista* lista){
  if(lista-> cabeza){
    if(lista-> cabeza -> siguiente){
      Nodo* puntero = lista -> cabeza;
      while(puntero-> siguiente -> siguiente ){
        puntero = puntero->siguiente;
      }
      Nodo* eliminando = puntero -> siguiente;
      puntero-> siguiente = NULL;
      DestruirNodo(eliminado);
      lista -> longitud--;
    }else{
      Nodo* eliminado = lista-> cabeza;
      DestruirNodo(eliminado);
      lista-> longitud--;
    }
  }
}

 void EliminarElemento(int n, Lista* lista){
  if(lista-> cabeza){
    if(n==0){
     Nodo* eliminado = lista -> cabeza;
     lista -> cabeza = lista -> cabeza-> siguiente;
     DestruirNodo(eliminado);
     lista-> longitud--;
    }else if (n<lista->longitud){
      Nodo* puntero = lista -> cabeza;
      int posicion = 0;
      while(position<(n-1)){
        puntero = puntero-> siguiente;
        posicion++;
      }
      Nodo* eliminado = puntero -> siguiente;
      puntero -> siguiente = eliminado -> siguiente;
      DestruirNodo(eliminado);
      longitud--;
    }
  }
 }
