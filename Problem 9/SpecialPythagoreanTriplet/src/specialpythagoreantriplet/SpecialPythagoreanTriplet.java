/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specialpythagoreantriplet;

/**
 *
 * @author Daniel Diniz
 */
public class SpecialPythagoreanTriplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int c = 998;
        int b = 1;
        int a = 1;
        
        int tempC = c;
        int tempB = b;
        int tempA = a;

        boolean didFind = false;

        int product = 0;

        while (tempB > tempA || !didFind) {
            while (Math.pow(tempC, 2) >= (Math.pow(tempA, 2) + Math.pow(tempA, 2)) || !didFind) {
                if (Math.pow(tempA, 2) + Math.pow(tempB, 2) == Math.pow(tempC, 2)) {
                    product = tempA * tempB * tempC;
                    didFind = true;
                }
                tempC--;
                tempB++;
            }
            tempA++;
        }

    }

}
