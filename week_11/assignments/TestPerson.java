package week_11.assigments;



public class TestPerson {
    public static void main(String[] args) {

        Person person = new Person("Gurol" , "Istanbul" , "9999999999" , "gurol@inar.com");
        Student student = new Student("Nafiz" , "Ankara" , "3333333333" , "nafiz0@gmail.com" , "0");
        Employee employee = new Employee("Recai" , "İstanbul" , "6666666666" , "recai@gmail.com" , "910" , 60000.0);
        Faculty faculty = new Faculty("Serhat" , "Texas, Dallas" , "4133333333" , "serhat@inar.com" , "101" , 50000.0 , "'10am to 6pm'" , "'manager'");
        Staff staff = new Staff("Elon" , "California" , "2030222220" , "elon@musk.com" , "12" , 6005000.0 , "'CEO'");

        System.out.println(person + "\n\n" + student + "\n\n" + employee + "\n\n" + faculty + "\n\n" + staff);




    }
}
