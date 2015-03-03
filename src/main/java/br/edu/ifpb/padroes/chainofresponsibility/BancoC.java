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
public class BancoC extends BancoChain{
    public BancoC() {
        super(Bancos.BANCO_C);
    }

    @Override
    protected void efetuaPagamento() {
        System.out.println("Pagamento feito no banco C");
    }
}
