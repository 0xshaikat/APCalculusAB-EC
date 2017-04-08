import java.util.*;

public class Driver{

public static void main(String[] args){

Scanner in = new Scanner(System.in);

System.out.println("What is the lower bound?");
double a = in.nextDouble();

System.out.println("What is the upper bound?");
double b = in.nextDouble();

System.out.println("How many intervals would you like to use?");
int c = in.nextInt();

double area = Integration.integrate1(a,b,c);

System.out.println("Area: " + area + " units squared");

}

}
