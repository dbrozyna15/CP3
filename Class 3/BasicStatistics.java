/*
Create a library of methods for the calculation of basic statistics:

a. Number of items within the specified range <x,y>
b. Sum of numbers in the given range <x,y>
c. Arithmetic mean of the numbers in the given range <x,y>

Then create a program that calculates and displays the basic statistics for integers in the range <5,10>
*/
public class BasicStatistics
{
    /**
     * @return  <start, end>
     */
    public static int countBetween(int start, int end) {
        return end - start + 1;
    }
    
    /**
     * @return  <start, end>
     */
    public static int sumBetween(int start, int end) {
        int res = 0;
        for (int i = start; i < end + 1; i++) {
            res += i;
        }
        return res;
    }
    
    /**
     * @return float arithmeticMean
     */
    public static float meanBetween(int start, int end) {
        float sum = BasicStatistics.sumBetween(start, end);
        float count = BasicStatistics.countBetween(start, end);
        return sum / count;
    }
    
}
