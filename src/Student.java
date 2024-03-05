import java.util.Scanner;
import java.util.Arrays;

public class Student {


    Scanner reader = new Scanner(System.in);
    private String studentID;
    private String studentName;
    private String [] extraActivities;


    public Student(String studentID, String studentName, int num) {
        this.studentID = studentID;
        this.studentName = studentName;
        extraActivities = new String[num];
    }

    // public Employee(){}

    
    

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getExtraActivities(int index) {
        return extraActivities[index];
    }

    public void setExtraActivities(int index, String activity) {
        this.extraActivities[index] = activity;
        
    }

    public void addExtraActivities(int num){
        for(int i=0; i<num ; i++){
            System.out.println("Enter the extra activity #"+(i+1));
            String activity = reader.nextLine();
            setExtraActivities(i, activity);
        }
    }

    @Override
    public String toString() {
        
        return "Student ID: " + getStudentID() + "\n" + 
        "Student Name: " + getStudentName() + "\n" + 
        "Student activities:" + Arrays.toString(extraActivities) + "\n";
    }
}

