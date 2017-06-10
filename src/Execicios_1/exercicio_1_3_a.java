/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execicios_1;

/**
 *
 * @author Gladiston Fernando
 */
public class exercicio_1_3_a {
    public static void main(String[] args) {
        int x,y;
        x=10;
        y=100;
        if (x<y) {                    
        for (int i = x; i < y; i++) {
            if (i%3==0) {
                System.out.println(i+" e divisivel por 3");
                
            }
        }
        }else{
            System.out.println("x não e menor que y");
        }
    }
    
}
