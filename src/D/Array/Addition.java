package D.Array;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter rows and colom");
        int nr1 = scn.nextInt();
        int nc1 = scn.nextInt();
        int [][]arr1 = new int[nr1][nc1];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                arr1[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter rows and colom");
        int nr2 = scn.nextInt();
        int nc2 = scn.nextInt();
        int [][]arr2 = new int[nr2][nc2];
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                arr2[i][j] = scn.nextInt();
            }
        }
        int [][]arr3 = new int[nr1][nc1];
        if((nr1 == nr2) || (nc2==nc2)) {
            for (int i = 0; i < arr3.length; i++) {
                for (int j = 0; j < arr3[i].length; j++) {
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        }else{
            System.out.println("Invalid");
        }
        for(int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3[i].length; j++){
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
