package com.mycompany.ugallery;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class listaDoble {
    nodo2 head;
    
    public listaDoble(){
        this.head = null;
    }
    public void add (String valor){
        nodo2 nuevo = new nodo2(valor);
        if(this.head == null){
            this.head = nuevo;
        }else{
            nodo2 actual = this.head;
            
            while (actual.next != null){
                actual = actual.next;
            }
            actual.prev = actual;
            actual.next = nuevo;
        }
    }
    public void remove (int indice){
        if(this.head == null){
            return;
        }
        if(indice == 0){
            this.head = this.head.next;
            
            if(this.head != null){
                this.head.prev = null;
            }
            
            return;
            
        }
        nodo2 actual = this.head;
        int i = 0;
        while(actual != null && i<indice-1){
            actual = actual.next;
            i++;
        }
        if(actual != null && actual.next != null){
            actual.next = actual.next.next;
            if(actual.next != null){
                actual.next.prev = actual;
            }
        }
    }
    
    public void printListNext() {
        nodo2 actual = this.head;
        while (actual != null) {
        System.out.println(actual.valor);
        actual = actual.next;
    }
        System.out.println();
  }
    
    public void printListNext(int indice, JLabel imagen) throws IOException {
    nodo2 actual = this.head;
    int index = 0;
    while (actual != null) {
        System.out.println("Indice " + index);
        if (index == indice) {
            System.out.println(actual.valor);
            File archivoImagen = new File(actual.valor);
            BufferedImage img = ImageIO.read(archivoImagen);
            ImageIcon imagenIcono = new ImageIcon(img);
            imagen.setIcon(imagenIcono);
            break;
        }
        actual = actual.next;
      
      index++;
    }
    System.out.println();
  }

    public int size() {
        int index = 0;
        nodo2 actual = this.head;
        while (actual != null) {
        System.out.print(actual.valor);
        actual = actual.next;
        index++;
    }

    return index;
  }

    public void printListPrev() {
        nodo2 actual = this.head;
        while (actual != null) {
        if (actual.prev != null) {
            System.out.print(actual.valor);
            actual = actual.prev;
        }
    }
    System.out.println();
  }
    
          public void printListNext(int indice, JTextArea area) throws IOException {
    nodo2 actual = this.head;
    int index = 0;
    while (actual != null) {
        System.out.println("Indice " + index);
        if (index == indice) {
            System.out.println(actual.valor);
            area.append(actual.valor + "\n");
            break;
        }
        actual = actual.next;
        index++;
    }
    System.out.println();
  }

}
