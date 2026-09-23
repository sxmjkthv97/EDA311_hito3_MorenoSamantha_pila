package com.pila.demo;

public class pila {

    private nodo cima;

    public pila() {
        cima = null;
    }

    public int size() {
        int contador = 0;
        nodo actual = cima;

        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }

        return contador;
    }

    public void agregar(String elemento) {
        nodo nuevo = new nodo(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public String quitar() {
        if (cima == null) {
            return null;
        }

        String elemento = cima.elemento;
        cima = cima.siguiente;

        return elemento;
    }

    public void mostrar() {
        nodo actual = cima;

        while (actual != null) {
            System.out.println(actual.elemento);
            actual = actual.siguiente;
        }
    }
    public String obtenerElementos() {
    String resultado = "";
    nodo actual = cima;

    while (actual != null) {
        resultado += actual.elemento + "\n";
        actual = actual.siguiente;
    }

    return resultado;
}
}