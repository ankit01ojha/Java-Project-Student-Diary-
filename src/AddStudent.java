
public class AddStudent extends StudentManipulation{
	public AddStudent(String roll){
		super(roll);
	}

	public AddStudent(){
		super();
	}

	public void Add(){
		stdetails.setDetails();
		if(getStudents()){
			if(StudentDetails.check(stdetails)){
        	System.out.println("Student Exists !");
        	return;
		}
	}
	stList.add(stdetails);
    StudentDetails.put(stList);
}
}