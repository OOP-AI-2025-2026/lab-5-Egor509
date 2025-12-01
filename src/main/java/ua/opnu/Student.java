package ua.opnu;

public class Student extends Person {
    private String group;
    private String studentTicketNumber;

    public Student(String lastName, String firstName, int age, String group, String studentTicketNumber) {
        super(lastName, firstName, age);
        this.group = group;
        this.studentTicketNumber = studentTicketNumber;
    }

    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }

    public String getStudentTicketNumber() { return studentTicketNumber; }
    public void setStudentTicketNumber(String number) { this.studentTicketNumber = number; }

    @Override
    public String toString() {
        return "Студент групи " + group + ", " + getLastName() + " " + getFirstName() +
                ", вік: " + getAge() + ". Номер студентського квитка: " + studentTicketNumber;
    }
}