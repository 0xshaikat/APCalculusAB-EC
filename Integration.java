import static java.lang.Math.*;
import java.lang.*;
import java.util.*;
public class Integration{


  //implements trapezoidal algorithm
  public static double integrate1(String fx, double a, double b, int intervals){

    double width = (b-a)/intervals;
    double area = 0;

    for (int i = 0; i<intervals; i++){
      area+= function(a + (i*width + (width/2)), fx) * width;
    }

    return area;
  }

  //change to find integral of different polynomial function
  public static double function(double x, String func){

    //double x1 = Math.toRadians(x);
    //double x2 = Math.cos(x1);
    String f1 = func.replace("-","+-");
    String[] terms = f1.split("\\+");

    ArrayList<Double> exp = new ArrayList<Double>();
    ArrayList<Double> coeff = new ArrayList<Double>();

    for (String term: terms){
      String[] parts = term.split("\\^");
      if(parts.length > 1){
        exp.add(Double.parseDouble(parts[1]));
      }
      else{
        exp.add(0.0);
      }
    }

    for (String term: terms){
      String[] co = term.split("x");
      coeff.add(Double.parseDouble(co[0]));
    }

    double y = 0;
    for (int i=0; i<coeff.size(); i++){
      y += Math.pow((coeff.get(i) * x), exp.get(i));
    }

    return y;

  }

}
