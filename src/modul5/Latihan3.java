/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Latihan3 {
    public static void main(String args[])
    {
        //int a=100;
        System.out.println("Enter the value for b");
         Scanner console = new Scanner(System.in);
	int b = console.nextInt();
     
        System.out.println("Enter the value for c");
	int c = console.nextInt();
        int res=10/(b-c);
        System.out.println(" The result is "+res);  
    }

}
