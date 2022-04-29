package com.java.example2;

public class SwappingTwobyTwo {

    public static void main(String[] args) {

       SwappingTwobyTwo.swapTwo("ABCDEFGH");

    }

    private static char[] swapTwo(String str) {
    char s[]=new char[str.length()];
        if(!str.equals("")){

        for(int i=0;i<=str.length()-1;i++){
           s[i]= (char) (str.charAt(i)+str.charAt(i+1));
            i=i+1;
            //System.out.println(s[i]);
        }
        }
        for(char str1:s){
            System.out.println(str1);
        }
        return s;
    }
}
