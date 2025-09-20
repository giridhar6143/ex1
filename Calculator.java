class Calculator
{
	public int add (int a ,int b)
	{
		return a+b;
	}
	public int sub (int a ,int b)
	{
		return a-b;
	}
	public int mul (int a ,int b)
	{
		return a*b;
	}
	public int div (int a ,int b)
	{
		{
			if (b==0)
			throw new ArithmeticException ("Can't divide by Zero");
	}
	    return a+b;
	}
public static void main(String args [])
{
     Calculator calc = new Calculator();
	System.out.println("Addition: " +calc.add(10,20));
	System.out.println("Subtraction :"+calc.sub(10,20));
	System.out.println("Multiplication:" +calc.add(10,20));
	System.out.println("Division "+calc.add(10,20));
}
}
