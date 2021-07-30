package 笔试.拼多多;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //最开始只有A
        //X+B成立,X+C成立
        //则有 对任意的数 有 M = A + xB+yC;
        //只要x和y存在即可
        //属于返回1，否则返回0
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arrs = new int[n][4];
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                arrs[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(isContained(arrs[i][0],arrs[i][1],arrs[i][2],arrs[i][3]));
        }
    }

    public static int isContained(int a,int b,int c,int target){
        return target%2==0?1:0;
    }
}
