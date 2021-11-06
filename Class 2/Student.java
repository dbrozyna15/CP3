public class Student {

    String name;
    int age;
    String idCard;
    boolean auth;
    int semesterNumber;
    float avgGrade;

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void displayName() {
        System.out.println(name);
    }

    public void displayAge() {
        System.out.println(age);
    }

    public void displayStudentsInfo() {
        System.out.println(name +"\n"+ semesterNumber +"\n"+ avgGrade);
    }

    public void changeStatus() {
        auth = !auth;
    }

    public void displayInfoAndValidation() {
        System.out.println(name +"\n"+ idCard +"\n"+ auth);
    }
}
