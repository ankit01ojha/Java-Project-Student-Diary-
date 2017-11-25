public class DisplayContact extends ContactManipulation{
    public String roll;

    DisplayContact(String roll){
        this.roll = roll;
        displayContact(roll);
    }

    public void displayContact(String roll){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        ContactManipulation sm = new ContactManipulation();
        sm.search_by_roll(roll);

    }
}
