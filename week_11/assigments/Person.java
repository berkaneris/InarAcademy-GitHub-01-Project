package week_11.assigments;

import week_10.assigments.MyDate;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person() {
        this.name = "null";
        this.address = "null";
        this.phoneNumber = "null";
        this.emailAddress = "null";
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "     _Person_" +
                "\nName: " + name +
                "\nAddress: " + address +
                "\nPhone number: " + phoneNumber +
                "\nEmail address: " + emailAddress;
    }

}

class Student extends Person {
    private final String STATUS;

    public Student() {
        this.STATUS = "Freshman";
    }

    public Student(String name) {
        super(name);
        this.STATUS = "Freshman";

    }

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.STATUS = status;
    }

    public String getSTATUS() {
        return STATUS;
    }

    @Override
    public String toString() {
        return "     _Student_" +
                "\nName: " + this.getName() +
                "\nAddress: " + this.getAddress() +
                "\nPhone number: " + this.getPhoneNumber() +
                "\nEmail address: " + this.getEmailAddress() +
                "\nclassStatus: " + STATUS;
    }
}

class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee() {
        this.office = "";
        this.dateHired = new MyDate();
    }

    public Employee(String name) {
        super(name);
        this.office = "";
        this.dateHired = new MyDate();
    }

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "     _Employee_" +
                "\nName: " + this.getName() +
                "\nAddress: " + this.getAddress() +
                "\nPhone number: " + this.getPhoneNumber() +
                "\nEmail address: " + this.getEmailAddress() +
                "\noffice: " + office +
                "\nsalary: " + salary +
                "\nhiredDate: " + dateHired.toString();
    }
}

class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty() {
        this.rank = "";
    }

    public Faculty(String name) {
        super(name);
        this.rank = "";
    }

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "     _Faculty_" +
                "\nName: " + this.getName() +
                "\nAddress: " + this.getAddress() +
                "\nPhone number: " + this.getPhoneNumber() +
                "\nEmail address: " + this.getEmailAddress() +
                "\noffice: " + this.getOffice() +
                "\nsalary: " + this.getSalary() +
                "\nhiredDate: " + this.getDateHired().toString() +
                "\nofficeHours: " + officeHours +
                "\nrank: " + rank;
    }

}

class Staff extends Employee {
    private String title;

    public Staff() {
        this.title = "";
    }

    public Staff(String name) {
        super(name);
        this.title = "";
    }

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, String title) {
        super(name, address, phoneNumber, email, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "     _Staff_" +
                "\nName: " + this.getName() +
                "\nAddress: " + this.getAddress() +
                "\nPhone number: " + this.getPhoneNumber() +
                "\nEmail address: " + this.getEmailAddress() +
                "\noffice: " + this.getOffice() +
                "\nsalary: " + this.getSalary() +
                "\nhiredDate: " + this.getDateHired().toString() +
                "\ntitle: " + title;

    }
}
