package week_13.assignments.Question_13_13;



public class TestCourse {
    public static void main(String[] args) {
        // This class not in the homework
        Course course1 = new Course("Inar Academy");
        course1.addStudent("Burak");
        course1.addStudent("Emre");
        course1.addStudent("Furkan");
        course1.addStudent("Jack");

        System.out.printf("Course Name:\"%s\"\n\n" , course1.getCourseName());
        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        printStudents(course1.getStudents() , course1.getNumberOfStudents());
        System.out.println("-----------------------------------");
        try {
            Course course2 = (Course) course1.clone();
            course2.addStudent("Jonny");
            course2.addStudent("Tonny");
            System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
            printStudents(course2.getStudents() , course2.getNumberOfStudents());
        }catch (CloneNotSupportedException ex){
            System.out.println("The clone process is fail");
        }
    }
    public static void printStudents(String[] students , int numberOfStudents){
        for (int i = 0; i < numberOfStudents; i++){
            if(i != numberOfStudents - 1) {
                System.out.print(students[i] + ", ");
            }else{
                System.out.println(students[i]);
            }
        }
    }
}
