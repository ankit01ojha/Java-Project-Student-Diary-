import java.util.*;
import java.io.*;

public class FineFiles {
    public static ArrayList<StudentFines> get(){
        ArrayList<StudentFines> list = new ArrayList<StudentFines>();
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("../files/Fines"));
            while(true){
                list.add((StudentFines) in.readObject());
            }
        }
        catch(EOFException e){
            return list;
        }
        catch(IOException e){
            System.out.print("  [*] An Error Occured While Reading the Fines.");

            return list;
        }
        catch(ClassNotFoundException e){
            System.out.println("*****Error ! Fines.java file is missing !*****");
            return list;
        }
    }

    public static void put(ArrayList<StudentFines> list){
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("../files/Fines"));
            for(StudentFines obj:list){
                out.writeObject(obj);
            }
        }
        catch(IOException e){
            System.out.print("  [*] An Error Occured While Reading File.");

        }
    }
}

