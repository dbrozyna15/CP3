import java.util.*;

public class ScoringSystem
{
    int[] scores;
    int result;
    
    public ScoringSystem(int[] scores) {
        this.scores = scores;
    }
    
    public String toString() {
        return "Result for scores " + Arrays.toString(this.scores) + ": " +
        Float.toString(calculate(this.scores));
    }
    
    
    public float calculate(int[] arr) {
        float sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        
        return sum / arr.length; 
    }
    
    public static void main(String[] args) {
        int[] competitor1 = {1, 2, 3, 4, 5};
        int[] competitor2 = {12, 4, 9, 2, 1};
        int[] competitor3 = {1, 11, 1, 21, 7};
        
        ScoringSystem s1 = new ScoringSystem(competitor1);
        ScoringSystem s2 = new ScoringSystem(competitor2);
        ScoringSystem s3 = new ScoringSystem(competitor3);
        
        System.out.println(s1 + "\n" + s2 + "\n" + s3);
    }
}
