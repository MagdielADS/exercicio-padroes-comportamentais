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
public class Produto implements Visitable{
    private String descricao;
    private BigDecimal valor;
    private BigDecimal valorDeProducao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValorDeProducao() {
        return valorDeProducao;
    }

    public void setValorDeProducao(BigDecimal valorDeProducao) {
        this.valorDeProducao = valorDeProducao;
    }

    
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
