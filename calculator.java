/* Welcome dear young programmer, to an interesting world of programming basically object oriented using java
 * first and foremost, java programming is simple,useful and at the same time practical   
 * Using the example of code below, we shall learn how to design a simple calculator that does basic mathematical operation
 * 
 * */



package coursework;
//we import a java utility called "Scanner" to enable user input
import java.util.Scanner;
/*java programming is based on objects or things whose properties and attributes are stored in a class*/
public class calculator {
	// below is the main method in which we write all our codes
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	//"System.out.println" displays text on a console
	System.out.println("Enter any two numbers of your choice: ");
	// nextDouble() reads the next double from the keyboard
	// double is called a variable and assigning a value to a variable is called variable declaration
	double first = reader.nextDouble();
	double second = reader.nextDouble();
	System.out.println("Enter an operator (+, -, *, /): ");
	char operator = reader.next().charAt(0);
	double result;
	//next, we use switch statements to program each mathematical operation
	// 
	switch(operator)
	{
	//addition,"+"
	case '+':
	result = first + second;
	break;
	//subtraction, "-"
	case '-':
	result = first - second;
	break;
	//multiplication, "*"
	case '*':
	result = first * second;
	break;
	// division, "/"
	case '/':
	result = first / second;
	break;
	//and if operator doesn't match any case constant (+, -, *, /) we proceed with the code below
	 
	 
	default:
	System.out.printf("Error! operator is not correct");
	return;
	}
	//printing the result of the operations
	System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
	}
	}

/*Hope you have enjoyed the session and will try this code out on eclipse IDE
 * thank you!
 * enjoy programming*/
