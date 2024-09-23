public class Main
{
  public static void main(String[] args)
  {
    double SomeDist = distFormula(0, 5, 0, 0);
    System.out.println(SomeDist);
  }

  public static double distFormula(double x1, double y1, double x2, double y2)
  {
    double dist = Math.sqrt((x1 - x2)*(x1-x2) + (y1 - y2)*(y1 - y2));
    return dist;
  }

  public static double quadFormulaPositive(double a, double b, double c)
  {
    double D = Math.sqrt(b*b - 4*a*c);
    return(-b + D) / (2*a);
  }

  public static double quadFormulaNegative(double a, double b, double c)
  {
    double X = Math.sqrt(b*b - 4*a*c);
    return(-b - X) / (2*a);
  }
}

