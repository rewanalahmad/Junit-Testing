package com.example.junittesting;

public class Calculaterserver {
    public int addnumbers( int... numbers){
        int sum=0;
        for (int n :numbers){
            sum +=n; }
        return sum; }

public int getQuotient(int division , int divisor){
    int quatint=0;
    if (divisor ==0){
        throw new ArithmeticException("divisor cant be 0 for division"); }
    quatint=division/divisor;
    return quatint;}

public int getRemainder(int division , int divieor){
        int remainder=0;
        if (divieor==0){
            throw new ArithmeticException("divisor cant be zero for division");
        }
        remainder=division%divieor;
        return remainder;
}




}
