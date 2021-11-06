public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();

        
        stu1.age = 10;
        stu1.name = "Mariusz";
        stu1.sayHello();
        stu1.displayAge();
        stu1.displayName();


        stu2.age = 15;
        stu2.name = "Maciej";
        stu2.sayHello();
        stu2.displayAge();
        stu2.displayName();


        stu3.age = 10;
        stu3.name = "Mateusz";
        stu3.sayHello();
        stu3.displayAge();
        stu3.displayName();
    }
}
