/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.memento;

/**
 *
 * @author Magdiel Ildefonso
 */
public class Texto {
    private String texto;
    TextoCareTaker caretaker;
    
    public Texto() {
        caretaker = new TextoCareTaker();
        texto = new String();
    }

    public void escreverTexto(String novoTexto) {
        caretaker.addMemento(new TextoMemento(texto));
        texto += novoTexto;
    }

    public void desfazerEscrita() {
        texto = caretaker.getUltimoMementoSalvo().getEstadoTexto();
    }

    public void mostrarTexto() {
        System.out.println(texto);
    }
}
