
package math;

import java.util.Scanner;

public class Student_Result {
	
	int marks;
	Scanner s = new Scanner(System.in);
	
	void Result() {
		
		System.out.print("Enter Marks=");
		marks = s.nextInt();
		String Res = marks>=40 ? "Result is Pass" : " Result is Fail" ;
		System.out.print(Res);
		
	}
	public static void main(String[] args) {
    	
    	Student_Result m = new Student_Result();
    	m.Result();
    	
    }
}
