import java.util.*;
import java.io.*;
public class Examfile{
  public static ArrayList<Exam> get(){
    ArrayList<Exam> list=new ArrayList<Exam>();
    try{
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("../files/Marks"));
      while(true){
        list.add((Exam)in.readObject());
      }
    }
    catch(EOFException e){
      return list;
    }
    catch(IOException e){
      System.out.print("  [*] An Error Occured While Reading the Marks.");
      System.out.println(" Please ensure that you enter names first!");
      return list;
    }
    catch(ClassNotFoundException e){
      System.out.println("*****Error ! Exam.java file is missing !*****");
      return list;
    }
  }

  public static void put(ArrayList<Exam> list){
    try{
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("../files/Marks"));
      for(Exam obj:list){
        out.writeObject(obj);
      }
    }
    catch(IOException e){
      System.out.print("  [*] An Error Occured While Reading File.");
    }
  }
}
