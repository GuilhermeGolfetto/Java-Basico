/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {3.5,2.74,9,-4.5};
        Arrays.sort(v); //colocano vetor em ordem
        int pos = Arrays.binarySearch(v,1);
        for(double valor: v){
            System.out.println(valor);
        }

    }
    
}
