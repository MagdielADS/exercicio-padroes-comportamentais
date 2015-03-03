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
public class CalcImpostosUSA implements Visitor{

    @Override
    public void visit(Visitable visitable) {
        if (visitable instanceof Produto) {
            Produto produto = (Produto) visitable;
            produto.setValor(produto.getValorDeProducao().multiply(new BigDecimal("3.5")));
        }
    }
    
}
