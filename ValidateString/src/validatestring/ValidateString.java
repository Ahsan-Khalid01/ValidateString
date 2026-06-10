/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package validatestring;

import java.util.Scanner;

/**
 *
 * @author Ahsan Khalid
 */
public class ValidateString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.next();

        int n = str.length();

        Stack stackA = new Stack(n);
        Stack stackB = new Stack(n);

        int i = 0;
        int countA = 0;

        while (i < n && str.charAt(i) == 'a')
        {
            stackA.push('a');
            countA++;
            i++;
        }

        while (i < n && str.charAt(i) == 'b') 
        {
            if (stackA.isEmpty()) {
                System.out.println("Invalid String");
                return;
            }
            stackA.pop();
            stackB.push('b');
            i++;
        }

        while (i < n && str.charAt(i) == 'c')
        {
            if (stackB.isEmpty()) {
                System.out.println("Invalid String");
                return;
            }
            stackB.pop();
            stackA.push('c');
            i++;
        }

        while (i < n && str.charAt(i) == 'd')
        {
            if (stackA.isEmpty()) {
                System.out.println("Invalid String");
                return;
            }
            stackA.pop();
            i++;
        }

        if (i == n && stackA.isEmpty() && stackB.isEmpty() && countA > 0)
            System.out.println("Valid String");
        else
            System.out.println("Invalid String");
    }

        
    }


