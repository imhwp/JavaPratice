package 笔试.拼多多;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//表示有N条线段
        int[][] arrs = new int[n][2];
        for(int i=0;i<n;i++){
            arrs[i][0] = scanner.nextInt();
            arrs[i][1] = scanner.nextInt();
        }
        Arrays.sort(arrs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        //arrs以左端点升序排序
        //两个数组有如下情况
        //[a1,b1] [a2,b2]
        /**
         * 1. a1=b1,则两个数组肯定满足要求
         * 2. a1<b1,看b1，b2 关系 ，如果b1大于b2 则1包含2 否则不包含
         */
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int[] arr1=arrs[i];
                int[] arr2=arrs[j];
                if(arr1[0]==arr2[0]) {
                    System.out.println("true");
                    return;
                }
                if(arr1[0]<arr2[0] && arr1[1]>=arr2[1]) {
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }
}
