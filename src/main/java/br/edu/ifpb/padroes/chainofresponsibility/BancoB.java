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
public class BancoB extends BancoChain{
    public BancoB() {
        super(Bancos.BANCO_B);
    }

    @Override
    protected void efetuaPagamento() {
        System.out.println("Pagamento feito no banco B");
    }
}
