import java.util.Scanner;
class calculator{
	public static void main(String[] args){
		char operator;
		Double number1,number2,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter operator(either +,-,* or /):");
		operator=sc.next().charAt(0);
		System.out.println("Enter number1 and number2 respectively:");
		number1=sc.nextDouble();
		number2=sc.nextDouble();
		switch(operator){
			case '+':
				result=number1+number2;
				System.out.println(number1 + "+" +number2 + "=" +result);
				break;
			case '-':
				result=number1+number2;
				System.out.println(number1 + "-" +number2 + "=" +result);
				break;
			case '*':
				result=number1+number2;
				System.out.println(number1 + "*" +number2 + "=" +result);
				break;
			case '/':
				result=number1+number2;
				System.out.println(number1 + "/" +number2 + "=" +result);
				break;
			default:
				System.out.println("Invaild operator!");
				break;
			}
	}
}