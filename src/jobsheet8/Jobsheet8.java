/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

/**
 *
 * @author asus
 */
public class Jobsheet8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        for(int i=0; i<=4; i++){
            System.out.println(i+" "); 
            for (int j=1; j<=i; j++)
                System.out.print(j+" ");
        }
    }
}