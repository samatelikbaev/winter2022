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

 public static int add(int a, int b){
     return a+b;
 }
}
