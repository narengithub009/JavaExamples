package com.java.example1;

public class PersistentLittleBugger {

    public static void main(String[] args) {

        PersistentLittleBugger.findBigger(23);
    }

    private static int findBigger(int s) {
        int mul=1;
        String[] str = String.valueOf(s).split("");
        int count = 0;
        if(str.length>1){
            int len=str.length;
            for(int i=0;i<len;i++){
                //mul=mul* ((int) str[i]);

            }
            System.out.println(mul);
            //str= String.valueOf(mul);
            count++;
        }
        System.out.println(count);

        return mul;
    }

}
