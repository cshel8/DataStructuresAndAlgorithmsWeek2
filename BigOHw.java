import java.util.Arrays;
public class BigOHw {
    public static void main(String[] args) {
        int[] test = {bigO_1(100), bigO_LogN(100), bigO_N(100), bigO_NLogN(100), bigO_Squared(100), bigO_2_Powered(100), bigO_Factorial(100)};
        System.out.println(Arrays.toString(test));
        sSort(test);
        System.out.println(Arrays.toString(test));
    }
    private static int bigO_1(int input){
        return 1;
    }
    private static int bigO_LogN(int input){
        return (int)Math.log(input);
    }
    private static int bigO_N(int input){
        return input;
    }
    private static int bigO_NLogN(int input) {
        return (int) (input * Math.log(input));
    }
    private static int bigO_Squared(int input) {
        return input * input;
    }
    private static int bigO_2_Powered(int input) {
        return (int) (Math.pow(2, input));
    }
    private static int bigO_Factorial(int input) {
        int factorial = 1;
        for (int s = input; s > 0; s--) {
            factorial *= s;
        }
        return factorial;
    }
    private static void sSort(int[] test){
        for (int i = 0; i < test.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < test.length; j++) {
                if (test[j] < test[minIdx])
                    minIdx = j;
                }
            if (minIdx != i) {
                int tempTest = test[minIdx];
                test[minIdx] = test[i];
                test[i] = tempTest;
            }
        }
    }
}
