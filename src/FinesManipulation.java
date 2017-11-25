import java.io.File;
import java.util.ArrayList;

public class FinesManipulation {
    ArrayList<StudentFines> finesList;
    StudentFines finesdetails;

    public FinesManipulation(){
        finesdetails = new StudentFines();
    }

    public FinesManipulation(String roll){
        finesdetails = new StudentFines(roll);
    }

    public boolean check(String file){
        String filename = "../files/"+file;
        File f=new File(filename);
        if(f.exists())
            return true;
        else
            return false;
    }

    public boolean getStudentFines(){
        if(check("Fines")){
            finesList=StudentFines.get();
            return true;
        }
        else{
            finesList=new ArrayList<StudentFines>();
            return false;
        }
    }
    public void search_by_roll(String roll){
        getStudentFines();
        int count = 0 ;
        for(StudentFines obj:finesList){
            if(obj.getRollno().equals(roll)){
                obj.print_fine();
                count++;
            }
        }
        if(count<1){
            System.out.println("Student not found, try adding the student");
        }
    }
}


