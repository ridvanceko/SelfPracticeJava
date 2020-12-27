package Arrays;
import java.util.Arrays;
public class DimensionArrayTask {

    public static void main(String[] args) {

        int [] [] nums  = { {1,2,3,4}, {5,6,7,8} };  //--> { {4,3,2,1}, {8,7,6,5} }
                                                     // { {8,7,6,5}, {4,3,2,1} }


        for(int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums[i].length/2; k++) {

                int swap = nums[i][k];
                nums[i][k] = nums[i][nums[i].length-k-1];
                nums[i][nums[i].length-k-1]=swap;
            }
            System.out.println(Arrays.toString(nums[i]));
        }
        for(int i = 0; i < nums.length/2; i++) {
            {

                int [] swap = nums[i];
                nums[i] = nums[nums.length-1-i];
                nums[nums.length-1-i]=swap;
            }
            System.out.println(Arrays.toString(nums[0]));
            System.out.println(Arrays.toString(nums[1]));
        }

    }
}
