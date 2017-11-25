public class DisplayAttendance extends AttendanceManipulation{
    public String roll;

    DisplayAttendance(String roll){
        this.roll = roll;
        displayAttendance(roll);
    }

    public void displayAttendance(String roll){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        AttendanceManipulation sm = new AttendanceManipulation();
        sm.search_by_roll(roll);

    }
}
