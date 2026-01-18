import java.util.Scanner;
public class gradeallocator
{
    public static void main(String[] args)
    {
        double a;
        Scanner read=new Scanner(System.in);
        while(true)
        /*100=distinction
          90-99=A++
          80-89=A+
          70-79=A
          60-69=B
          50-59=C
          40-49=D
          30-39=E
          0-29=F*/
            {
                System.out.println("Hello");
                System.out.println("Welcome to Grade Allocator");
                System.out.println("Type your percentage");
                a=read.nextDouble();
                if (a>=0 && a<=100)
                {
                    if(a==100.0)
                        {
                            System.out.println("Distinction");
                            System.out.println("Pass");
                        }
                    else if(a>=90)
                         {
                            System.out.println("A++");
                            System.out.println("Pass");
                         }
                    else if (a>=80)
                         {
                            System.out.println("A+");
                            System.out.println("Pass");
                         }
                    else if (a>=70)
                        {
                            System.out.println("A");
                            System.out.println("Pass");
                        }
                    else if (a>=60)
                        {
                            System.out.println("B");
                            System.out.println("Pass");
                        }
                    else if(a>=50)
                        {
                            System.out.println("C");
                            System.out.println("Pass");
                        }
                    else if (a>=40)
                        {
                            System.out.println("D");
                            System.out.println("Pass");
                        }
                    else if (a>=30)
                        {
                            System.out.println("E");
                            System.out.println("Pass");
                        }
                    else if (a>=0)
                        {
                            System.out.println("F");
                            System.out.println("Fail");
                        }
                System.out.println("Thanks");
                System.out.println("Bye");
                System.out.println(".");
                }
                if (a<0)
                {
                    System.out.println("Percentage can't be negative");
                    System.out.println("Try again");
                    System.out.println(".");
                }
                if (a>100)
                {
                    System.out.println("Percentage can't be more than 100");
                    System.out.println("Try again");
                    System.out.println(".");
                }
            }
    }
}
