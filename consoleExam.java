import java.io.Console;
class ConsoleExam{
	public static void main(String[] args){
		System.out.println("Using console");
		Console con=System.console();
		if(con!=null){
			con.printf("Enter your name");
			String name=con.readLine();
			con.printf("Hello,%s!%n",name);
			}
		else{
			System.out.println("console not available");
			}
		}
}