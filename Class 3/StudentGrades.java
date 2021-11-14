import java.util.stream.*;
import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
    String studentName;
    int gradeCount;
    double[] grades;
    
    StudentGrades(String name, int gradeCount) {
        this.studentName = name;
        this.gradeCount = gradeCount;
        this.grades = new double[gradeCount];
        
        Random rand = new Random();
        for (int i = 0; i < grades.length; i++) {
            grades[i] = rand.nextDouble() * 4 + 1;
        }
        
        System.out.println(Arrays.toString(grades));
    }
    
    public double lowestGrade() {
        return getMin(grades);
    }
    
    public double highestGrade() {
        return getMax(grades);
    }
    
    public int countGrades() {
        return grades.length;
    }
    
    public double gradePointAverage() {
        return DoubleStream.of(grades).sum() / grades.length;
    }
    
    public void recordMessage() {
        System.out.println(String.format(
            "Name: %s\n"
            + "Grades: %s\n"
            + "Number of grades: %d\n"
            + "Lowest grade: %f\n"
            + "Highest grades: %f\n"
            + "GPA: %f\n",
            
            studentName,
            Arrays.toString(grades),
            countGrades(),
            lowestGrade(),
            highestGrade(),
            gradePointAverage()
        ));
    }
    
    public static double getMin(double[] inputArray) {
        double minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) { 
                minValue = inputArray[i]; 
            }
        } 
        return minValue; 
    }
    
    public static double getMax(double[] inputArray) {
        double maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) { 
                maxValue = inputArray[i]; 
            }
        } 
        return maxValue; 
    }
    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        
        Random rand = new Random();
        
        StudentGrades s1 = new StudentGrades(name, 10);
        s1.recordMessage();
    }
    
}
