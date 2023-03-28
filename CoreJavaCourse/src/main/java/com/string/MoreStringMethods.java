package com.string;

public class MoreStringMethods {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello").intern();
//        System.out.println(s1==s2);

        String joinString =   String.join(" - "," Hello "," Abhishek ", "Talkokul");
//        System.out.println(joinString);

//        String s3 = "ABCDA";
//        System.out.println(s3.lastIndexOf("B",3));
//        System.out.println(s3.replace('A','X'));
//        System.out.println(s3.equalsIgnoreCase(s3.replace('a','x')));

//        String s4 = "hellocthisciscabhishekcvyankateshctalkokul";
//        String []newstring =s3.split("c",20);
//        for (String str:newstring) {
//            System.out.println(str);
//        }

//        String s5 = "hello this is abhishek vyankatesh talkokul";
//        String s6 = s5.substring(6);
//        System.out.println(s6);

//        String s6 = "  Hello this is Java";
//        System.out.println(s6);
//        System.out.println(s6.trim());

          int a= 12;
          String no= String.valueOf(a);
        System.out.println(no+12);

    }
}

