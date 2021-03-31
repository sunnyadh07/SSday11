public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Samantha", "Baniya", "samantha@gmail", "samantha01", "dsfsd", 1, 10);

        teacher.absentDays(3);
        //teacher.getPtoDays();
        System.out.println(teacher.getPtoDays());
        System.out.println(teacher.getAbsences());

        System.out.println("Admin information");

        Admin admin = new Admin("Blake", "Lively", "blake@gmail.com", "blake001", "blake05", 3, 20);
        admin.absentDays(3);
        System.out.println(admin.getAbsences());

    }
}
