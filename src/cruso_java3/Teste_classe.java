/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruso_java3;

/**
 *
 * @author Gladiston Fernando
 */
public class Teste_classe {

    public static void main(String[] args) {
        Conta minhaconta = new Conta();
        cliente c = new cliente();
        minhaconta.titular = c;
        c.nome = "chucumgunha";
        minhaconta.saldo = 10;
        System.out.println(minhaconta.saldo);
        minhaconta.titular.nome="vai dar treta!";
        System.out.println(minhaconta.titular.nome);
//        minhaconta.dono = "Fulano";
//        minhaconta.saldo = 1000;
//        minhaconta.saca(200);
//        minhaconta.deposita(500);
//        System.out.println("saldo: " + minhaconta.saldo);
//        if (minhaconta.saca(2000)) {
//            System.out.println("consegui sacar");
//        } else {
//            System.out.println("não concegui sacar");
//        }

    }

}

class Conta {

    int numero;
    cliente titular;
    String dono;
    double saldo;
    double limite;
    

    boolean saca(double quantidade) {
        if (this.saldo < quantidade) {
            return false;
        } else {
            this.saldo = this.saldo - quantidade;
            return true;
        }
    }
    void deposita(double quantidade) {
        this.saldo += quantidade;
    }
    
    void tranfere(Conta destino,double valor){
        this.saldo=this.saldo-valor;
        destino.saldo=destino.saldo+valor;
    
    }

    
}

class cliente {

    String nome;
    String sobrenome;
    String cpf;
}
