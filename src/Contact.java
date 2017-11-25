
import java.util.*;
import java.io.*;

public class Contact extends ContactFile implements Serializable{
    String address;
    int phone;
    String roll;

    Contact(){
        address="";
        phone=0;
        roll="";
    }

    Contact(String roll){
        address="";
        phone=0;
        roll=roll;
    }

    Contact(String add,int phone, String roll){
        address = add;
        phone = phone;
        roll=roll;
    }

    public void setDetails(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the address : ");
        address=s.nextLine();
        System.out.print("Enter phone number : ");
        phone=s.nextInt();
        System.out.println();
        roll = roll;
    }


    public String getAddress(){
        return address;
    }

    public int getPhone(){ return phone; }

    public String getRollno(){ return roll; }


    public boolean equals(Contact c){
        return this.address.trim().equals(c.address.trim());
    }

    public String toString(){
        return roll+"\t"+address+"\t"+phone;
    }

    public void print_contact(){
        System.out.println("+-------------------------------------------+");
        System.out.println(String.format("|  Address: %-30s |\n|  Phone number: %-30d |",address,phone));
        System.out.println("|-------------------------------------------|");
    }

}
