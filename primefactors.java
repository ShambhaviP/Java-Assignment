/**
 * Created by shambhap on 20/08/15.
 */


import java.io.*;
public class primefactors {

     public  static void main(String args[])throws IOException
     {


         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int n=Integer.parseInt(br.readLine());
         generate(n);
     }

    private static void generate(int n) {

        for(int i=2;i<n;i++)
        {
            if(n%i==0)

            {int count=0;
              for(int j=2;j<i;j++)
              {
                if(i%j==0) count++;

              }
           if(count>0){
               continue;
           }else System.out.println(i);
            }
        }






    }


}
