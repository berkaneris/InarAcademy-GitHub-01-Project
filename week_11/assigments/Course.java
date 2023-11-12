package week_11.assigments;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students= new ArrayList<>();

    public Course(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void addStudent(String student){
        students.add(student);
    }
    public void dropStudent(String student){
        students.remove(student);
    }
    public ArrayList<String> getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return students.size();
    }
}
// You can improve the class by automatically increasing the array size
