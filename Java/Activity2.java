import java.lang.reflect.Array;

public class Activity2 {
    public static void main(String[] args){
        int nums[] = {10, 77, 10, 54, -11, 10};
        int sum = 0;
        for (int i=0;i < nums.length; i++)
        {
            if (nums[i] % 10 == 0){
                sum += nums[i];
            }
        }
        if (sum == 30){
            System.out.println("True" );
        }
        else {
            System.out.println("False");
        }
    }
}
