/**
 * Created by shambhap on 20/08/15.
 */
public class fizzbuzzgame {



    public static void main(String args[])
    {
        FizzBuzz();









    }

    private static void FizzBuzz() {

        for(int i=0;i<100;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            }
             else if(i%3==0)System.out.println("Fizz");
            else if(i%5==0)System.out.println("Buzz");
            else System.out.println(i);

            }

        }
    }



