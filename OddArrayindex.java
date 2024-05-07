import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddArrayindex {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6,7,8,9,10};
        int[] odd = oddIndex(arrays);
        System.out.println(Arrays.toString(odd));

    }

    public static int[] oddIndex(int[] arr){
        List<Integer> result = new ArrayList<>();
        for(int a = 0; a < arr.length; a += 1 ){
            if (a % 2 != 0) {
                result.add(arr[a]);
            }
        }

        int[] newArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            newArray[i] = result.get(i);
        }
        return newArray;

    }


}