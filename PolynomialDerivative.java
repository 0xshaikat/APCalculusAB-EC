import java.util.*;
import java.lang.*;

public class PolynomialDerivative{

  public static String dx(String func){
    String f1 = func.replace("-","+-");
    String[] terms = f1.split("\\+");

    ArrayList<Double> exp = new ArrayList<Double>();
    ArrayList<Double> coeff = new ArrayList<Double>();
    ArrayList<Double> newexp = new ArrayList<Double>();
    ArrayList<Double> newcoeff =  new ArrayList<Double>();
    for (String term: terms){
      String[] parts = term.split("\\^");
      if(parts.length > 1){
        exp.add(Double.parseDouble(parts[1]));
        newexp.add(Double.parseDouble(parts[1]) - 1);
      }
      else{
        exp.add(0.0);
        newexp.add(-1.0);
      }
    }

    for (String term: terms){
      String[] co = term.split("x");
      coeff.add(Double.parseDouble(co[0]));
    }

    for (int i = 0; i<coeff.size(); i++){
      double x = coeff.get(i).doubleValue();
      double y = exp.get(i).doubleValue();
      newcoeff.add(x * y);
    }


  String s = "";

  for(int i = 0; i<coeff.size(); i++){
    s+=newcoeff.get(i).toString();
    s+= "x";
    s+= "^";
    s+= newexp.get(i);
    if (i!= coeff.size() - 1){
      s+= "+";
    }
  }

  return s;
  }

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.println("What is your function? For example, if you wanted to integrate on a quaratic polynomial, enter 2x^2+^1+5.");
    String fx = in.next();
    System.out.println("Here is the derivative: " + dx(fx));
  }




}
