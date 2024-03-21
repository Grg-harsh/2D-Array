package D.Array;
import java.util.Scanner;
public class ReverseMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Matrix!! Enter rows and colomn");
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = new int[r][c];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for(int idx = 0 ;idx < arr.length; idx++){
            int low =  0;
            int high = arr[0].length-1;
            while(low <= high){
                int temp = arr[idx][low];
                arr[idx][low] = arr[idx][high];
                arr[idx][high] = temp;
                low++;
                high--;
            }
        }
        System.out.println("Matrix After reverse");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
