import java.util.*;
class mularr{
 public static void main(String[] arr){
	int marks[][]=new int[10][2];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter roll number and marks");
	for(int i=0;i<marks.length;i++){
	System.out.println("roll no");
	marks[i][0]=sc.nextInt();
	System.out.println("marks");
	marks[i][1]=sc.nextInt();
}
 for(int j=0;j<marks.length;j++){
 System.out.println("roll no\t"+marks[j][0]+"marks"+marks[j][1]);
}
}
}