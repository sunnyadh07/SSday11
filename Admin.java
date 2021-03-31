public class Admin extends User{
    public int ptoDays = 20;

    public Admin(String firstName, String lastName, String email, String username, String password, int absences, int ptoDays) {
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

        System.out.println("You have  " + ptoDays + "  PTO days left.");
        System.out.println("you have been absent for  " +  absentDays + "days");
    }
}
