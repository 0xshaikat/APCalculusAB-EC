import static java.lang.Math.cos;

public class Integration{


//implements trapezoidal algorithm
public static double integrate1(double a, double b, int intervals){
  if (b <= a){
    return 0;
  }

  double width = (b-a)/intervals;
  double area = 0;

  for (int i = 0; i<intervals; i++){
    area+= function(a + (i*width + (width/2))) * width;
  }
  return area;
}

//change to find integral of different polynomial function
public static double function(double x){
  return x*x*x + (2*x);
}

}
