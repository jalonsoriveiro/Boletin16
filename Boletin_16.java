/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_16;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IPodeCantar perso1 =  new Persoa();
        perso1.cantar();                
        IPodeCantar canario = new Canario();
        canario.cantar();
        IPodeCantar Galo = new Galo();
        Galo.cantar();
        
    }
    
}
