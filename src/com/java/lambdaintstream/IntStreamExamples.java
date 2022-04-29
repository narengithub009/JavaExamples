package com.java.lambdaintstream;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamExamples {

    public static void main(String[] args) {

        for(int n=1;n<=5;n++){
            if(n%2==0){
                System.out.println(n);
            }
        }

       // IntStream intStream=IntStream.of(1,2,3,4,5,6);
        IntStream intStream1=IntStream.range(1,6);
        IntStream intStream2=IntStream.of(new int[]{1,2,3,4,5,6});
        intStream2.forEach(System.out::println);

        System.out.println("Finding even numbers using Lambdas");

        //IntStream.range(1,10).filter(n->n%2==0).forEach(System.out::println);
       // IntStream.of(1,2,3,4,5,6,7,8,9).filter(n->n>4).filter(x->x%2==0).forEach(System.out::println);

     /*   int sum=IntStream.of(new int[]{12,23,34,45,56}).filter(n->n>23).sum();
        System.out.println("The sum is : "+sum);

        OptionalInt max1=IntStream.of(12,23,4,56,567).max();
        System.out.println(max1.getAsInt());

        long count=IntStream.of(12,23,4,56,567,32).count();
        System.out.println("The count is :"+count);

        OptionalDouble avg=IntStream.of(12,23,4,56,3).average();
        System.out.println("Average is : "+avg.getAsDouble());*/

        OptionalInt findAny=IntStream.of(2,33,43,44,21,22).findFirst();
        System.out.println(findAny.getAsInt());

        boolean anyRecordGreaterThan = IntStream.of(2,3,4,4,3,2,1).anyMatch(n->n>2);
        System.out.println(anyRecordGreaterThan);
        boolean allMatch=IntStream.of(12,3,4,3,2,1).allMatch(n->n>2);
        System.out.println(allMatch);

        boolean nonMatch=IntStream.of(2,3,1,2,3,4).noneMatch(n->n>5);
        System.out.println(nonMatch);

        long count1=IntStream.of(1,2,3,5,5,6,8).filter(n->n>2).count();
        System.out.println(count1);

        System.out.println("***************************");

        int sum = IntStream.of(1,2,3,4).reduce(10,(x,y)->x+y);
        System.out.println(sum);
    }
}
