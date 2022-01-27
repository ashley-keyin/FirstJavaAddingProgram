import java.util.*;


public class First
{

   //attributes (variable, properties fields)
   //methods (behavior)

  public static void main(String[] args) {
    
    int num1,num2,sum;
    num1 = 10; //primative datatype
    num2 = 20;

      System.out.println("Enter first number: ");
      System.out.println("Enter second number: ");

      
      //Reference data type
      Scanner Sc = new Scanner(System.in);

      num1 = Sc.nextInt();
      num2 = Sc.nextInt();

      sum = num1 + num2;

      System.out.printf("sum = %d\n",sum);

    



  }
}