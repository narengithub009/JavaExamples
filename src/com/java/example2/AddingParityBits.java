package com.java.example2;

public class AddingParityBits {
    public static void main(String[] args) {

        String s = String.valueOf(AddingParityBits.addParityBit("1111111"));
        System.out.println(s);

    }

    private static StringBuffer addParityBit(String s) {
        StringBuffer str=new StringBuffer(s);
       // char[] ch=s.toCharArray();
        int countOdd=0;
        int countEven=0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)== '0') {
                countEven++;
            } else {
               countOdd++;
            }
        }

        if(countEven<countOdd){

            str.append(1);
        }else{

            str.append(0);
        }
        return str;
    }

}
