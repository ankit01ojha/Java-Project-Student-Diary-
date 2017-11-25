import java.util.*;
import java.io.*;

public class Attendancefile {
    public static ArrayList<Attendance> get(){
        ArrayList<Attendance> list=new ArrayList<Attendance>();
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("../files/Attendance"));
            while(true){
                list.add((Attendance) in.readObject());
            }
        }
        catch(EOFException e){
            return list;
        }
        catch(IOException e){
            System.out.print("  [*] An Error Occured While Reading the Attendance.");

            return list;
        }
        catch(ClassNotFoundException e){
            System.out.println("*****Error ! Attendance.java file is missing !*****");
            return list;
        }
    }

    public static void put(ArrayList<Attendance> list){
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("../files/Attendance"));
            for(Attendance obj:list){
                out.writeObject(obj);
            }
        }
        catch(IOException e){
            System.out.print("  [*] An Error Occured While Reading File.");

        }
    }
}

