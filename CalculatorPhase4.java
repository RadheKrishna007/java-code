import java.util.Scanner;

public class CalculatorPhase4 {

	public float sum(float b, float c)
	{
		return b+c;
	}

	public float subtract(float b, float c)
	{
	 return b-c;
	}
	
	public float divide(float b, float c)
	{
		return b/c;
	}
	
	public float multiply(float b, float c)
	{
	 return b*c;
	}
	
	public float fnum()
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("enter your number");
		float a = sc.nextFloat();
		return a;
	}
	
	public float snum()
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("enter your number");
		float a = sc.nextFloat();
		return a;
	}
	
	public int select() {
        Scanner input = new Scanner(System.in);

        int choose = input.nextInt();
        switch (choose) { 
        case 1:
        	System.out.println("addition");
            break;
        case 2:
        	System.out.println("subtraction");
            break;
        case 3:
        	System.out.println("division");
            break;
        case 4:
        	System.out.println("multiplication");
            break;
        default:
            System.out.println("Illegal Operation");

        } 

        return choose;
    }
	
	public float calculation(int choose, float n1, float n2) {
        float result;
        if (choose == 1)
           result = sum(n1,n2);
        else if (choose == 2)
           result = subtract(n1,n2);
        else if (choose == 3)
            result = divide(n1,n2);
        else
            result = multiply(n1,n2);

        return result;
    }
	
	public static void main(String args[])
	{
	//	String operation = "add";
		
		CalculatorPhase4 obj = new CalculatorPhase4();
		float a = obj.fnum();
		System.out.println("for addition press 1");
		System.out.println("for subtraction press 2");
		System.out.println("for division press 3");
		System.out.println("for multiplication press 4");
		int operator = obj.select();
		float b = obj.snum();
		float result = obj.calculation(operator, a, b);
		System.out.println(result);
		while(true)
		{
			b = obj.snum();
			System.out.println("for addition press 1");
			System.out.println("for subtraction press 2");
			System.out.println("for division press 3");
			System.out.println("for multiplication press 4");
			operator = obj.select();
			result = obj.calculation(operator, result, b);
			System.out.println(result);
		}
			
		
	}

}
