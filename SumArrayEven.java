import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumArrayEven {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6,7,8,9,10};
        int[] even = evenIndex(arrays);
        System.out.println(Arrays.toString(even));
        int sum = evenSum(arrays);
        System.out.println(sum);
    }
    public static int[] evenIndex(int[] arr){
        List<Integer> result = new ArrayList<>();
        for(int a = 0; a < arr.length; a += 2 ){
                result.add(arr[a]);
        }
        int[] newArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            newArray[i] = result.get(i);
        }
        return newArray;

    }


    public static int evenSum(int[] arr){
        int sum = 0;
        int[] totalSum = evenIndex(arr);
        for(int a=0;a < totalSum.length; a++){
            sum += totalSum[a];
        }


        return sum;
    }
}