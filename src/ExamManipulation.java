import java.io.File;
import java.util.ArrayList;

public class ExamManipulation {
    ArrayList<Exam> marksList;
    Exam marksdetails;


    public ExamManipulation(String roll){
        marksdetails = new Exam(roll);
    }

    public boolean check(String file){
        String filename = "../files/"+file;
        File f=new File(filename);
        if(f.exists())
            return true;
        else
            return false;
    }

    public boolean getMarks(){
        if(check("Marks")){
            marksList=Exam.get();
            return true;
        }
        else{
            marksList=new ArrayList<Exam>();
            return false;
        }
    }
    public void search_by_roll(String roll){
        getMarks();
        int count = 0 ;
        for(Exam obj:marksList){
            if(obj.getRollno().equals(roll)){
                obj.print();
                count++;
            }
        }
        if(count<1){
            System.out.println("Student not found, try adding the student");
        }
    }
}
