import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        //Program Compare the Triplets Program  Written by Suraj kamdi 
        int a_score=0, b_score=0;
        if(a0>b0){
            a_score++;
        }
        if(a1>b1){
            a_score++;
        }
        if(a2>b2){
            a_score++;
        }
         if(a0<b0){
             b_score++;
        }
         if(a1<b1){
             b_score++;
            
         }
         if(a2<b2){
             b_score++;
        }
        System.out.print(a_score+" ");
        System.out.print(b_score+" ");
    }
}
