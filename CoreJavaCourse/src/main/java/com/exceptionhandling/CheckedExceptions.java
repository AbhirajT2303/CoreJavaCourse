package com.exceptionhandling;
import java.io.*;

public class CheckedExceptions {

        public static void main(String[] args) {

            InputStream is = null;
            InputStreamReader isr = null;
            BufferedReader br = null;
            try {
                is = new FileInputStream("c:/test.txt");//compile time exception
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);
                br.readLine();//compile time exception
            } catch (FileNotFoundException e) {
                System.out.println("Error");
            }catch (IOException e) {
                System.out.println("Error 2");
            }
        }
}