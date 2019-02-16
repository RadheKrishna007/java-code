import java.util.Scanner;

public class CalculatorPhase4 {

	public static float sum(float b, float c)
	{
		return b+c;
	}

	public static float subtract(float b, float c)
	{
	 return b-c;
	}
	
	public static float divide(float b, float c)
	{
		return b/c;
	}
	
	public static float multiply(float b, float c)
	{
	 return b*c;
	}
	
	public static float fnum()
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("enter your number");
		float a = sc.nextFloat();
		return a;
	}
	
	public static float snum()
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("enter your number");
		float a = sc.nextFloat();
		return a;
	}
	
	public static int select() {
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
            System.out.println("Operation Not Available");

        } 

        return choose;
    }
	
	public static float calculation(int choose, float n1, float n2) {
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
		
	//	CalculatorPhase4 obj = new CalculatorPhase4();
		float a = fnum();
		System.out.println("for addition press 1");
		System.out.println("for subtraction press 2");
		System.out.println("for division press 3");
		System.out.println("for multiplication press 4");
		int operator = select();
		float b = snum();
		float result = calculation(operator, a, b);
		System.out.println(result);
		while(true)
		{
			b = snum();
			System.out.println("for addition press 1");
			System.out.println("for subtraction press 2");
			System.out.println("for division press 3");
			System.out.println("for multiplication press 4");
			operator = select();
			result = calculation(operator, result, b);
			System.out.println(result);
		}
			
		
	}

}
