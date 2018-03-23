/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author Daniel Diniz
 */
public class JavaApplication9 {

    public static void main(String[] args) {
        System.out.println(sumOfMultiples(1000));
    }
    
    static int sumOfMultiples(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if((i%3 == 0) || (i%5 == 0)){
                sum += i;
            }
        }
        return sum;
    }
    
}
