package Solutions;

import java.io.*;
import java.util.*;

public class JAVA_str_REV {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();


        if(A.equalsIgnoreCase(new StringBuffer(A).reverse().toString()))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
