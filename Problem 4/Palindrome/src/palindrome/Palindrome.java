/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author Daniel Diniz
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LargestPalindrome();

    }

    static void LargestPalindrome() {
        
        String palindrome = "";
        int a = 0;
        int b = 0;
        
        for (int i = 100; i <= 999; i++) {
            for (int j = i; j <= 999; j++) {
                String s = String.valueOf(i * j);

                boolean isPalindrome = true;
                for (int k = 0; k < s.length() / 2; k++) {
                    if (s.charAt(k) != s.charAt(s.length()- 1 - k)) {
                        isPalindrome = false;
                    }
                }
                if(isPalindrome){
                    palindrome = s;
                    a = i;
                    b = j;
                }

                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
        
        if(!palindrome.equals("")){
            System.out.println("Largest palindrome: " + palindrome + "\nFrom multiplication: " + a + " * " + b);
        }
        
    }

}
