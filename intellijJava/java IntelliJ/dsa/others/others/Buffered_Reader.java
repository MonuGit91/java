package dsa.others.others;

import java.io.*;
//--------or---------
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;


public class Buffered_Reader {
    static public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String arg[]) throws IOException{
//-------------------String array Input----------------------------
        String [] arr = br.readLine().trim().split("[ ]");

        for(String s : arr) {
            System.out.println(s);
        }

        System.out.println(arr[0].charAt(0));


//-----------------String input---------------------------------
        String str = br.readLine();
        System.out.println(str);


//------------------Integer input-----------------------------
        int Int = Integer.parseInt(br.readLine());
        System.out.println(Int);

        int val = Integer.parseInt(arr[0]);//arr[0] must be like "111", "23" etc.
        System.out.println(val);

        int a = Integer.parseInt("1234");
        System.out.println(a);


//------------------Float input------------------------------
        float f = Float.parseFloat(br.readLine());
        System.out.println(f);
    }
}
