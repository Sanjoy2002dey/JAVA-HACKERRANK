package Solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class EOF_solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i = 0;
        while (sc.hasNextLine()) {
            System.out.println(++i + " " + sc.nextLine());
        }
    }
}
