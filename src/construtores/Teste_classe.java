/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtores;

/**
 *
 * @author Gladiston Fernando
 */
public class Teste_classe {

    public static void main(String[] args) {

        Conta minhaconta = new Conta();
        Cliente c = new Cliente();
        minhaconta.titular = c;
        c.nome = "chucumgunha";
        minhaconta.saldo = 10;
        System.out.println(minhaconta.saldo);
        minhaconta.titular.nome = "vai dar treta!";
        System.out.println(minhaconta.titular.nome);

    }
}
