import java.util.ArrayList;
import java.util.Scanner;

public class Group {
    private int GroupId;
    private String GroupName;
    private ArrayList<Student> students;

    private Scanner scannerStr = new Scanner(System.in);
    private Scanner scannerInt = new Scanner(System.in);

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
