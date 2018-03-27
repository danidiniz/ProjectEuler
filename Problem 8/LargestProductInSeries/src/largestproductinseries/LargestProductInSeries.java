/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestproductinseries;

/**
 *
 * @author Daniel Diniz
 */
public class LargestProductInSeries {

    static String bigNumber
            = "73167176531330624919225119674426574742355349194934\n"
            + "96983520312774506326239578318016984801869478851843\n"
            + "85861560789112949495459501737958331952853208805511\n"
            + "12540698747158523863050715693290963295227443043557\n"
            + "66896648950445244523161731856403098711121722383113\n"
            + "62229893423380308135336276614282806444486645238749\n"
            + "30358907296290491560440772390713810515859307960866\n"
            + "70172427121883998797908792274921901699720888093776\n"
            + "65727333001053367881220235421809751254540594752243\n"
            + "52584907711670556013604839586446706324415722155397\n"
            + "53697817977846174064955149290862569321978468622482\n"
            + "83972241375657056057490261407972968652414535100474\n"
            + "82166370484403199890008895243450658541227588666881\n"
            + "16427171479924442928230863465674813919123162824586\n"
            + "17866458359124566529476545682848912883142607690042\n"
            + "24219022671055626321111109370544217506941658960408\n"
            + "07198403850962455444362981230987879927244284909188\n"
            + "84580156166097919133875499200524063689912560717606\n"
            + "05886116467109405077541002256983155200055935729725\n"
            + "71636269561882670428252483600823257530420752963450";

    public static void main(String[] args) {

        int numberOfDigits = 13;
        
        char[] digits = new char[numberOfDigits];
        
        System.out.println("Greatest product of " + numberOfDigits + " adjacent is: " + GreatestProduct(numberOfDigits, bigNumber, digits));
        
        System.out.print("from the digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
            if(i < (digits.length - 1))
                System.out.print(" * ");
        }
        System.out.println("");
    }

    static int GreatestProduct(int numberOfDigits, String number, char[] arrayToSaveDigits) {
        int greatestProduct = 1;
        int temp;
        char[] tempString = new char[numberOfDigits];
        for (int i = 0; i < number.length(); i++) {
            temp = Character.getNumericValue(number.charAt(i));
            tempString[0] = number.charAt(i);
            for (int j = 1; j < numberOfDigits; j++) {
                if (i + numberOfDigits > number.length()) {
                    j = numberOfDigits;
                } else {
                    temp *= Character.getNumericValue(number.charAt(i + j));
                    tempString[j] = number.charAt(i + j);
                }
            }
            if (temp > greatestProduct) {
                greatestProduct = temp;
                for (int j = 0; j < tempString.length; j++) {
                    arrayToSaveDigits[j] = tempString[j];
                }
            } else {
                for (int j = 0; j < tempString.length; j++) {
                    tempString[j] = ' ';
                }
            }
        }
        return greatestProduct;
    }

}
