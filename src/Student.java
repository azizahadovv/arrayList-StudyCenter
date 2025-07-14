import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private Country country;
    private ArrayList<Payment> payments = new ArrayList<>();

    private Scanner scannerStr = new Scanner(System.in);
    private Scanner scannerInt = new Scanner(System.in);


    public Student(int id, String name, Country country, ArrayList<Payment> payments) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.payments = payments;
    }

    Student() {
    }

    ;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }
}
