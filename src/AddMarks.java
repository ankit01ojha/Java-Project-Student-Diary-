import java.util.*;

public class AddMarks{
  public Exam newmarks;
  public ArrayList<Exam> marksList = new ArrayList<Exam>();

  AddMarks(String roll){
    newmarks=new Exam(roll);
    newmarks.setDetails();
  }

  AddMarks(Exam e){
    newmarks=e;
  }

  public void Add(String roll){
          marksList.add(newmarks);
          Exam.put(marksList);


    }
  }

