package com.java.example2;

public class RemovetheFirstandLastCharacters {
    public static void main(String[] args) {

        String hello = RemovetheFirstandLastCharacters.removeFirstLast("adfdf");
         System.out.println(hello);
    }

    private static String removeFirstLast(String s) {
   /* String str=null;
        for(int i=0;i<s.length();i++) {
            if(s.i||s.charAt(i)==s.length()-1){
                break;
            }else{
                System.out.println(String.valueOf(s.charAt(i)));
            }

        }*/
        if(s.length()==1){
            return s;
        }else {
            return s.substring(1, s.length() - 1);
        }
    }
}
