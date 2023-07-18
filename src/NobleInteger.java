import java.util.Arrays;
import java.util.Scanner;

public class NobleInteger {
    static int noble(int arr[], int n) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == (n-i-1)){
                count ++;
            }

        }
        if(count > 0){
            return count;
        }else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(noble(array, n));
    }
}
