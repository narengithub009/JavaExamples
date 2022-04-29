package com.java.example1;

public class NthEvenNumber {

    public static void main(String[] args) {

       int nthEvenNumber = NthEvenNumber.evenNumber(100);
       System.out.println(nthEvenNumber);
       NthEvenNumber.printEvenNumbers(100);
    }

    public static void printEvenNumbers(int n){

        for(int i=0;i<=n;i++){
            if(i%2==0) {
                System.out.print(i+" ");
            }
        }

    }
    private static int evenNumber(int i) {

        return (i-1)*2;
    }
}
