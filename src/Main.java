import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner reader = new Scanner(System.in);

        System.out.println("How many Student details you want to add?");
        int count = reader.nextInt();
        reader.nextLine(); 

        Student [] students = new Student[count];// Initializing my object array

        for(int i=0; i<count; i++){
            System.out.println("Enter the Student ID:");
            String id = reader.nextLine();

            System.out.println("Enter the Student name:");
            String name = reader.nextLine();

            System.out.println("Enter the number of extra activities the student is engaged in:");
            int num = reader.nextInt();
            reader.nextLine();

            students[i] = new Student(id, name, num);
            
            students[i].addExtraActivities(num);
        }

        System.out.println("\n" + "The student details are:");

        for(int i=0; i<count; i++){
            System.out.println(students[i]);
        }

        reader.close();

    }
}
