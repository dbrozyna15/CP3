public class Student
{
    String name;
    int age;
    String idCard;
    boolean isIdCardValid;
    int semesterNo;
    float avgGrade;
    
    public void sayHello() {
        System.out.println("Hello!");
    }
    
    public void displayName() {
        System.out.println("Name: " + name);
    }
    
    public void displayAge() {
        System.out.println("Age: " + age);
    }
    
    public void displayInfo() {
       System.out.println(
       "Name: " + age +
       "\nSemester: " + semesterNo +
       "\nAverage grade: " + avgGrade
       ); 
    }
    
    public void changeIdCardStatus() {
        isIdCardValid = !isIdCardValid;
    }
}
