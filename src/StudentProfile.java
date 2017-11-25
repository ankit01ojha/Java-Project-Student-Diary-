import java.util.*;

public class StudentProfile{

	public String roll;

	StudentProfile(String roll){
		this.roll = roll;
		displayProfile(roll);
	}

	public void displayProfile(String roll){
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
		StudentManipulation sm = new StudentManipulation();
        sm.search_by_roll(roll);
			
	}
}