/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicialização de vetor
        int n[] = new int[4]; //uma maneira de fazer
        int x[] = {3,2,8,7,5,4}; //outra maneira de fazer
        System.out.println("Total de casas de N:"+ x.length);
        for(int i =0; i<x.length;i++){
            System.out.println("Na posição " + i + ":" + x[i]);
        }
    }
    
}
