package com.string.stringbuilder;

public class StringbuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello this is StringBuilder Demo ");
        System.out.println(sb);

//        sb.append("append method",0,13);
//        System.out.println(sb);

//        sb.insert(33,"and in insert method ");
//        System.out.println(sb);
//        sb.insert(sb.length(),'c');
//        System.out.println(sb);

        sb.replace(sb.length()-5,sb.length()-2,"DEM");
        System.out.println(sb);

        sb.delete(5,sb.length()-5);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.equals(" oMEDolleH");
        System.out.println(sb);

    }
}
