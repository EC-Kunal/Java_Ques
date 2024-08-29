// FIND THE SUM OF ALL ELEMENTS OF THE ARRAY

public class Ques12 {
    static int sumOfElements(int[] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int sum = arr[idx] + sumOfElements(arr, idx+1);
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(sumOfElements(arr, 0));
    }
}
