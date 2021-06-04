import java.util.ArrayList;
public class BasicJavaTest{
    
    public static void main(String[] args) {
        BasicJava basic = new BasicJava();

        basic.printAndSumTo255();

        System.out.println();
        
        ArrayList<Object> x = new ArrayList<Object>();
        x.add(2);
        x.add(4);
        x.add("YeET");
        basic.interateThroughArray(x);
        int[] arr = {2,3,3,4};
        basic.interateThroughArray(arr);
        
        System.out.println();
        
        int[] arr1 = {4,9,2,1,-5,7};
        System.out.println(basic.findMax(arr1));
        int[] arr2 = {-3,-5,-7};
        System.out.println(basic.findMax(arr2));

        System.out.println();

        System.out.println(basic.arrayOfOdds());
        
        System.out.println();

        System.out.println(basic.greatorThanY(new int[] {2,6,3,8,4},4));
        System.out.println(basic.greatorThanY(new int[] {2,6,3,8,4},1));

        System.out.println();

        System.out.println(basic.sqaureTheValues(new int[] {1,5,10,-2}));
        
        System.out.println();
        
        System.out.println(basic.maxMinAverage(new double[] {1,2,3,4,5}));
        
        System.out.println();

        System.out.println(basic.shift(new int[] {1,5,10,7,-2}));
        
    }

}