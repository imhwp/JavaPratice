package 笔试.拼多多;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[10];
        for(int i=0;i<10;i++){
            count[i]=sc.nextInt();
        }
        int multi = 1;
        //十个数字
        for(int i=9;i>=0;i++){
            if(count[i]==0) continue;
            if(count[i]==1){
                //考虑与前面的数组合
            }
        }
    }
}
