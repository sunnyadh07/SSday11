public class Teacher extends User{
    public int ptoDays = 10;

    public Teacher(String firstName, String lastName, String email, String username, String password, int absences, int ptoDays) {
        super(firstName, lastName, email, username, password, absences);
        this.ptoDays = ptoDays;
    }

    public int getPtoDays() {
        return ptoDays;
    }

    public void setPtoDays(int ptoDays) {
        this.ptoDays = ptoDays;
    }

    @Override
    public void absentDays(int absentDays) {
        ptoDays -= absentDays;
        absentDays++;
        System.out.println("You have " + ptoDays + " absent days left");
    }
}
