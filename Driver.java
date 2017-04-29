import java.util.*;

public class Driver{

  public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    System.out.println("What is your function? For example, if you wanted to integrate on a quadratic polynomial, enter 2x^2+4x^1+5. For terms with coefficient of 1, please add 1 before the variable.");
    String fx = in.next();

    System.out.println("What is the lower bound?");
    double a = in.nextDouble();

    System.out.println("What is the upper bound?");
    double b = in.nextDouble();

    System.out.println("How many intervals would you like to use?");
    int c = in.nextInt();

    double area = Integration.integrate1(fx,a,b,c);


    System.out.println("Area: " + area + " units squared");




    System.out.println("Would you like the derivative? 1=yes,0=no");
    int bool = in.nextInt();
    if(bool == 1){
      System.out.println("Derivative: " + PolynomialDerivative.dx(fx));
    }
    else if(bool == 0){
      System.out.println("Ok.");
    }
    else{
      System.out.println("Did not register as a response.");
    }


  }

}
