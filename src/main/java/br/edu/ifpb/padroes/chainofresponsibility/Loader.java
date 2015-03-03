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
public class Loader {
    public static void main(String[] args) {
        BancoChain bancos = new BancoA();
        bancos.setNext(new BancoB());
        bancos.setNext(new BancoC());
        bancos.setNext(new BancoD());

        try {
            bancos.efetuarPagamento(Bancos.BANCO_C);
            bancos.efetuarPagamento(Bancos.BANCO_D);
            bancos.efetuarPagamento(Bancos.BANCO_A);
            bancos.efetuarPagamento(Bancos.BANCO_B);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
