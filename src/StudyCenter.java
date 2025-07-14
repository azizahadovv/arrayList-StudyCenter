import java.util.ArrayList;
import java.util.Scanner;

public class StudyCenter {
    private String name;
    private int groupIdIncrement = 1;
    private ArrayList<Group> groups = new ArrayList<>();
    private Scanner scannerStr = new Scanner(System.in);
    private Scanner scannerInt = new Scanner(System.in);
    private Group group = new Group();
    private Commands commands = new Commands();


    public void createGroup() {
        group.setGroupId(groupIdIncrement++);
        System.out.print("Guruh Nomi: ");
        group.setGroupName(scannerStr.nextLine());
        this.groups.add(group);
        System.out.println("Guruh yaratildi: ");
        showGroups();
        commands.AddStudentCommand();
        this.group.createStudent();


    }

    private void showGroups() {
        for (int i = 0; i < this.groups.size(); i++) {
            System.out.println(groups.get(i).getGroupId() + ". " + groups.get(i).getGroupName());
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


