package 笔试.拼多多;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ddcArr = new int[n];
        int[] dddArr = new int[n];
        for(int i=0;i<n;i++){
            ddcArr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            dddArr[i]=sc.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();//用于存储卡牌第一次出现时对应的位置
        List<Integer> list = new ArrayList<>();//用于存储游戏中的卡牌
        int ddcIndex=0;
        int dddIndex=0;
        int ddcCount=0,dddCount=0;
        while(ddcIndex<n || dddIndex<n){
            //两个人至少还有一个人有牌
            while (ddcIndex<n){
                //ddc出牌
                int temp = ddcArr[ddcIndex];
                list.add(temp);
                if(map.containsKey(temp)){
                    int prePos = map.get(temp);
                    int len = list.size()-prePos+1;
                    ddcCount+=len;
                    while (len>0){
                        map.remove(list.get(list.size()-1));
                        list.remove(list.size()-1);
                        len--;
                    }
                    ddcIndex++;

                }else{
                    map.put(temp,list.size());
                    ddcIndex++;
                    break;
                }

            }

            while (dddIndex<n){
                //ddd出牌
                int temp = dddArr[dddIndex];
                list.add(temp);
                if(map.containsKey(temp)){
                    int prePos = map.get(temp);
                    int len = list.size()-prePos+1;
                    dddCount+=len;
                    while (len>0){
                        map.remove(list.get(list.size()-1));
                        list.remove(list.size()-1);
                        len--;
                    }
                    map.remove(temp);
                    dddIndex++;
                }else{
                    map.put(temp,list.size());
                    dddIndex++;
                    break;
                }

            }
        }

        //两个都没有牌，则开始分牌
        for(int i:list){
            if(i%2==0){
                dddCount++;
            }else{
                ddcCount++;
            }
        }

        System.out.println(ddcCount+" "+dddCount);

    }
}
