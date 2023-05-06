package com.mycompany.ugallery;
public class listaEnlazada {
    nodo head;
    
    public listaEnlazada(){
        this.head = null;
    }
    
    public void add(String valor){
        nodo nuevo = new nodo(valor);
        if(this.head == null){
            this.head = nuevo;
        }else{
            nodo actual = this.head;
            
            while (actual.next != null){
                actual = actual.next;
            }
            actual.next = nuevo;
        }
    }
        public void remove(int indice) {
        if (this.head == null) {
            return;
        }
        if (indice == 0) {
            this.head = this.head.next;
            return;
        }
        
        nodo actual = this.head;
        int i = 0;
        
        while(actual != null && i < indice - 1){
            actual = actual.next;
            i++;
        }
        
        if (actual != null && actual.next != null){ 
           actual.next = actual.next.next; 
        }
    }
        
    public void printlist(){
        nodo actual = this.head;
        while (actual != null){
                System.out.println(actual.valor);
                actual = actual.next;
            }
        System.out.println("");
    }
    public boolean buscar(String valor) {
    nodo actual = this.head;
    while (actual != null) {
        if (actual.valor.equals(valor)) {
            return true;
        }
        actual = actual.next;
    }
    return false;
}
}
