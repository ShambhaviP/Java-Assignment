/**
 * Created by shambhap on 06/08/15.
 */

import java.io.*;


public class test2{
    public static void main(String args[]) throws IOException


    {
        int i,n=0;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of n");
        n=Integer.parseInt(br.readLine());
        for(i=0;i<n;i++) {
            System.out.print("*");
        }

    }
}
