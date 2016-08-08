import java.util.Scanner;


public class Test {

	public static void main(String[] args) 
	{ 
		
			    int number1;
			    int number2;
			    int  f;
			    int i;
			    System.out.println("Enter two number1  &   number2 :");
			     Scanner s=new Scanner(System.in);
			    int a=s.nextInt();
			    int b=s.nextInt();
			    while (a < b)
			    {
			        f=1;

			        for(i=2; i<=a/2; ++i)
			        {
			            if(a%i == 0)
			            {
			                f=0;
			                break;
			            }
			        }

			        if (f == 1)
			            System.out.println(a);

			        ++a;
			    }

			  
			}
		}    
