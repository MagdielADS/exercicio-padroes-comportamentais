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
public class TextoMemento {
    private String estadoTexto;
    
    public TextoMemento(String texto){
        this.estadoTexto = texto;
    }

    public String getEstadoTexto() {
        return estadoTexto;
    }
}
