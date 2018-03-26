/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallestmultiple;

/**
 *
 * @author Daniel Diniz
 */
public class SmallestMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Smallest: " + FindSmallestMultiple());
    }
    
    static int FindSmallestMultiple(){
        boolean found = false;
        int n = 2520;
        int smallest = 0;
        while(!found){
            for (int i = 2; i <= 20; i++) {
                if(n % i == 0){
                    found = true;
                    smallest = n;
                }
                else{
                    found = false;
                    i = 21;
                }
            }
            n++;
        }
        return smallest;
    }
    
}
