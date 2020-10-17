/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * NAMA  : Diva Sabila Ramadhan 
 * KELAS : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program Penugasan 
 */
public class Penugasan {

    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        
        System.out.println("NIlai a = " + a);
        System.out.println("NIlai b = " + b);
        System.out.println("NIlai c = " + c+"\n");
        
        c = a + b;
        System.out.println("c = a + b = " + c);
        c += a;
        System.out.println("c += a = " + c);
        c -= a;
        System.out.println("c -= a - " + c);
        c *= a;
        System.out.println("c *= a = " + c);
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a = " + c);
        c <<= 2;
        System.out.println("c <<= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= a = " + c);
        c &= a;
        System.out.println("c &= 2 = " + c);
        c ^= a; 
        System.out.println("c ^= a= " + c);
        c |= a;
        System.out.println("c |= a = " + c);
        
    }
    
}
