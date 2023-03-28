package com.controlStatements;
//demo of continue and break
public class ContinueDemo {
    public static void main(String[] args) {
        int i;
        for (i =1; i<= 10; i++) {
            if(i==5) {
                break;
            }
            System.out.println(i);
        }
    }
}

//public class ContinueDemo {
//    public static void main(String[] args) {
//        int i;
//        for (i =1; i<= 6; i++){
//            if(i==5) {
//                break;
//            }else{
//                System.out.println(i);
//            }
//        }
//    }
//}
