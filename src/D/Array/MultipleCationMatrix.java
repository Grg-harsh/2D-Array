package D.Array;

import java.util.Scanner;

public class MultipleCationMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter row and colomn");
        int nr1 = scn.nextInt();
        int nc1 = scn.nextInt();
        int[][] a = new int[nr1][nc1];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter row and colomn");
        int nr2 = scn.nextInt();
        int nc2 = scn.nextInt();
        int[][] b = new int[nr2][nc2];
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                b[i][j] = scn.nextInt();
            }
        }
        multiplication(nr1,nc1,a,nr2,nc2,b);
    }
    public static void multiplication(int nr1, int nc1 ,int[][] a,int nr2, int  nc2, int[][] b){
        int[][] ans = new int[nr1][nc2];
        if(nc1 == nr2){
            for(int i = 0; i < ans.length;  i++){
                for(int j = 0; j < ans[i].length; j++){
                    for(int k = 0; k < nc1; k++){
                        ans[i][j] = ans[i][j] + (a[i][k]*b[k][j]);
                    }
                }
            }
        }
        else{
            System.out.println("Invalid");
        }
        System.out.println("Matrix is----");
        for(int idx = 0; idx < ans.length; idx++){
            for(int i = 0; i < ans[idx].length; i++){
                System.out.print(ans[idx][i]+"\t");
            }
            System.out.println();
        }
    }
}
