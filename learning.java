import java.util.Scanner;
public class learning
{
	public static void main(String[] args)
	{
		System.out.println("Monu choudhary");
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//	Data Type:					Default sizei		value-range
		boolean	bl = true;		//	1 bit			its "size" can't be defined precisely.
		char	ch = 'A';		//	2 byte			0 to 65,535 or '\u0000' to '\uffff'
		byte	bt = 10;		//	1 byte			-128 to 127	
		short	st = 10000;		//	2 byte			-32,768 to 32,767
		int		it = 100000;	//	4 byte			2,147,483,648(-2^31) to 2,147,483,647(2^31 -1)
		long	lg = 100000L;	//	8 byte			-9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)
//													values of long:  minimum = -9,223,372,036,854,775,808 and maximum = 9,223,372,036,854,775,807. 		
		float	ft = 234.5f;	//	4 byte			
		double	db = 12.3;		//	8 byte		


//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Output:	
//		System.out.println(ft);

//Note:
//		double db2 = 100 / 3.0; // int/double == double
//		int a = 1.4455; wrong
//		int db2 = 100 / 3.0; wrong
//		System.out.println(db2);
//		System.out.println(bl + "db2 + ch + targate multiple lines " + bl);//



//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Input
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter name, age and weight");
//		String name = sc.nextLine();
//		int age = sc.nextInt();
//		float weight = sc.nextFloat();
//
//		System.out.println(name + " " +  age + " " + weight);



//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//operator conditonal:-> !=, ==, <=, >=, <, > ans logical:-> &&, ||, !
//		String name1 = "Monu";
//		short age = 21;
//
//		String boy_or_men = (name1 == "Monu" && age < 18) ? "boy" : "man";//(age < 18) ? System.out.println("boy") : System.out.println("man"); wrong
//		System.out.println(boy_or_men);



//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//switch case
//		char grade = 'A';
//		switch(grade)
//		{
//			case 'A': 
//				System.out.println("Your grade is very good");
//				break;
//			case 'B':
//				System.out.println("Your grade is medium");
//			case 'C':
//				System.out.println("Your grade is very poor");
//			default:
//				System.out.println("Your grade is not found");
//		}



//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//loops		
//		int i;
//		for(i = 0; i < 10; i++) System.out.println("Monu Chudhary");
//		do(i < 20)
//		{
//			 System.out.println("age 21");
//			 i++;
//		}while(i < 20);


//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Arrays:
//		int marks[] = new int[5];//int marks[] = {99, 98, 97, 96, 95};
//		for(int i = 0; i < marks.length; i++) marks[i] = 99 - i;
//		for(int i = 0; i < 5; i++) System.out.println(marks[i]);

//		int class_point[][] = new int[2][3];
//		int class_point[][] = {
//								{1, 2},
//								{3, 4}
//							  };
//		System.out.println(class_point[0][1]);


//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Methoeds calling:
		int firstNum; firstNum = sc.nextInt();
		int secondNum; secondNum = sc.nextInt();
		average(firstNum, secondNum);
//		int avg = average(firstNum, secondNum);
//		System.out.println("\n" + avg);


//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Exception handeling:
		int arr[] = new int[3];
		try
		{
			System.out.println(2/0);
			System.out.println(2/arr[4]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("error aaiya thai: " + e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("error aaiya thai: " + e);
		}
		catch(Exception e)
		{
			System.out.println("error aaiya thai: " + e);
		}

		System.out.println("neche k line");

	}

//==================================================================================================================================================================================
// Mathoeds:-
//	returnType functionName(arguments){}
	
	static void average(int firstNum, int secondNum)
	{
	//	return (firstNum + secondNum)/2;	
	}

}




















