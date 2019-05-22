package Simple;
class S1
{
public void arithDouble(double a, double b)
{
System.out.println("In arithDouble method");
double sum= a+b;
System.out.println("sum of two variables is : " +sum);
double sub= a-b;
System.out.println("substraction of two variables is : " +sub);
double mul= a*b;
System.out.println("multiplication of two variables is : " +mul);
System.out.println("Out arithDouble method");

}

public static void main (String[] args)
{
System.out.println("In main");
S1 d= new S1();
d.arithDouble(93.7,89.60);
System.out.println("Out main");

}
}