/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Magdiel Ildefonso
 */
public class TextoCareTaker {
    private List<TextoMemento> estados;
    
    public TextoCareTaker(){
        estados = new ArrayList<>();
    }
    
    public void addMemento(TextoMemento memento){
        estados.add(memento);
    }
    
    public TextoMemento getUltimoMementoSalvo(){
        if (estados.size() <= 0) {
            return new TextoMemento("");
        }
        TextoMemento estadoSalvo = estados.get(estados.size() - 1);
        estados.remove(estados.size() - 1);
        return estadoSalvo;
    }
}
