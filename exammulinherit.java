interface exam{
	void allowexam();
}
interface attendance{
	boolean hasrequiredattendance();
}
class student implements exam,attendance{
	int attend;
	String name;
	student(String name,int attendance){
		this.attend=attendance;
		this.name=name;
		//The (this) keyword refers to the current object in a method or constructor.
		//The most common use of the (this) keyword is to eliminate the confusion between class attributes and parameters with the same name
		}
public boolean hasrequiredattendance(){
	return attend>=75;
}
public void allowexam(){
	if(hasrequiredattendance()){
		System.out.println(name+"is allowed for exam");
	}
	else{
		System.out.println(name+"is not allowed for exam");
	}
}
}
public class exammulinherit{
	public static void main(String[] args){
		student s1=new student("xyz",65);
		s1.allowexam();
		student s2=new student("Anurag",90);
		s2.allowexam();
	}
}
