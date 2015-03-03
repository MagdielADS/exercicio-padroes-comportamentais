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
public class Loader {
    public static void main(String[] args) {
        Texto texto = new Texto();
        texto.escreverTexto("Primeira linha do texto\n");
        texto.escreverTexto("Segunda linha do texto\n");
        texto.escreverTexto("Terceira linha do texto\n");
        
        System.out.println("Texto completo");
        texto.mostrarTexto();
        
        System.out.println("Sem a última linha");
        texto.desfazerEscrita();
        texto.mostrarTexto();
        
        System.out.println("Sem as duas últimas");
        texto.desfazerEscrita();
        texto.mostrarTexto();
        
        System.out.println("Texto desfeito");
        texto.desfazerEscrita();
        texto.mostrarTexto();
    }
}
