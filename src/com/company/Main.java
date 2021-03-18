package com.company;

import java.util.Scanner;

public class Main {

    static int Fibbonacci(int n)
    {
        int returnVal = 0;
        int val1 = 0;
        int val2 = 1;

        if(n == 0)
            return val1;
        else if(n==1)
            return val2;
        else
        {
            for(int i = 1; i<n; i++)
            {
                returnVal = val1 + val2;
                val1 = val2;
                val2 = returnVal;
            }
            return returnVal;

        }

    }

    static int FibbonacciRec(int n)
    {
        if(n == 0)
            return 0;
        else if(n==1)
            return 1;
        else
            return FibbonacciRec(n-2)+FibbonacciRec(n-1);
    }

    static void MultiplesOfNumbers(int rangeBegin, int rangeEnd)
    {
        for(int i = rangeBegin; i<=rangeEnd; i++)
        {
            if(i%15==0)
            {
                System.out.println("AB");
            }
            else if(i%5==0)
            {
                System.out.println("B");
            }
            else if(i%3==0)
            {
                System.out.println("A");
            }
            else
                System.out.println(i);

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Fibonacci sequence
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        if(n<0)
        {
            System.out.println("Wrong number");
        }
        else {
            System.out.println("Fibbonacci Number");
            for(int i = 0; i<n; i++)
            {
                System.out.println("F"+i+" "+Fibbonacci(i));
            }

            System.out.println("Fibbonacci Number Recursive");
            for(int i = 0; i<n; i++)
            {
                System.out.println("F"+i+" "+FibbonacciRec(i));
            }
        }

        //Multiples of number. When number is multiple of 3 displaying A, when 5 displaying B, when 15 displaying AB
        System.out.println("Enter range: ");
        System.out.println("Enter begin of range: ");
        int begin = scanner.nextInt();
        System.out.println("Enter end of range: ");
        int end = scanner.nextInt();
        if(begin < 1 || end < begin)
            System.out.println("Wrong range");
        else
            MultiplesOfNumbers(begin, end);
    }
}
