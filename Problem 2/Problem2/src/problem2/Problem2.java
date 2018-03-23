/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

/**
 *
 * @author Daniel Diniz
 */
public class Problem2 {

    public static void main(String[] args) {
        int sum = 2;
        int a = 1;
        int b = 2;
        int temp = b;
        while((a+b) < 4000000){
            if((a+b)%2 == 0)
                sum += (a+b);
            b += a;
            a = temp;
            temp = b;
        }
        System.out.println("sum: " + sum);
    }
    
    // 4.000.000
    
}
