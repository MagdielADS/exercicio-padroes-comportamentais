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
public class BancoA extends BancoChain{
    public BancoA() {
        super(Bancos.BANCO_A);
    }

    @Override
    protected void efetuaPagamento() {
        System.out.println("Pagamento feito no banco A");
    }
}
