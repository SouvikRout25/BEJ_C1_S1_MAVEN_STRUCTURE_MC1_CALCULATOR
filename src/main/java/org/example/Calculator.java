package org.example;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
    public int modulo(int a, int b){
        if(a<b){
            throw new ArithmeticException();
        }
        return a%b;
    }
}
