public class Calculator
{
  Public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);
    double a = 10.5, b = 15.5;
    System.out.println ("Please enter the calculation which needs to excecuted");
    String operation=sc.next();
    switch(operation)
    {
      case "Addition": System.out.println("THE ADDITION OF TWO NUMBER IS "+(a+b));
      break;
      case "Substraction": System.out.println("THE SUBSTRACTION OF TWO NUMBER IS "+(a-b));
      break;
      case "Multiplication": System.out.println("THE MULTIPLICATION OF TWO NUMBER IS "+(a*b));
      break;
      case "Division" : System.out.println("THE DIVISION OF TWO NUMBER IS "+(a/b));
      break;
      case "Modulus" : System.out.println("THE MOSULUS OF TWO NUMBER IS "+(a%b));
      break;
    }
   }
  }