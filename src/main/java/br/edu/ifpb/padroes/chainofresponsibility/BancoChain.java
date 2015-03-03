/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.chainofresponsibility;

/**
 *
 * @author Magdiel Ildefonso
 */
public abstract class BancoChain {
    private BancoChain next;
    private Bancos identificadorDoBanco;

    public BancoChain(Bancos id) {
        next = null;
        identificadorDoBanco = id;
    }

    public void setNext(BancoChain forma) {
        if (next == null) {
            next = forma;
        } else {
            next.setNext(forma);
        }
    }
    
    public void efetuarPagamento(Bancos id) throws Exception {
        if (podeEfetuarPagamento(id)) {
            efetuaPagamento();
        } else {
            if (next == null) {
                throw new Exception("banco não cadastrado");
            }
            next.efetuarPagamento(id);
        }
    }

    private boolean podeEfetuarPagamento(Bancos id) {
        if (identificadorDoBanco == id) {
            return true;
        }
        return false;
    }

    protected abstract void efetuaPagamento();
}
