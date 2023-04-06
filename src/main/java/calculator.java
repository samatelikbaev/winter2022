public class calculator {
    public static void main(String[] args) {

    }

        public static int[] arrayOfMultiples(int num, int length) {
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = num * (i + 1);
            }
            return arr;
        }
    public static int solutions(int a, int b, int c) {
        int D = b*b - 4 * a * c;
        if(D > 0) return 2;
        else if(D == 0) return 1;
        else return 0;
    }
    public static int warOfNumbers(int[]numbers){
        int s1=0,s2=0;
        for (int i=0; i<numbers.length;i++){
            if(numbers[i]%2==0)s1=s1+numbers[i];
            if(numbers[i]%2==1)s2=s2+numbers[i];
        }
        return Math.abs(s1-s2);
    }
    public static int[][] squarePatch(int n) {
        int[][] m=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m[i][j]=n;
            }

        }
        return m;
    }

 public static int add(int a, int b){
     return a+b;
 }
}
