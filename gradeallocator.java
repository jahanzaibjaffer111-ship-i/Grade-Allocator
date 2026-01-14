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
                System.out.println("HELLO");
                System.out.println("WELCOME TO GRADE ALLOCATOR");
                System.out.println("TYPE YOUR PERCENTAGE");
                a=read.nextDouble();
                if (a>=0 && a<=100)
                {
                    if(a==100.0)
                        {
                            System.out.println("DISTINCTION");
                            System.out.println("PASS");
                        }
                    else if(a>=90)
                         {
                            System.out.println("A++");
                            System.out.println("PASS");
                         }
                    else if (a>=80)
                         {
                            System.out.println("A+");
                            System.out.println("PASS");
                         }
                    else if (a>=70)
                        {
                            System.out.println("A");
                            System.out.println("PASS");
                        }
                    else if (a>=60)
                        {
                            System.out.println("B");
                            System.out.println("PASS");
                        }
                    else if(a>=50)
                        {
                            System.out.println("C");
                            System.out.println("PASS");
                        }
                    else if (a>=40)
                        {
                            System.out.println("D");
                            System.out.println("PASS");
                        }
                    else if (a>=30)
                        {
                            System.out.println("E");
                            System.out.println("PASS");
                        }
                    else if (a>=0)
                        {
                            System.out.println("F");
                            System.out.println("FAIL");
                        }
                System.out.println("THANKS");
                System.out.println("BYE");
                System.out.println(".");
                }
                if (a<0)
                {
                    System.out.println("PERCENTAGE CANT BE NEGATIVE");
                    System.out.println("TRY AGAIN");
                    System.out.println(".");
                }
                if (a>100)
                {
                    System.out.println("PERCENTAGE CANT BE MORE THAN 100");
                    System.out.println("TRY AGAIN");
                    System.out.println(".");
                }
            }
    }
}


