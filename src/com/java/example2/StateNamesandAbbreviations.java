package com.java.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateNamesandAbbreviations {
    public static void main(String[] args) {

        List abbs = StateNamesandAbbreviations.filterStateNames(new String[]{"MT", "NJ", "TX", "ID", "IL"}, "abb");
        abbs.stream().forEach(System.out::println);

    }

    private static List<String> filterStateNames(String[] strings, String str) {
        List<String> res=new ArrayList<>();
        if(str.equals("abb")){
            System.out.println(strings.length);
            for(int i=0;i<strings.length;i++){
                if(strings[i].length()<=2){

                    res.add(strings[i]);
                }

            }

        }if(str.equals("full")){
            System.out.println(strings.length);
            for(int i=0;i<strings.length;i++){
                if(strings[i].length()>2){

                    res.add(strings[i]);
                }

            }

        }
        return res;
    }
}
