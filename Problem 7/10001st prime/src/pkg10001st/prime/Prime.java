/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10001st.prime;

/**
 *
 * @author Daniel Diniz
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println(FindThPrime(10001));
        
        
    }
    
    static int FindThPrime(int n){
        int contador = 0;
        int currentNumber = 2;
        int prime = 0;
        while(contador <= n){
            if(isPrime(currentNumber)){
                contador++;
                prime = currentNumber;
            }
            currentNumber++;
        }
        return prime;
    }
    
    static boolean isPrime(int n){
            for (int i = 2; i < n/2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
    }
    
}
