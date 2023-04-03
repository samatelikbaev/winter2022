public class SomeClass {
    public static int countEvens(int[] nums) {
        int s=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]%2==0) s++;
        }
        return s;
    }
    public static int sumDouble(int a, int b) {
        if (a!=b){
            return a+b;
        }
        return 2*(a+b);
    }
}

