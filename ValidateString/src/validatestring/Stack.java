/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package validatestring;
import java.util.Scanner;
/**
 *
 * @author Ahsan Khalid
 */
public class Stack
{
    char[] arr;
    int top;

    Stack(int size)
    {
        arr = new char[size];
        top = -1;
    }

    void push(char ch) 
    {
        arr[++top] = ch;
    }

    char pop()
    {
        if (top == -1)
            return '#';
        return arr[top--];
    }

    boolean isEmpty()
    {
        return top == -1;
    }

}
