//lista.h
//EStructurasC

#ifndef lista_h
#define lista_h

#include <studio.h>

typedef struct Nodo{
  Libro libro
  struct Nodo* siguiente;
}Nodo;
typedef struct Lista{
  Nodo* cabeza;
  int longitud;
} Lista;

Libro* Obtener(int n, Lista* lista);

int Contar(Lista* lista);

int EStaVacia(Lista* lista);

void EliminaPrincipio(Lista* lista);

void EliminaUltimo(Lista* lista);

void EliminarElemento(int n, Lista* lista)
#endif /*lista_h*/
