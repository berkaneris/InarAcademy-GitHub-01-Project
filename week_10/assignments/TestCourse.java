package week_10.assigments;

public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");

        course.addStudent("Özgür Kartal");
        course.addStudent("Bilal Topal");
        course.addStudent("Ada Kaya");
        course.addStudent("Besim Karabıyık");
        course.addStudent("Emir Uyanık");

        String[] students = course.getStudents();

        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }
        System.out.println("-----------------------");
        course.dropStudent("Bilal Topal");
        course.dropStudent("Emir Uyanık");
        System.out.println();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }
        System.out.println("-----------------------");

    }
}
