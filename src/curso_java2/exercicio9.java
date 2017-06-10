/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso_java2;

/**
 *
 * @author Gladiston Fernando
 */
public class exercicio9 {
    
    public static void main(String[] args) {
        
        for (int x = 13; x > 1; x--) {
            if (x%2==0) {
                x=x/2;
                System.out.println("x e par "+x);
            }
            else {
                x=3*x+1;
                System.out.println("x e impar "+x);
            }
            
                
            }
        }
    }
    

