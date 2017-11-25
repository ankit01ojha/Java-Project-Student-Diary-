import java.util.ArrayList;

public class ExamInfo{
	public String roll;

	ExamInfo(String roll){
		this.roll = roll;
		displaymarks(roll);
	}

	public void displaymarks(String roll){
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
		ExamManipulation sm = new ExamManipulation(roll);
		sm.search_by_roll(roll);

	}
}