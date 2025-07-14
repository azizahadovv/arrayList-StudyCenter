import java.util.ArrayList;
import java.util.Scanner;

public class Group {
    private int GroupId;
    private int studentIdIncrement = 1;
    private String GroupName;
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scannerStr = new Scanner(System.in);
    private Scanner scannerInt = new Scanner(System.in);
    private Student student = new Student();
    private Country country = new Country();

    public void createStudent() {
        student.setId(studentIdIncrement++);
        System.out.print("Talaba Isim Familiyasini kiriting: ");
        student.setName(scannerStr.nextLine());
        System.out.print("Talaba Mamlakatini  kiriting: ");
        country.setCountry(scannerStr.nextLine());
        System.out.print("Talaba Viloyatini kiriting: ");
        country.setRegion(scannerStr.nextLine());
        System.out.print("Talaba Shaxrini kiriting: ");
        country.setCity(scannerStr.nextLine());
        student.setCountry(country);

        students.add(student);
        System.out.println("Talaba qo'shildi");

    }


    public Group(int groupId, String groupName, ArrayList<Student> students) {
        GroupId = groupId;
        GroupName = groupName;
        this.students = students;
    }

    Group() {
    }

    public int getGroupId() {
        return GroupId;
    }

    public void setGroupId(int groupId) {
        GroupId = groupId;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
