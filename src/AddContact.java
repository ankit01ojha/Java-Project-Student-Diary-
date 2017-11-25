import java.util.*;
import java.io.*;

public class AddContact
{
    public Contact newcontact;
    public ArrayList<Contact> contactList = new ArrayList<Contact>();

    AddContact(String roll){
        newcontact=new Contact();
        newcontact.setDetails();
    }

    AddContact(Contact c){
        newcontact=c;
    }

    public void Add(String roll){
        contactList.add(newcontact);
        Contact.put(contactList);


    }
}

