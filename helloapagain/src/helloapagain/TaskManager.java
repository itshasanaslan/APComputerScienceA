package helloapagain;

public class TaskManager {
	
	public static String veryFirstTask = """
			Number Guesser
Goal: Combine random number generation and conditionals.

Description:

Generate a random number between 1 and 100.
Prompt the user to guess the number.
Compare the user's guess to the random number:
If the guess is equal, print: "Correct!"
If the guess is higher, print: "Too high!"
If the guess is lower, print: "Too low!"
			""";
	
	public static String task1 = """
Task 1:
Compare Two Numbers
Write a program that takes two integers as input and prints:

"The first number is greater" if the first number is larger.
"The second number is greater" if the second number is larger.
"The numbers are equal" if both numbers are the same.
			""";
	
	public static String task2 = """
			Task 2:
Positive, Negative, or Zero
Write a program that takes an integer as input and prints whether the number is:

"Positive"
"Negative"
"Zero"
			""";
	
public static String task3 = """

Task 3: Leap Year Checker
Write a program that takes a year as input and prints:

"Leap year" if the year is divisible by 4 but not divisible by 100, or if it is divisible by 400.
"Not a leap year" otherwise.""";

public static String task4 = """ 
Task 4: Powers Table
Write a program to calculate the squares and cubes of a given number.
example calculate(20);
print the square and cube of every number from 2 to 20

""";

public static String task5 = """

Task 5: Temperature Check
Write a program that takes a temperature in degrees Celsius as input and prints:

"Hot" if the temperature is greater than 30.
"Cold" if the temperature is less than 15.
"Warm" if the temperature is between 15 and 30 (inclusive).

""";

public static String advancedTask1 = """
		Discount Calculator
Write a program that takes the total purchase amount as input and calculates a discount:
If the amount is greater than $100, apply a 20% discount.
Otherwise, no discount.
Print the final amount after applying the discount.
		""";

public static String dataTypeAllocations = """
byte	8	0	-128 to 127
short	16	0	-32,768 to 32,767
int	32	0	-2³¹ to 2³¹-1
long	64	0L	-2⁶³ to 2⁶³-1
float	32	0.0f	~7 decimal places
double	64	0.0d	~15 decimal places
char	16	'\u0000'	Unicode characters (0 to 65,535)
boolean	1 (JVM dependent)	false	true or false
""";

	public static void assign(String task) {
		System.out.println(task);
	}
	
	public static void showDataAllocations() {
		System.out.println(dataTypeAllocations);
	}
	
}
