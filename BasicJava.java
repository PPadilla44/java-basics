import java.util.ArrayList;
public class BasicJava{

    public void printAndSumTo255() {
        int sum = 0;
        for(int i = 0; i < 256; i++){
            sum+=i;
            System.out.println("new number: " + i + " Sum: " + sum);
        }
    }

    public void interateThroughArray(ArrayList<Object> array){
        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }
    public void interateThroughArray(int[] array){
        for(int i : array){
            System.out.println(i);
        }
    }

    public int findMax(int[] array) {
        int max = array[0];
        for(int i : array) {
            if(max < i){
                max = i;
            }
        }
        return max;
    }

    public ArrayList<Integer> arrayOfOdds(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i < 256; i+=2){
            y.add(i);
        }
        return y;
    }

    public int greatorThanY(int[] arrayInput, int numInput){
        int count = 0;
        for(int i : arrayInput){
            if(i > numInput){
                count++;
            }
        }
        return count;
    }

    public ArrayList<Integer> sqaureTheValues(int[] inputArray) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        for(int i : inputArray){
            x.add((int)(Math.pow(i,2)));
        }
        return x;
    }

    public ArrayList<Double> maxMinAverage(double[] inputArray) {
        ArrayList<Double> result = new ArrayList<Double>(); 
        double max = inputArray[0];
        double min = inputArray[0];
        double sum = 0;
        
        for(double i : inputArray){
            if(max < i){
                max = i;
            }
            if(min > i) {
                min = i;
            }
            sum += i;
        }
        
        sum = sum/inputArray.length;
        
        result.add(max);
        result.add(min);
        result.add(sum);

        return result;
    }


    public ArrayList<Integer> shift(int[] inputArray) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 1; i < inputArray.length; i ++){
            result.add(inputArray[i]);
        }
        result.add(inputArray[0]);
        return result;
    }

}