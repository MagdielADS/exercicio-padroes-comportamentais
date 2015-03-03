/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.visitor;

import java.math.BigDecimal;

/**
 *
 * @author Magdiel Ildefonso
 */
public class Loader {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setDescricao("Celular Moto G");
        produto.setValorDeProducao(new BigDecimal("160"));
        
        produto.accept(new CalcImpostosBrasil());
        System.out.println("Preço no Brasil: "+produto.getValor());
        
        produto.accept(new CalcImpostosUSA());
        System.out.println("Preço no EUA: "+produto.getValor());
        
        produto.accept(new CalcImpostosChina());
        System.out.println("Preço na China: "+produto.getValor());
    }
}
