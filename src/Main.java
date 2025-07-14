import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        StudyCenter studyCenter = new StudyCenter();
        Commands commands = new Commands();
        System.out.print("O'quv markaz nomini kiriting: ");
        studyCenter.setName(scannerStr.nextLine());
        System.out.print("O'quv markaz muvoffiqiyatli yartildi: ");
        System.out.println();

        while (true) {
            commands.StartCommand();
            switch (scannerInt.nextInt()) {
                case 1:
                    studyCenter.createGroup();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("xato Raqam Kiritildi: ");
            }
        }

    }
}