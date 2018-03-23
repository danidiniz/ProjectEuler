/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestprimefactor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Diniz
 */
public class LargestPrimeFactor {

    static List lista = new ArrayList();

    public static void main(String[] args) {
        //long n = 600851475143L;
        int n = 14;
        long largestPrime = 1;

        for (int i = 2; i <= n/2; i++) {
            if (isPrime(i)) {
                if (n % i == 0) {
                    largestPrime = i;
                    lista.add(i);
                }
            }
        }
        if (largestPrime == 1 || lista.size() == 0) {
            System.out.println("Digitou um num primo");
        } else {
            System.out.println("largest " + largestPrime);
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        }
    }

    static boolean isPrime(long n) {
        boolean prime = true;
        for (int j = 2; j <= n / 2; j++) {
            if (n % j == 0) {
                prime = false;
            }
        }
        return prime;
    }
}
