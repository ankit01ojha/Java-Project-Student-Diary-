import java.io.File;
import java.util.ArrayList;

public class ContactManipulation {
    ArrayList<Contact> contactList;
    Contact contactdetails;

    public ContactManipulation(){
        contactdetails = new Contact();
    }

    public ContactManipulation(String roll){
        contactdetails = new Contact(roll);
    }

    public boolean check(String file){
        String filename = "../files/"+file;
        File f=new File(filename);
        if(f.exists())
            return true;
        else
            return false;
    }

    public boolean getContact(){
        if(check("Contacts")){
            contactList=Contact.get();
            return true;
        }
        else{
            contactList=new ArrayList<Contact>();
            return false;
        }
    }
    public void search_by_roll(String roll){
        getContact();
        int count = 0 ;
        for(Contact obj:contactList){
            if(obj.getRollno().equals(roll)){
                obj.print_contact();
                count++;
            }
        }
        if(count<1){
            System.out.println("Student not found, try adding the student");
        }
    }
}


