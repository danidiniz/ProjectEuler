/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumsquaredifference;

/**
 *
 * @author Daniel Diniz
 */
public class SumSquareDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(SumSquareDiff(100));
        
    }
    
    static double SumSquareDiff(int n){
        int sumOfSquare = 0;
        int squareOfSum = 0;
        for (int i = 1; i <= n; i++) {
            sumOfSquare += Math.pow(i, 2);
            squareOfSum += i;
        }
        squareOfSum = (int)Math.pow(squareOfSum, 2);
        
        int diff = squareOfSum - sumOfSquare;
        return diff;
    }
    
}
