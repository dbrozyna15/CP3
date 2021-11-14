public class Person
{
    private String name;
    private float weight;
    private float height;
    
    public Person(String name) {
        this.name = name;
    }
    
    public Person(String name, float weight, float height) {
        this.name = name;
        setWeightAndHeight(weight, height);
    }
    
    public void setWeightAndHeight(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }
    
    public float calculateBMI() {
        return (this.weight / (this.height * this.height)) * 10000;
    }
    
    public String displayBmiMessage() {
        float bmi = this.calculateBMI();
        if (bmi < 18.5) {
            return "BMI too low " + '(' + bmi + ')';
        } else if (bmi > 24.9) {
            return "BMI too high " + '(' + bmi + ')';
        } else {
            return Float.toString(bmi);
        }
    }
    
    public void displayRecord() {
        System.out.println(
            "\nName: " + this.name +
            "\nWeight :" + this.weight + 
            "\nHeight: " + this.height +
            "\nBMI: " + this.displayBmiMessage()
        );
    }
    
    public static void main(String[] main) {
        Person[] people = new Person[3];
        
        people[0] = new Person("Mark", 75, 183);
        people[1] = new Person("Marie", 50, 165);
        people[2] = new Person("Jerry", 100, 179);
        
        for (Person person : people) {
            person.displayRecord();   
        }
    }
}
