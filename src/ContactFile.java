import java.util.*;
import java.io.*;

public class ContactFile {
    public static ArrayList<Contact> get(){
        ArrayList<Contact> list=new ArrayList<Contact>();
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("../files/Contacts"));
            while(true){
                list.add((Contact) in.readObject());
            }
        }
        catch(EOFException e){
            return list;
        }
        catch(IOException e){
            System.out.print("  [*] An Error Occured While Reading the Contact.");

            return list;
        }
        catch(ClassNotFoundException e){
            System.out.println("*****Error ! Contact.java file is missing !*****");
            return list;
        }
    }

    public static void put(ArrayList<Contact> list){
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("../files/Contacts"));
            for(Contact obj:list){
                out.writeObject(obj);
            }
        }
        catch(IOException e){
            System.out.print("  [*] An Error Occured While Reading File.");

        }
    }
}

