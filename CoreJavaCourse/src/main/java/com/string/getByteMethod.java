package com.string;

public class getByteMethod {
    public static void main(String[] args) {
//        String s1 = "abcdeABCD";
//        byte []by = s1.getBytes();
//        for (byte brr:by) {
//            System.out.println(brr);

            String str = new String("hello javatpoint how r u");
            char[] ch = new char[10];
            try{
                str.getChars(17, 20, ch, 0);
                System.out.println(ch);
            }catch(Exception e){
                e.printStackTrace();
            }
    }
}
