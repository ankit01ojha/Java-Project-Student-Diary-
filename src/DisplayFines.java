public class DisplayFines extends FinesManipulation{
    public String roll;

    DisplayFines(String roll){
        this.roll = roll;
        displayFines(roll);
    }

    public void displayFines(String roll){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        FinesManipulation sm = new FinesManipulation();
        sm.search_by_roll(roll);

    }
}
