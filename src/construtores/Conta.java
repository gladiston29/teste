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
public class Conta {

    int numero;
    Cliente titular;
    double saldo;
    double limite;

    Conta(Cliente titular) {
        this.titular=titular;
        System.out.println("contruindo uma conta!");
    }

    Conta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
