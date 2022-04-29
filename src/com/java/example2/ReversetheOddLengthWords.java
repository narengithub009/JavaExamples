package com.java.example2;

import java.util.ArrayList;
import java.util.List;

public class ReversetheOddLengthWords {
    public static void main(String[] args) {
        List<String> rev = ReversetheOddLengthWords.reverseOdd("One two three four");
        rev.stream().forEach(System.out::println);
    }

    private static List<String> reverseOdd(String str) {


        List<String> list=new ArrayList<>();

      String[] str1=str.split(" ");

      for(int j=0;j<=str1.length-1;j++) {

          if (str1[j].length() % 2 == 0) {

              list.add(str1[j]);
          } else {

               StringBuffer revv=new StringBuffer(str1[j]);
                  list.add(String.valueOf(revv.reverse()));
          }
      }
        return list;
    }
}
